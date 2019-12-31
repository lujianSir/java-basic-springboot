package com.item.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.item.entity.FlowBean;
import com.item.service.FlowService;
import com.item.tool.Result;

@RestController
@RequestMapping(value = "flow")
public class FlowController {

	@Autowired
	private FlowService flowService;

	@RequestMapping(value = "/add")
	public Result<?> flowAdd(@RequestParam("proposer") String proposer) {

		FlowBean flow = new FlowBean();
		flow.setProposer(proposer);

		return flowService.flowAdd(flow);
	}

	@RequestMapping(value = "/apquery")
	public Result<?> approveQuery(@RequestParam("flownum") long flownum) {

		return flowService.approveQuery(flownum);
	}

	@RequestMapping(value = "/query")
	public Result<?> flowQuery(@RequestParam(value = "node", required = false) String node,
			@RequestParam(value = "flownum", required = false) String flownum,
			@RequestParam(value = "startDate", required = false) String startDate,
			@RequestParam(value = "endDate", required = false) String endDate, @RequestParam("pageNum") int pageNum,
			@RequestParam("pageSize") int pageSize,
			@RequestParam("userid") String userid) {

		int a;
		long b;
		Date c = null;
		Date d = null;
		if (node == "" || node == null) {
			a = -1;
		} else {
			a = Integer.parseInt(node);
		}
		if (flownum == "" || flownum == null) {
			b = -1;
		} else {
			b = Long.parseLong(flownum);
		}
		if (startDate == "" || startDate == null) {
			c = new Date(1510369871);
		} else {
			c = new Date(Long.parseLong(startDate));
		}
		if (endDate == "" || endDate == null) {
			d = new Date(1510369871);
		} else {
			d = new Date(Long.parseLong(endDate));
		}
		
		//提供分页
		@SuppressWarnings("unchecked")
		List<FlowBean> list = (List<FlowBean>) flowService.flowQuery(a, b, c, d).getData();
		//暂时使用 用以测试
		for(int i = 0 ; i < list.size();i++) {
			 list.get(i).setIsapprove(0);
		}
		PageHelper.startPage(pageNum, pageSize);
		PageInfo<FlowBean> pageInfo = new PageInfo<FlowBean>(list);

		return Result.success(pageInfo);
	}

}
