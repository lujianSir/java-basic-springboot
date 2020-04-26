package com.item.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.item.entity.VacTask;
import com.item.entity.Vacation;
import com.item.service.VacationService;
import com.item.tool.Result;

@RestController
@RequestMapping(value = "vacation")
public class VacationController {

	@Autowired
	private VacationService vacationService;

	/**
	 * 发起申请
	 * 
	 * @param vac
	 * @param userName
	 * @param firstName
	 * @param secondName
	 * @return
	 */
	@RequestMapping(value = "/startVac")
	public Result<?> userLogin(Vacation vac, String userName, String firstName, String secondName) {
		boolean flag = vacationService.startVac(vac, userName, firstName, secondName);
		if (flag) {
			return Result.success();
		} else {
			return Result.error(500, "申请失败，请重新发起");
		}

	}

	/**
	 * 我正在申请的假
	 * 
	 * @param userName
	 * @return
	 */
	@RequestMapping(value = "/myVac")
	public Result<?> myVac(String userName) {
		List<Vacation> vacList = vacationService.myVac(userName);
		return Result.success(vacList);
	}

	/**
	 * 待我审核的请假
	 * 
	 * @param userName
	 * @return
	 */
	@RequestMapping(value = "/myAudit")
	public Result<?> myAudit(String userName) {
		List<VacTask> vacTaskList = vacationService.myAudit(userName);
		return Result.success(vacTaskList);
	}

	/**
	 * 我申请过的假
	 * 
	 * @param userName
	 * @return
	 */
	@RequestMapping(value = "/myVacRecord")
	public Result<?> myVacRecord(String userName) {
		List<Vacation> vacList = vacationService.myVacRecord(userName);
		return Result.success(vacList);
	}

	/**
	 * 审核操作
	 * 
	 * @param userName
	 * @param vacTask
	 * @return
	 */
	@RequestMapping(value = "/passAudit")
	public Result<?> passAudit(String userName, String result, VacTask vacTask) {
		Vacation vac = new Vacation();
		vac.setResult(result);
		vacTask.setVac(vac);
		boolean flag = vacationService.passAudit(userName, vacTask);
		if (flag) {
			return Result.success();
		} else {
			return Result.error(500, "审批失败");
		}
	}

	/**
	 * 我的审核记录
	 * 
	 * @param userName
	 * @return
	 */
	@RequestMapping(value = "/myAuditRecord")
	public Result<?> myAuditRecord(String userName) {
		List<Vacation> vacList = vacationService.myAuditRecord(userName);
		return Result.success(vacList);
	}
}
