package com.item.service;

import java.util.List;

import com.item.entity.VacTask;
import com.item.entity.Vacation;

public interface VacationService {

	// 发起申请
	public boolean startVac(Vacation vac, String userName, String firstName, String secondName);

	// 我正在申请的假
	public List<Vacation> myVac(String userName);

	// 待我审核的请假
	public List<VacTask> myAudit(String userName);

	// 审核操作
	public boolean passAudit(String userName, VacTask vacTask);

	// 我申请过的假
	public List<Vacation> myVacRecord(String userName);

	// 我的审核记录
	public List<Vacation> myAuditRecord(String userName);
}
