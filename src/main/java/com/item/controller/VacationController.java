package com.item.controller;

import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.util.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.item.entity.VacComment;
import com.item.entity.VacTask;
import com.item.entity.VacUser;
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
	public Result<?> userLogin(Vacation vac, String userName, String firstName, String secondName, String eid) {
		if (userName.equals(firstName) || userName.equals(secondName) || firstName.equals(secondName)) {
			return Result.error(501, "不能选择同一个人");
		} else {
			if (userName != null && !userName.equals("")) {
				vac.setApplyUser(userName);
			}
			boolean flag = vacationService.startVac(vac, userName, firstName, secondName, eid);
			if (flag) {
				return Result.success();
			} else {
				return Result.error(500, "申请失败，请重新发起");
			}
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
		List<Vacation> oldvacList = vacationService.myVacRecord(userName);
		vacList.addAll(oldvacList);
		for (int i = 0; i < vacList.size(); i++) {
			Vacation vacation = vacList.get(i);
			List<VacUser> vacUsers = new ArrayList<VacUser>();
			SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
			if (vacation.getApplyTime() != null) {
				vacList.get(i).setApplyTimename(ft.format(vacation.getApplyTime()));
			}
			if (vacation.getAuditTime() != null) {
				vacList.get(i).setAuditTimename(ft.format(vacation.getAuditTime()));
			}

			String processInstanceId = vacation.getProcessInstanceId();
			List<VacComment> comments = vacationService.auditComment(processInstanceId);
			VacUser vacUser1 = new VacUser();
			vacUser1.setNickname(vacation.getRealUserName());
			vacUser1.setDatimename(vacation.getApplyTimename());
			vacUser1.setFlag(true);

			VacUser vacUser2 = new VacUser();
			vacUser2.setNickname(vacation.getFirstName());

			VacUser vacUser3 = new VacUser();
			vacUser3.setNickname(vacation.getSecondName());
			if (comments.size() > 0) {
				VacComment comment = comments.get(0);
				vacUser2.setDatimename(comment.getCommenttime().substring(0, 10));
				vacUser2.setFlag(true);
				comments.get(0).setUsername(vacUser2.getNickname());
				if (comments.size() == 2) {
					vacUser3.setDatimename(comments.get(1).getCommenttime().substring(0, 10));
					vacUser3.setFlag(true);
					comments.get(1).setUsername(vacUser3.getNickname());
				}
			}
			vacUsers.add(vacUser1);
			vacUsers.add(vacUser2);
			vacUsers.add(vacUser3);
			vacList.get(i).setVacUsers(vacUsers);
			vacList.get(i).setVacComments(comments);

		}
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
	public Result<?> passAudit(String userName, String result, String auditorremark, VacTask vacTask) {
		Vacation vac = new Vacation();
		vac.setResult(result);
		vac.setAuditorremark(auditorremark);
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

	/**
	 * 获取评论列表
	 * 
	 * @param processInstanceId
	 * @return
	 */
	@RequestMapping(value = "/auditComment")
	public Result<?> auditComment(String processInstanceId) {
		List<VacComment> comments = vacationService.auditComment(processInstanceId);
		return Result.success(comments);
	}

	/**
	 * 查看实例流程图，根据流程实例ID获取流程图
	 */
	@RequestMapping(value = "/traceprocess")
	public void traceprocess(HttpServletResponse response, String instanceId) throws Exception {
		InputStream in = vacationService.getResourceDiagramInputStream(instanceId);
		ServletOutputStream output = response.getOutputStream();
		IOUtils.copy(in, output);
	}

}
