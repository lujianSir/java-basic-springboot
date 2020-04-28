package com.item.service;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.activiti.bpmn.model.BpmnModel;
import org.activiti.bpmn.model.FlowNode;
import org.activiti.bpmn.model.SequenceFlow;
import org.activiti.engine.HistoryService;
import org.activiti.engine.IdentityService;
import org.activiti.engine.ProcessEngine;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.history.HistoricActivityInstance;
import org.activiti.engine.history.HistoricProcessInstance;
import org.activiti.engine.history.HistoricTaskInstance;
import org.activiti.engine.history.HistoricVariableInstance;
import org.activiti.engine.impl.identity.Authentication;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Comment;
import org.activiti.engine.task.Task;
import org.activiti.image.ProcessDiagramGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.item.entity.ExcelManage;
import com.item.entity.VacComment;
import com.item.entity.VacTask;
import com.item.entity.Vacation;
import com.item.mapper.ExcelMapper;
import com.item.tool.ActivitiUtil;
import com.item.tool.Utils;

@Service
public class VacationServiceImpl implements VacationService {

	@Autowired
	private ExcelMapper excelMapper;

	@Autowired
	private RuntimeService runtimeService;

	@Autowired
	private TaskService taskService;

	@Autowired
	private IdentityService identityService;

	@Autowired
	private HistoryService historyService;

	@Autowired
	private RepositoryService repositoryService;

	private static final String PROCESS_DEFINE_KEY = "vacationProcess";

	// 获取默认的流程引擎
	@Autowired
	private ProcessEngine processEngine;

	@Override
	public boolean startVac(Vacation vac, String userName, String firstName, String secondName, String eid) {
		// TODO Auto-generated method stub

		identityService.setAuthenticatedUserId(userName);
		Map<String, Object> variables = new HashMap<String, Object>();
		variables.put("applyUser", vac.getApplyUser());
		variables.put("title", vac.getTitle());
		variables.put("reason", vac.getReason());
		variables.put("firstName", firstName);
		variables.put("secondName", secondName);
		// 开始流程
		ProcessInstance vacationInstance = runtimeService.startProcessInstanceByKey(PROCESS_DEFINE_KEY, variables);
		// 查询当前任务
		Task currentTask = taskService.createTaskQuery().processInstanceId(vacationInstance.getId()).singleResult();
		// 申明任务
		taskService.claim(currentTask.getId(), userName);

		variables.put("processInstanceId", vacationInstance.getId());

		taskService.complete(currentTask.getId(), variables);

		ExcelManage excelManage = new ExcelManage();
		excelManage.setEid(eid);
		excelManage.setExcelstatus(2);
		excelMapper.updateExcelManage(excelManage);

		return true;
	}

	public void deletProcessInstance(String processInstanceId) {
		runtimeService.deleteProcessInstance(processInstanceId, "删除原因");// 删除流程
		System.out.println("成功");
	}

	@Override
	public List<Vacation> myVac(String userName) {
		List<ProcessInstance> instanceList = runtimeService.createProcessInstanceQuery().startedBy(userName).list();
		List<Vacation> vacList = new ArrayList<>();
		for (ProcessInstance instance : instanceList) {
			Vacation vac = getVac(instance);
			vacList.add(vac);
		}
		return vacList;
	}

	private Vacation getVac(ProcessInstance instance) {
		String reason = runtimeService.getVariable(instance.getId(), "reason", String.class);
		String applyUser = runtimeService.getVariable(instance.getId(), "applyUser", String.class);
		String result = runtimeService.getVariable(instance.getId(), "result", String.class);
		String auditor = runtimeService.getVariable(instance.getId(), "auditor", String.class);
		String auditorremark = runtimeService.getVariable(instance.getId(), "auditorremark", String.class);
		String firstName = runtimeService.getVariable(instance.getId(), "firstName", String.class);
		String secondName = runtimeService.getVariable(instance.getId(), "secondName", String.class);
		String processInstanceId = runtimeService.getVariable(instance.getId(), "processInstanceId", String.class);
		Vacation vac = new Vacation();
		vac.setApplyUser(applyUser);
		vac.setReason(reason);
		vac.setAuditor(auditor);
		vac.setAuditorremark(auditorremark);
		vac.setProcessInstanceId(processInstanceId);
		if (result != null) {
			vac.setResult(Integer.parseInt(result) == 1 ? "审批通过" : "审批驳回");
		}
		Date startTime = instance.getStartTime(); // activiti 6 才有
		vac.setApplyTime(startTime);
		vac.setApplyStatus(instance.isEnded() ? "申请结束" : "等待审批");
		vac.setFirstName(firstName);
		vac.setSecondName(secondName);
		return vac;
	}

	@Override
	public List<VacTask> myAudit(String userName) {
		// TODO Auto-generated method stub
		List<Task> taskList = taskService.createTaskQuery().processDefinitionKey(PROCESS_DEFINE_KEY)
				.taskAssignee(userName).list();
		List<VacTask> vacTaskList = new ArrayList<>();
		for (Task task : taskList) {
			VacTask vacTask = new VacTask();
			vacTask.setId(task.getId());
			vacTask.setName(task.getName());
			vacTask.setCreateTime(task.getCreateTime());
			String instanceId = task.getProcessInstanceId();
			ProcessInstance instance = runtimeService.createProcessInstanceQuery().processInstanceId(instanceId)
					.singleResult();
			Vacation vac = getVac(instance);
			vacTask.setVac(vac);
			vacTaskList.add(vacTask);
		}
		return vacTaskList;
	}

	@Override
	public List<Vacation> myVacRecord(String userName) {
		// TODO Auto-generated method stub
		List<HistoricProcessInstance> hisProInstance = historyService.createHistoricProcessInstanceQuery()
				.processDefinitionKey(PROCESS_DEFINE_KEY).startedBy(userName).finished().orderByProcessInstanceEndTime()
				.desc().list();

		List<Vacation> vacList = new ArrayList<>();
		for (HistoricProcessInstance hisInstance : hisProInstance) {
			Vacation vacation = new Vacation();
			vacation.setApplyUser(hisInstance.getStartUserId());
			vacation.setApplyTime(hisInstance.getStartTime());
			vacation.setApplyStatus("申请结束");
			List<HistoricVariableInstance> varInstanceList = historyService.createHistoricVariableInstanceQuery()
					.processInstanceId(hisInstance.getId()).list();
			ActivitiUtil.setVars(vacation, varInstanceList);
			vacList.add(vacation);
		}
		return vacList;
	}

	@Override
	public boolean passAudit(String userName, VacTask vacTask) {
		// TODO Auto-generated method stub
		String taskId = vacTask.getId();
		// 使用任务id,获取任务对象，获取流程实例id
		Task task = taskService.createTaskQuery().taskId(taskId).singleResult();
		// 利用任务对象，获取流程实例id
		String processInstancesId = task.getProcessInstanceId();

		String result = vacTask.getVac().getResult();
		Map<String, Object> vars = new HashMap<>();
		vars.put("result", result);
		vars.put("auditor", userName);
		vars.put("auditTime", new Date());
		vars.put("auditorremark", vacTask.getVac().getAuditorremark());

		Authentication.setAuthenticatedUserId(userName); // 添加批注时候的审核人，通常应该从session获取
		if (vacTask.getVac().getAuditorremark() != null && !vacTask.getVac().getAuditorremark().equals("")) {
			taskService.addComment(taskId, processInstancesId,
					Utils.getCurrent() + "," + vacTask.getVac().getAuditorremark());// 添加审批的评论
		} else {
			taskService.addComment(taskId, processInstancesId, Utils.getCurrent());// 添加审批的评论
		}

		taskService.complete(taskId, vars);
		return true;
	}

	@Override
	public List<Vacation> myAuditRecord(String userName) {
		// TODO Auto-generated method stub
		List<HistoricProcessInstance> hisProInstance = historyService.createHistoricProcessInstanceQuery()
				.processDefinitionKey(PROCESS_DEFINE_KEY).involvedUser(userName).finished()
				.orderByProcessInstanceEndTime().desc().list();

		List<String> auditTaskNameList = new ArrayList<>();
		auditTaskNameList.add("第一审批人");
		auditTaskNameList.add("第二审批人");
		List<Vacation> vacList = new ArrayList<>();
		for (HistoricProcessInstance hisInstance : hisProInstance) {
			List<HistoricTaskInstance> hisTaskInstanceList = historyService.createHistoricTaskInstanceQuery()
					.processInstanceId(hisInstance.getId()).processFinished().taskAssignee(userName)
					.taskNameIn(auditTaskNameList).orderByHistoricTaskInstanceEndTime().desc().list();
			boolean isMyAudit = false;
			for (HistoricTaskInstance taskInstance : hisTaskInstanceList) {
				if (taskInstance.getAssignee().equals(userName)) {
					isMyAudit = true;
				}
			}
			if (!isMyAudit) {
				continue;
			}
			Vacation vacation = new Vacation();
			vacation.setApplyUser(hisInstance.getStartUserId());
			vacation.setApplyStatus("申请结束");
			vacation.setApplyTime(hisInstance.getStartTime());
			List<HistoricVariableInstance> varInstanceList = historyService.createHistoricVariableInstanceQuery()
					.processInstanceId(hisInstance.getId()).list();
			ActivitiUtil.setVars(vacation, varInstanceList);
			vacList.add(vacation);
		}
		return vacList;
	}

	@Override
	public List<VacComment> auditComment(String processInstanceId) {
		// TODO Auto-generated method stub
		List<VacComment> vacComments = new ArrayList<VacComment>();
		List<Comment> list = taskService.getProcessInstanceComments(processInstanceId);
		for (int i = 0; i < list.size(); i++) {
			Comment comment = list.get(i);
			VacComment vacComment = new VacComment();
			vacComment.setUsername(comment.getUserId());
			String message = comment.getFullMessage();
			if (message != null && !message.equals("")) {
				String[] messages = message.split(",");
				if (messages.length > 1) {
					vacComment.setCommenttime(messages[0]);
					vacComment.setComment(messages[1]);
				} else {
					vacComment.setCommenttime(messages[0]);
				}
			}
			vacComments.add(vacComment);
		}
		return vacComments;
	}

	@Override
	public InputStream getResourceDiagramInputStream(String id) {
		// TODO Auto-generated method stub
		try {
			// 获取历史流程实例
			HistoricProcessInstance historicProcessInstance = historyService.createHistoricProcessInstanceQuery()
					.processInstanceId(id).singleResult();
			// 获取流程中已经执行的节点，按照执行先后顺序排序
			List<HistoricActivityInstance> historicActivityInstanceList = historyService
					.createHistoricActivityInstanceQuery().processInstanceId(id).orderByHistoricActivityInstanceId()
					.asc().list();
			// 构造已执行的节点ID集合
			List<String> executedActivityIdList = new ArrayList<String>();
			for (HistoricActivityInstance activityInstance : historicActivityInstanceList) {
				executedActivityIdList.add(activityInstance.getActivityId());
			}
			// 获取bpmnModel
			BpmnModel bpmnModel = repositoryService.getBpmnModel(historicProcessInstance.getProcessDefinitionId());
			// 获取流程已发生流转的线ID集合
			List<String> flowIds = this.getExecutedFlows(bpmnModel, historicActivityInstanceList);
			// 使用默认配置获得流程图表生成器，并生成追踪图片字符流
			ProcessDiagramGenerator processDiagramGenerator = processEngine.getProcessEngineConfiguration()
					.getProcessDiagramGenerator();
			// 你也可以 new 一个
			// DefaultProcessDiagramGenerator processDiagramGenerator = new
			// DefaultProcessDiagramGenerator();
			InputStream imageStream = processDiagramGenerator.generateDiagram(bpmnModel, "png", executedActivityIdList,
					flowIds, "宋体", "微软雅黑", "黑体", null, 2.0);
			return imageStream;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	private List<String> getExecutedFlows(BpmnModel bpmnModel,
			List<HistoricActivityInstance> historicActivityInstanceList) {
		List<String> executedFlowIdList = new ArrayList<>();
		for (int i = 0; i < historicActivityInstanceList.size() - 1; i++) {
			HistoricActivityInstance hai = historicActivityInstanceList.get(i);
			FlowNode flowNode = (FlowNode) bpmnModel.getFlowElement(hai.getActivityId());
			List<SequenceFlow> sequenceFlows = flowNode.getOutgoingFlows();
			if (sequenceFlows.size() > 1) {
				HistoricActivityInstance nextHai = historicActivityInstanceList.get(i + 1);
				sequenceFlows.forEach(sequenceFlow -> {
					if (sequenceFlow.getTargetFlowElement().getId().equals(nextHai.getActivityId())) {
						executedFlowIdList.add(sequenceFlow.getId());
					}
				});
			} else if (sequenceFlows.size() == 1) {
				executedFlowIdList.add(sequenceFlows.get(0).getId());
			}
		}
		return executedFlowIdList;
	}

}
