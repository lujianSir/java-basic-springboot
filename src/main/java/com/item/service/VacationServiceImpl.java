package com.item.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.activiti.engine.HistoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
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
	public Object startVac(Vacation vac, String firstName, String secondName) {
		// TODO Auto-generated method stub
		// 将信息加入map,以便传入流程中
		Map<String, Object> variables = new HashMap<String, Object>();
		variables.put("applyUser", vac.getApplyUser());
		variables.put("reason", vac.getReason());
		variables.put("firstName", firstName);
		variables.put("secondName", secondName);
		// 开启流程
		ProcessInstance processInstance = runtimeService.startProcessInstanceByKey(PROCESS_DEFINE_KEY, variables);
		// 将得到的实例流程id值赋给之前设置的变量
		processInstanceId = processInstance.getId();
		System.out.println("流程开启成功.......实例流程id:" + processInstanceId);
		// getTaskAndComplete(processInstanceId);
		// 查询当前任务
		Task currentTask = taskService.createTaskQuery().processInstanceId(processInstanceId).singleResult();
		taskService.complete(currentTask.getId());
		return true;
	}

	public void deletProcessInstance(String processInstanceId) {
		runtimeService.deleteProcessInstance(processInstanceId, "删除原因");// 删除流程
		System.out.println("成功");
	}

	@Override
	public Object myVac(String userName) {
		List<ProcessInstance> instanceList = runtimeService.createProcessInstanceQuery().processInstanceName(userName)
				.list();
		List<Vacation> vacList = new ArrayList<>();
		for (ProcessInstance instance : instanceList) {
			Vacation vac = getVac(instance);
			vacList.add(vac);
		}
		return vacList;
	}

	private Vacation getVac(ProcessInstance instance) {
		String reason = runtimeService.getVariable(instance.getId(), "reason", String.class);
		Vacation vac = new Vacation();
		vac.setApplyUser(instance.getStartUserId());
		vac.setReason(reason);
		Date startTime = instance.getStartTime(); // activiti 6 才有
		vac.setApplyTime(startTime);
		vac.setApplyStatus(instance.isEnded() ? "申请结束" : "等待审批");
		return vac;
	}

}
