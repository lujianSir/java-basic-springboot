package com.item.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class VacationServiceImpl implements VacationService {

//	@Autowired
//	private ExcelMapper excelMapper;
//
//	@Autowired
//	private RuntimeService runtimeService;
//
//	@Autowired
//	private TaskService taskService;
//
//	@Autowired
//	private IdentityService identityService;
//
//	@Autowired
//	private HistoryService historyService;
//
//	@Autowired
//	private RepositoryService repositoryService;
//
//	@Autowired
//	private UserMapper userMapper;
//
//	private static final String PROCESS_DEFINE_KEY = "vacationProcess";
//
//	// 获取默认的流程引擎
//	@Autowired
//	private ProcessEngine processEngine;
//
//	@Override
//	public boolean startVac(Vacation vac, String userName, String firstName, String secondName, String eid) {
//		// TODO Auto-generated method stub
//
//		identityService.setAuthenticatedUserId(userName);
//		Map<String, Object> variables = new HashMap<String, Object>();
//		variables.put("applyUser", vac.getApplyUser());
//		variables.put("title", vac.getTitle());
//		if (vac.getReason() != null && !vac.getReason().equals("")) {
//			variables.put("reason", vac.getReason());
//		} else {
//			variables.put("reason", "");
//		}
//		variables.put("firstName", firstName);
//		variables.put("secondName", secondName);
//		// 开始流程
//		ProcessInstance vacationInstance = runtimeService.startProcessInstanceByKey(PROCESS_DEFINE_KEY, variables);
//		// 查询当前任务
//		Task currentTask = taskService.createTaskQuery().processInstanceId(vacationInstance.getId()).singleResult();
//		// 申明任务
//		taskService.claim(currentTask.getId(), userName);
//
//		variables.put("processInstanceId", vacationInstance.getId());
//
//		taskService.complete(currentTask.getId(), variables);
//
//		ExcelManage excelManage = new ExcelManage();
//		excelManage.setEid(eid);
//		excelManage.setExcelstatus(2);
//		excelMapper.updateExcelManage(excelManage);
//
//		return true;
//	}
//
//	public void deletProcessInstance(String processInstanceId) {
//		runtimeService.deleteProcessInstance(processInstanceId, "删除原因");// 删除流程
//		System.out.println("成功");
//	}
//
//	@Override
//	public List<Vacation> myVac(String userName) {
//		List<ProcessInstance> instanceList = new ArrayList<ProcessInstance>();
//		if (userName.equals("00da3c04c1b14519862301666987bfcd")) {
//			instanceList = runtimeService.createProcessInstanceQuery().list();
//		} else {
//			instanceList = runtimeService.createProcessInstanceQuery().startedBy(userName).list();
//		}
//		// List<ProcessInstance> instanceList =
//		// runtimeService.createProcessInstanceQuery().startedBy(userName).list();
//		List<Vacation> vacList = new ArrayList<>();
//		for (ProcessInstance instance : instanceList) {
//			Vacation vac = getVac(instance);
//			vacList.add(vac);
//		}
//		return vacList;
//	}
//
//	private Vacation getVac(ProcessInstance instance) {
//		String reason = runtimeService.getVariable(instance.getId(), "reason", String.class);
//		String applyUser = runtimeService.getVariable(instance.getId(), "applyUser", String.class);
//		UserBean userBean = userMapper.queryUserBeanByUserId(applyUser);// 通过ID获取信息
//
//		String result = runtimeService.getVariable(instance.getId(), "result", String.class);
//
//		String auditorremark = runtimeService.getVariable(instance.getId(), "auditorremark", String.class);
//		String firstName = runtimeService.getVariable(instance.getId(), "firstName", String.class);
//		UserBean user1 = userMapper.queryUserBeanByUserId(firstName);// 通过ID获取信息
//
//		String secondName = runtimeService.getVariable(instance.getId(), "secondName", String.class);
//		UserBean user2 = userMapper.queryUserBeanByUserId(secondName);// 通过ID获取信息
//		String processInstanceId = runtimeService.getVariable(instance.getId(), "processInstanceId", String.class);
//		String title = runtimeService.getVariable(instance.getId(), "title", String.class);
//		Vacation vac = new Vacation();
//		vac.setRealUserName(userBean.getNickname());
//		vac.setApplyUser(applyUser);
//		vac.setReason(reason);
//
//		String auditor = runtimeService.getVariable(instance.getId(), "auditor", String.class);
//		UserBean user = new UserBean();
//		if (auditor != null && !auditor.equals("")) {
//			user = userMapper.queryUserBeanByUserId(auditor);// 通过ID获取信息
//			vac.setAuditor(auditor);
//			vac.setRealAuditorName(user.getNickname());
//		}
//
//		vac.setAuditorremark(auditorremark);
//		vac.setProcessInstanceId(processInstanceId);
//		if (result != null) {
//			vac.setResult(Integer.parseInt(result) == 1 ? "审批通过" : "审批驳回");
//		}
//		Date startTime = instance.getStartTime(); // activiti 6 才有
//		vac.setApplyTime(startTime);
//		vac.setApplyStatus(instance.isEnded() ? "申请结束" : "等待审批");
//		vac.setFirstName(user1.getNickname());
//		vac.setSecondName(user2.getNickname());
//		vac.setTitle(title);
//		return vac;
//	}
//
//	@Override
//	public List<VacTask> myAudit(String userName) {
//		// TODO Auto-generated method stub
//		List<Task> taskList = new ArrayList<Task>();
//		if (userName.equals("00da3c04c1b14519862301666987bfcd")) {
//			taskList = taskService.createTaskQuery().processDefinitionKey(PROCESS_DEFINE_KEY).list();
//		} else {
//			taskList = taskService.createTaskQuery().processDefinitionKey(PROCESS_DEFINE_KEY).taskAssignee(userName)
//					.list();
//		}
//		List<VacTask> vacTaskList = new ArrayList<>();
//		for (Task task : taskList) {
//			VacTask vacTask = new VacTask();
//			vacTask.setId(task.getId());
//			vacTask.setName(task.getName());
//			vacTask.setCreateTime(task.getCreateTime());
//			String instanceId = task.getProcessInstanceId();
//			ProcessInstance instance = runtimeService.createProcessInstanceQuery().processInstanceId(instanceId)
//					.singleResult();
//			Vacation vac = getVac(instance);
//			SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
//			vac.setApplyTimename(ft.format(vac.getApplyTime()));
//			vacTask.setVac(vac);
//			vacTaskList.add(vacTask);
//		}
//		return vacTaskList;
//	}
//
//	@Override
//	public List<Vacation> myVacRecord(String userName) {
//		// TODO Auto-generated method stub
//		List<HistoricProcessInstance> hisProInstance = new ArrayList<HistoricProcessInstance>();
//		if (userName.equals("00da3c04c1b14519862301666987bfcd")) {
//			hisProInstance = historyService.createHistoricProcessInstanceQuery()
//					.processDefinitionKey(PROCESS_DEFINE_KEY).finished().orderByProcessInstanceEndTime().desc().list();
//		} else {
//			hisProInstance = historyService.createHistoricProcessInstanceQuery()
//					.processDefinitionKey(PROCESS_DEFINE_KEY).startedBy(userName).finished()
//					.orderByProcessInstanceEndTime().desc().list();
//		}
////		List<HistoricProcessInstance> hisProInstance = historyService.createHistoricProcessInstanceQuery()
////				.processDefinitionKey(PROCESS_DEFINE_KEY).startedBy(userName).finished().orderByProcessInstanceEndTime()
////				.desc().list();
//
//		List<Vacation> vacList = new ArrayList<>();
//		for (HistoricProcessInstance hisInstance : hisProInstance) {
//			Vacation vacation = new Vacation();
//			vacation.setApplyUser(hisInstance.getStartUserId());
//			vacation.setApplyTime(hisInstance.getStartTime());
//			vacation.setApplyStatus("申请结束");
//			List<HistoricVariableInstance> varInstanceList = historyService.createHistoricVariableInstanceQuery()
//					.processInstanceId(hisInstance.getId()).list();
//			ActivitiUtil.setVars(vacation, varInstanceList);
//			if (vacation.getResult().equals("1")) {
//				vacation.setApplyStatus("审批通过");
//			} else {
//				vacation.setApplyStatus("审批驳回");
//			}
//			vacList.add(vacation);
//		}
//
//		if (vacList.size() > 0) {
//			for (int i = 0; i < vacList.size(); i++) {
//				Vacation vacation = vacList.get(i);
//				UserBean user1 = userMapper.queryUserBeanByUserId(vacation.getApplyUser());// 通过ID获取信息
//				vacList.get(i).setRealUserName(user1.getNickname());
//
//				UserBean user2 = userMapper.queryUserBeanByUserId(vacation.getFirstName());// 通过ID获取信息
//				vacList.get(i).setFirstName(user2.getNickname());
//
//				UserBean user3 = userMapper.queryUserBeanByUserId(vacation.getSecondName());// 通过ID获取信息
//				vacList.get(i).setSecondName(user3.getNickname());
//			}
//		}
//
//		return vacList;
//	}
//
//	@Override
//	public boolean passAudit(String userName, VacTask vacTask) {
//		// TODO Auto-generated method stub
//		String taskId = vacTask.getId();
//		// 使用任务id,获取任务对象，获取流程实例id
//		Task task = taskService.createTaskQuery().taskId(taskId).singleResult();
//		// 利用任务对象，获取流程实例id
//		String processInstancesId = task.getProcessInstanceId();
//
//		String result = vacTask.getVac().getResult();
//		Map<String, Object> vars = new HashMap<>();
//		vars.put("result", result);
//		vars.put("auditor", userName);
//		vars.put("auditTime", new Date());
//		vars.put("auditorremark", vacTask.getVac().getAuditorremark());
//
//		Authentication.setAuthenticatedUserId(userName); // 添加批注时候的审核人，通常应该从session获取
//		if (vacTask.getVac().getAuditorremark() != null && !vacTask.getVac().getAuditorremark().equals("")) {
//			taskService.addComment(taskId, processInstancesId,
//					Utils.getCurrent() + "," + result + "," + vacTask.getVac().getAuditorremark());// 添加审批的评论
//		} else {
//			taskService.addComment(taskId, processInstancesId, Utils.getCurrent() + "," + result);// 添加审批的评论
//		}
//
//		taskService.complete(taskId, vars);
//		return true;
//	}
//
//	@Override
//	public List<Vacation> myAuditRecord(String userName) {
//		// TODO Auto-generated method stub
//		List<HistoricProcessInstance> hisProInstance = new ArrayList<HistoricProcessInstance>();
//		if (userName.equals("00da3c04c1b14519862301666987bfcd")) {
//			hisProInstance = historyService.createHistoricProcessInstanceQuery()
//					.processDefinitionKey(PROCESS_DEFINE_KEY).orderByProcessInstanceEndTime().desc().list();
//		} else {
//			hisProInstance = historyService.createHistoricProcessInstanceQuery()
//					.processDefinitionKey(PROCESS_DEFINE_KEY).involvedUser(userName).orderByProcessInstanceEndTime()
//					.desc().list();
//		}
//
//		List<String> auditTaskNameList = new ArrayList<>();
//		auditTaskNameList.add("第一审批人");
//		auditTaskNameList.add("第二审批人");
//		List<Vacation> vacList = new ArrayList<>();
//		for (HistoricProcessInstance hisInstance : hisProInstance) {
//			List<HistoricTaskInstance> hisTaskInstanceList = new ArrayList<HistoricTaskInstance>();
//			if (userName.equals("00da3c04c1b14519862301666987bfcd")) {
//				hisTaskInstanceList = historyService.createHistoricTaskInstanceQuery()
//						.processInstanceId(hisInstance.getId()).taskNameIn(auditTaskNameList)
//						.orderByHistoricTaskInstanceEndTime().desc().list();
//			} else {
//				hisTaskInstanceList = historyService.createHistoricTaskInstanceQuery()
//						.processInstanceId(hisInstance.getId()).taskAssignee(userName).taskNameIn(auditTaskNameList)
//						.orderByHistoricTaskInstanceEndTime().desc().list();
//			}
//
//			boolean isMyAudit = false;
//			for (HistoricTaskInstance taskInstance : hisTaskInstanceList) {
//				if (userName.equals("00da3c04c1b14519862301666987bfcd")) {
//					isMyAudit = true;
//				} else {
//					if (taskInstance.getAssignee().equals(userName)) {
//						isMyAudit = true;
//					}
//				}
//
//			}
//			if (!isMyAudit) {
//				continue;
//			}
//			Vacation vacation = new Vacation();
//			vacation.setApplyUser(hisInstance.getStartUserId());
//
//			vacation.setApplyTime(hisInstance.getStartTime());
//			List<HistoricVariableInstance> varInstanceList = historyService.createHistoricVariableInstanceQuery()
//					.processInstanceId(hisInstance.getId()).list();
//			ActivitiUtil.setVars(vacation, varInstanceList);
//			if (vacation.getResult() == null || vacation.getResult().equals("")) {
//				break;
//			}
//			if (vacation.getResult().equals("1")) {
//				vacation.setApplyStatus("审核通过");
//			} else {
//				vacation.setApplyStatus("审核驳回");
//			}
//			UserBean userBean = userMapper.queryUserBeanByUserId(vacation.getApplyUser());// 通过ID获取信息
//			vacation.setRealUserName(userBean.getNickname());
//			SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
//			vacation.setApplyTimename(ft.format(vacation.getApplyTime()));
//			vacList.add(vacation);
//		}
//		return vacList;
//	}
//
//	@Override
//	public List<VacComment> auditComment(String processInstanceId) {
//		// TODO Auto-generated method stub
//		List<VacComment> vacComments = new ArrayList<VacComment>();
//		List<Comment> list = taskService.getProcessInstanceComments(processInstanceId);
//		if (list != null && list.size() == 2) {
//			for (int m = 0; m < 1; m++) {
//				Comment comment1 = list.get(0);
//				Comment comment2 = list.get(1);
//				int num = compare(comment1.getTime(), comment2.getTime());
//				if (num == 1) {
//					Comment newcomment = comment1;
//					list.remove(0);
//					list.add(newcomment);
//				}
//			}
//		}
//
//		for (int i = 0; i < list.size(); i++) {
//			Comment comment = list.get(i);
//			VacComment vacComment = new VacComment();
//			vacComment.setUsername(comment.getUserId());
//			String message = comment.getFullMessage();
//			if (message != null && !message.equals("")) {
//				String[] messages = message.split(",");
//				vacComment.setCommenttime(messages[0]);
//				vacComment.setResult(messages[1]);
//				if (messages[1].equals("1")) {
//					vacComment.setStatus(1);
//				} else {
//					vacComment.setStatus(0);
//				}
//				if (messages.length == 3) {
//					vacComment.setComment(messages[2]);
//				}
//
//			}
//			vacComments.add(vacComment);
//		}
//		return vacComments;
//	}
//
//	public int compare(Date dt1, Date dt2) {
//
//		try {
//
//			if (dt1.getTime() > dt2.getTime()) {
//				return 1;
//			} else if (dt1.getTime() < dt2.getTime()) {
//				return -1;
//			} else {
//				return 0;
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return 0;
//	}
//
//	@Override
//	public InputStream getResourceDiagramInputStream(String id) {
//		// TODO Auto-generated method stub
//		try {
//			// 获取历史流程实例
//			HistoricProcessInstance historicProcessInstance = historyService.createHistoricProcessInstanceQuery()
//					.processInstanceId(id).singleResult();
//			// 获取流程中已经执行的节点，按照执行先后顺序排序
//			List<HistoricActivityInstance> historicActivityInstanceList = historyService
//					.createHistoricActivityInstanceQuery().processInstanceId(id).orderByHistoricActivityInstanceId()
//					.asc().list();
//			// 构造已执行的节点ID集合
//			List<String> executedActivityIdList = new ArrayList<String>();
//			for (HistoricActivityInstance activityInstance : historicActivityInstanceList) {
//				executedActivityIdList.add(activityInstance.getActivityId());
//			}
//			// 获取bpmnModel
//			BpmnModel bpmnModel = repositoryService.getBpmnModel(historicProcessInstance.getProcessDefinitionId());
//			// 获取流程已发生流转的线ID集合
//			List<String> flowIds = this.getExecutedFlows(bpmnModel, historicActivityInstanceList);
//			// 使用默认配置获得流程图表生成器，并生成追踪图片字符流
//			ProcessDiagramGenerator processDiagramGenerator = processEngine.getProcessEngineConfiguration()
//					.getProcessDiagramGenerator();
//			// 你也可以 new 一个
//			// DefaultProcessDiagramGenerator processDiagramGenerator = new
//			// DefaultProcessDiagramGenerator();
//			InputStream imageStream = processDiagramGenerator.generateDiagram(bpmnModel, "png", executedActivityIdList,
//					flowIds, "宋体", "微软雅黑", "黑体", null, 2.0);
//			return imageStream;
//		} catch (Exception e) {
//			e.printStackTrace();
//			return null;
//		}
//	}
//
//	private List<String> getExecutedFlows(BpmnModel bpmnModel,
//			List<HistoricActivityInstance> historicActivityInstanceList) {
//		List<String> executedFlowIdList = new ArrayList<>();
//		for (int i = 0; i < historicActivityInstanceList.size() - 1; i++) {
//			HistoricActivityInstance hai = historicActivityInstanceList.get(i);
//			FlowNode flowNode = (FlowNode) bpmnModel.getFlowElement(hai.getActivityId());
//			List<SequenceFlow> sequenceFlows = flowNode.getOutgoingFlows();
//			if (sequenceFlows.size() > 1) {
//				HistoricActivityInstance nextHai = historicActivityInstanceList.get(i + 1);
//				sequenceFlows.forEach(sequenceFlow -> {
//					if (sequenceFlow.getTargetFlowElement().getId().equals(nextHai.getActivityId())) {
//						executedFlowIdList.add(sequenceFlow.getId());
//					}
//				});
//			} else if (sequenceFlows.size() == 1) {
//				executedFlowIdList.add(sequenceFlows.get(0).getId());
//			}
//		}
//		return executedFlowIdList;
//	}
//
//	@Override
//	public List<Vacation> myAuditAgree() {
//		// TODO Auto-generated method stub
//		List<HistoricProcessInstance> hisProInstance = historyService.createHistoricProcessInstanceQuery()
//				.processDefinitionKey(PROCESS_DEFINE_KEY).finished().orderByProcessInstanceEndTime().desc().list();
//
//		List<String> auditTaskNameList = new ArrayList<>();
//		auditTaskNameList.add("第一审批人");
//		auditTaskNameList.add("第二审批人");
//		List<Vacation> vacList = new ArrayList<>();
//		for (HistoricProcessInstance hisInstance : hisProInstance) {
//			Vacation vacation = new Vacation();
//			vacation.setApplyUser(hisInstance.getStartUserId());
//
//			vacation.setApplyTime(hisInstance.getStartTime());
//			List<HistoricVariableInstance> varInstanceList = historyService.createHistoricVariableInstanceQuery()
//					.processInstanceId(hisInstance.getId()).list();
//			ActivitiUtil.setVars(vacation, varInstanceList);
//			if (vacation.getResult().equals("1")) {
//				vacation.setApplyStatus("审核通过");
//			} else {
//				continue;
//			}
//			UserBean userBean = userMapper.queryUserBeanByUserId(vacation.getApplyUser());// 通过ID获取信息
//			vacation.setRealUserName(userBean.getNickname());
//			SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
//			vacation.setApplyTimename(ft.format(vacation.getApplyTime()));
//			vacList.add(vacation);
//		}
//		return vacList;
//	}
//
//	@Override
//	public void deleteProcessId(String processInstanceId) {
//		// TODO Auto-generated method stub
//		ProcessInstance pi = runtimeService.createProcessInstanceQuery()//
//				.processInstanceId(processInstanceId)// 使用流程实例ID查询
//				.singleResult();
//		if (pi == null) {
//			// 该流程实例已经完成了
//			historyService.deleteHistoricProcessInstance(processInstanceId);
//		} else {
//			// 该流程实例未结束的
//			runtimeService.deleteProcessInstance(processInstanceId, "");
//			historyService.deleteHistoricProcessInstance(processInstanceId);// (顺序不能换)
//		}
//	}

}
