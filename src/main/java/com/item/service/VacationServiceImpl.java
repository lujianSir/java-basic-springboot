package com.item.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.activiti.engine.HistoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.history.HistoricVariableInstance;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.item.entity.Vacation;

@Service
public class VacationServiceImpl implements VacationService {

	@Autowired
	private RuntimeService runtimeService;

	@Autowired
	private TaskService taskService;

	@Autowired
	private HistoryService historyService;

	// 实例流程id,用来记录流程,以便获取当前任务
	private String processInstanceId;

	public String getProcessInstanceId() {
		return processInstanceId;
	}

	private static final String PROCESS_DEFINE_KEY = "vacationProcess";

	@Override
	public Object startVac(Vacation vac) {
		// TODO Auto-generated method stub
		// 将信息加入map,以便传入流程中
		Map<String, Object> variables = new HashMap<String, Object>();
		variables.put("employeeName", vac.getApplyUser());
		variables.put("reason", vac.getReason());
		variables.put("leadName", vac.getAuditor());

		// 开启流程
		ProcessInstance processInstance = runtimeService.startProcessInstanceByKey(PROCESS_DEFINE_KEY, variables);
		// 将得到的实例流程id值赋给之前设置的变量
		processInstanceId = processInstance.getId();
		System.out.println("流程开启成功.......实例流程id:" + processInstanceId);
		return true;
	}

	public void deletProcessInstance(String processInstanceId) {
		runtimeService.deleteProcessInstance(processInstanceId, "删除原因");// 删除流程
		System.out.println("成功");
	}

	// 开始走流程
	// 1.获取当前任务,并且完成 根据实例ID进行操作

	public void getTaskAndComplete(String processInstanceId) {

		// 查询流程实例，如果走完了 ，应该是null,否则应该有当前任务
		Object o = runtimeService.createProcessInstanceQuery()// 获取查询对象
				.processInstanceId(processInstanceId)// 根据id查询流程实例
				.singleResult();// 获取查询结果,如果为空,说明这个流程已经执行完毕,否则,获取任务并执行
		if (o != null) {
			// 通过流程实例ID，查询当前的任务
			Task task = taskService.createTaskQuery()// 创建查询对象
					.processInstanceId(processInstanceId)// 通过流程实例id来查询当前任务
					.singleResult();// 获取单个查询结果
			String taskName = task.getName();

			if (taskName.equals("发起申请")) {// 职员节点
				completeEmployeeTask(task);
			} else if (taskName.equals("领导审批")) {// 领导节点
				completeLeaderTask(task);
			} else {// 经理节点
				completeJingliTask(task);
			}
		}

		// 开始进行流程
//			while(this.processEngine.getRuntimeService()
//					.createProcessInstanceQuery()//获取查询对象
//					.processInstanceId(processInstanceId)//根据id查询流程实例
//					.singleResult()//获取查询结果,如果为空,说明这个流程已经执行完毕,否则,获取任务并执行
//					!=null){
//				Task task = taskService.createTaskQuery()//创建查询对象
//					.processInstanceId(processInstanceId)//通过流程实例id来查询当前任务
//					.singleResult();//获取单个查询结果
//				String taskName = task.getName();
//				if(taskName.equals("发起申请")){//职员节点
//					completeEmployeeTask(task);
//				}else if(taskName.equals("领导审批")){//领导节点
//					completeLeaderTask(task);
//				}else{//经理节点
//					completeJingliTask(task);
//				}
//			}

		System.out.println("审核结束..........");
	}

	/** 查询历史流程变量实例 */

	public void findHistoryProcessVariables(String processInstanceId) {
		List<HistoricVariableInstance> list = historyService//
				.createHistoricVariableInstanceQuery()// 创建一个历史的流程变量查询对象
				.processInstanceId(processInstanceId)//
				.list();
		if (list != null && list.size() > 0) {
			for (HistoricVariableInstance hvi : list) {
				System.out.println(hvi.getId() + "   " + hvi.getProcessInstanceId() + "   " + hvi.getVariableName()
						+ "   " + hvi.getVariableTypeName() + "    " + hvi.getValue());
				System.out.println("###############################################");
			}
		}
	}

	// 职员提交申请
	public void completeEmployeeTask(Task task) {
		// 获取任务id
		String taskId = task.getId();
		Map<String, Object> variables = new HashMap<String, Object>();
		variables.put("leaveStatus", 1);
		// 完成任务
		taskService.complete(taskId);
		System.out.println("职员已经提交申请.......");

	}

	// 领导审批
	public void completeLeaderTask(Task task) {
		// 获取任务id
		String taskId = task.getId();

		// 领导意见
		Map<String, Object> variables = new HashMap<String, Object>();
		// variables.put("day",4);
		variables.put("leaderResult", 0);
		variables.put("leaveStatus", 0);// 打回
		// 完成任务
		taskService.complete(taskId, variables);
		System.out.println("领导审核完毕........");

	}

	// 经理审批
	public void completeJingliTask(Task task) {
		// 获取任务id
		String taskId = task.getId();
		String name = task.getName();
		// 经理意见
		Map<String, Object> variables = new HashMap<String, Object>();
		variables.put("result", 1);
		// 完成任务
		taskService.complete(taskId, variables);
		System.out.println("经理审核完毕........,审核经理:" + name);

	}

}
