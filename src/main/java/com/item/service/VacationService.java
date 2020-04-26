package com.item.service;

import com.item.entity.Vacation;

public interface VacationService {

	// 发起申请
	public Object startVac(Vacation vac, String firstName, String secondName);

	// 正在申请的假
	public Object myVac(String userName);
}
