package com.item.service;

import com.item.entity.Vacation;

public interface VacationService {

	// 发起申请
	public Object startVac(Vacation vac);

	// 获取任务
	public Object getVac(String loginname);
}
