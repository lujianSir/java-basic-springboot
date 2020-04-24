package com.item.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.item.entity.Vacation;
import com.item.service.VacationService;
import com.item.tool.Result;

@RestController
@RequestMapping(value = "vacation")
public class VacationController {

	@Autowired
	private VacationService vacationService;

	@RequestMapping(value = "/startVac")
	public Result<?> userLogin(Vacation vac) {
		vacationService.startVac(vac);
		return null;
	}

	@RequestMapping(value = "/getVac")
	public Result<?> getVac(Vacation vac) {
		vacationService.startVac(vac);
		return null;
	}

}
