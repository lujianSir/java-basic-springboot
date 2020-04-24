package com.item.service;

import java.util.HashMap;
import java.util.Map;

import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.runtime.ProcessInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.item.entity.Vacation;

@Service
public class VacationServiceImpl implements VacationService {

	@Autowired
	private RuntimeService runtimeService;

	@Autowired
	private TaskService taskService;

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

}
