package com.item.controller;

import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.util.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.item.entity.ExcelManage;
import com.item.entity.Page;
import com.item.entity.UserBean;
import com.item.entity.VacComment;
import com.item.entity.VacTask;
import com.item.entity.VacUser;
import com.item.entity.Vacation;
import com.item.service.ExcelServcie;
import com.item.service.UserService;
import com.item.service.VacationService;
import com.item.tool.Result;

@RestController
@RequestMapping(value = "vacation")
public class VacationController {

	@Autowired
	private VacationService vacationService;

	@Autowired
	private UserService userService;

	@Autowired
	private ExcelServcie excelServcie;

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
	public Result<?> myVac(String userName, String title, Page page, String applyStatus) {
		PageHelper.startPage(page.getPageNumber(), page.getPageSize());
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
			vacUser1.setStyle(1);

			VacUser vacUser2 = new VacUser();
			vacUser2.setNickname(vacation.getFirstName());

			VacUser vacUser3 = new VacUser();
			vacUser3.setNickname(vacation.getSecondName());
			if (comments.size() > 0) {
				VacComment comment = comments.get(0);
				vacUser2.setDatimename(comment.getCommenttime().substring(0, 10));
				vacUser2.setFlag(true);
				if (comment.getStatus() == 0) {
					vacUser2.setDatimename("审批驳回");
				}
				vacUser2.setStyle(comment.getStatus());
				comments.get(0).setUsername(vacUser2.getNickname());
				if (comment.getStatus() == 0) {
					vacUser3.setStyle(3);
				}
				if (comments.size() == 2) {
					vacUser3.setDatimename(comments.get(1).getCommenttime().substring(0, 10));
					vacUser3.setFlag(true);
					if (comments.get(1).getStatus() == 0) {
						vacUser3.setDatimename("审批驳回");
					}
					vacUser3.setStyle(comments.get(1).getStatus());
					comments.get(1).setUsername(vacUser3.getNickname());

				}
			}
			vacUsers.add(vacUser1);
			vacUsers.add(vacUser2);
			vacUsers.add(vacUser3);
			vacList.get(i).setVacUsers(vacUsers);
			vacList.get(i).setVacComments(comments);

		}
		List<Vacation> results = new ArrayList<Vacation>();
		if (!title.equals("") || !applyStatus.equals("")) {
			if (!title.equals("") && !applyStatus.equals("")) {
				List<Vacation> other = new ArrayList<Vacation>();
				Pattern pattern = Pattern.compile(title);
				for (int m = 0; m < vacList.size(); m++) {
					Matcher matcher = pattern.matcher(((Vacation) vacList.get(m)).getTitle());
					if (matcher.find()) {
						results.add(vacList.get(m));
					}
				}
				Pattern pattern1 = Pattern.compile(applyStatus);
				for (int n = 0; n < results.size(); n++) {
					Matcher matcher = pattern1.matcher(((Vacation) results.get(n)).getApplyStatus());
					if (matcher.find()) {
						other.add(results.get(n));
					}
				}
				results = other;
			} else if (!title.equals("")) {
				Pattern pattern = Pattern.compile(title);
				for (int m = 0; m < vacList.size(); m++) {
					Matcher matcher = pattern.matcher(((Vacation) vacList.get(m)).getTitle());
					if (matcher.find()) {
						results.add(vacList.get(m));
					}
				}
			} else if (!applyStatus.equals("")) {
				Pattern pattern = Pattern.compile(applyStatus);
				for (int m = 0; m < vacList.size(); m++) {
					Matcher matcher = pattern.matcher(((Vacation) vacList.get(m)).getApplyStatus());
					if (matcher.find()) {
						results.add(vacList.get(m));
					}
				}
			}

		} else {
			results = vacList;
		}

		PageInfo<Vacation> pageInfo = new PageInfo<Vacation>(results);
		return Result.success(pageInfo);
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
		for (int i = 0; i < vacTaskList.size(); i++) {
			if (userName.equals("00da3c04c1b14519862301666987bfcd")) {
				vacTaskList.get(i).setShow(false);
			}
		}
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
	public Result<?> myAuditRecord(String userName, Page page, String applyStatus) {
		PageHelper.startPage(page.getPageNumber(), page.getPageSize());
		List<Vacation> vacList = vacationService.myAuditRecord(userName);
		List<Vacation> results = new ArrayList<Vacation>();
		for (int i = 0; i < vacList.size(); i++) {
			Vacation vacation = vacList.get(i);
			if (vacation.getResult().equals("0")) {
				vacation.setApplyStatus("审批驳回");
			}
			if (vacation.getResult().equals("1")) {
				if (vacation.getFirstName().equals(vacation.getAuditor())) {
					vacation.setApplyStatus("等待审批");
				} else if (vacation.getSecondName().equals(vacation.getAuditor())) {
					vacation.setApplyStatus("审批通过");
				}
			}
			String processInstanceId = vacation.getProcessInstanceId();
			List<VacComment> comments = vacationService.auditComment(processInstanceId);
			String strtime = "";
			String strname = "";
			if (comments.size() == 1) {
				strname = comments.get(0).getUsername();
				UserBean userBean = userService.queryUserBeanByUserId(strname);// 通过ID获取信
				strname = userBean.getNickname();
				strtime = comments.get(0).getCommenttime().substring(0, 10);
			} else {
				if (userName.equals(vacation.getFirstName())) {
					strtime = comments.get(0).getCommenttime().substring(0, 10);
				} else {
					strtime = comments.get(1).getCommenttime().substring(0, 10);
				}
				UserBean userBean = userService.queryUserBeanByUserId(comments.get(0).getUsername());// 通过ID获取信
				UserBean userBean1 = userService.queryUserBeanByUserId(comments.get(1).getUsername());// 通过ID获取信
				strname = userBean.getNickname() + " " + userBean1.getNickname();
			}
			for (int m = 0; m < comments.size(); m++) {
				UserBean userBean = userService.queryUserBeanByUserId(comments.get(m).getUsername());
				comments.get(m).setUsername(userBean.getNickname());
			}
			vacList.get(i).setAuditTimename(strtime);
			vacList.get(i).setAuditor(strname);
			vacList.get(i).setVacComments(comments);

		}

		if (applyStatus != null && !applyStatus.equals("")) {
			Pattern pattern = Pattern.compile(applyStatus);
			for (int m = 0; m < vacList.size(); m++) {
				Matcher matcher = pattern.matcher(((Vacation) vacList.get(m)).getApplyStatus());
				if (matcher.find()) {
					results.add(vacList.get(m));
				}
			}
		} else {
			results = vacList;
		}

		PageInfo<Vacation> pageInfo = new PageInfo<Vacation>(results);
		return Result.success(pageInfo);
	}

	/**
	 * 显示通过的
	 * 
	 * @return
	 */
	@RequestMapping(value = "/myAuditAgree")
	public Result<?> myAuditAgree(Page page) {
		PageHelper.startPage(page.getPageNumber(), page.getPageSize());
		List<String> list = new ArrayList<String>();
		List<Vacation> vacList = vacationService.myAuditAgree();
		for (int i = 0; i < vacList.size(); i++) {
			list.add(vacList.get(i).getTitle());
		}
		List<ExcelManage> excelmanages = excelServcie.queryByTitle(list);
		PageInfo<ExcelManage> pageInfo = new PageInfo<ExcelManage>(excelmanages);
		return Result.success(pageInfo);
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
