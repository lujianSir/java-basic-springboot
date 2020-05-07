package com.item.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.item.entity.ExcelApplay;
import com.item.entity.ExcelAuthor;
import com.item.entity.Page;
import com.item.service.ExcelProcessService;
import com.item.tool.Result;

@RestController
@RequestMapping(value = "process")
public class ProcessController {

	@Autowired
	private ExcelProcessService excelProcessService;

	/**
	 * 创建流程
	 * 
	 * @param username用户名1
	 * @param password密码
	 * @return
	 */
	@RequestMapping(value = "/creatExcelProcess")
	public Result<?> creatExcelProcess(ExcelApplay excelApplay, String author) {
		int row = excelProcessService.creatExcelProcess(excelApplay, author);
		if (row > 0) {
			return Result.success(row);
		} else {
			return Result.error(500, "创建失败");
		}

	}

	/**
	 * 查询当前用户发起的所有申请
	 * 
	 * @param excelApplay
	 * @return
	 */
	@RequestMapping(value = "/queryExcelApplayByName")
	public Result<?> queryExcelApplayByName(ExcelApplay excelApplay, Page page) {
		PageHelper.startPage(page.getPageNumber(), page.getPageSize());
		List<ExcelApplay> list = excelProcessService.queryExcelApplayByName(excelApplay);
		PageInfo<ExcelApplay> pageInfo = new PageInfo<ExcelApplay>(list);
		return Result.success(pageInfo);
	}

	/**
	 * 查询需要审批的流程
	 * 
	 * @param excelAuthor
	 * @return
	 */
	@RequestMapping(value = "/queryExcelApplayByAuthorName")
	public Result<?> queryExcelApplayByAuthorName(ExcelAuthor excelAuthor, Page page) {
		PageHelper.startPage(page.getPageNumber(), page.getPageSize());
		List<ExcelApplay> list = excelProcessService.queryExcelApplayByAuthorName(excelAuthor);
		PageInfo<ExcelApplay> pageInfo = new PageInfo<ExcelApplay>(list);
		return Result.success(pageInfo);
	}

	/**
	 * 审批
	 * 
	 * @param excelApplay
	 * @param excelAuthor
	 * @return
	 */
	@RequestMapping(value = "/updateApplayAndAuthor")
	public Result<?> updateApplayAndAuthor(ExcelApplay excelApplay, ExcelAuthor excelAuthor) {
		return excelProcessService.updateApplayAndAuthor(excelApplay, excelAuthor);
	}

	/**
	 * 查询评论内容
	 * 
	 * @param excelApplay
	 * @return
	 */
	@RequestMapping(value = "/queryExcelAuthorByApplayId")
	public Result<?> queryExcelAuthorByApplayId(ExcelApplay excelApplay) {
		return Result.success(excelProcessService.queryExcelAuthorByApplayId(excelApplay));
	}

	/**
	 * 查询已经审批过得
	 * 
	 * @param excelAuthor
	 * @return
	 */
	@RequestMapping(value = "/queryExcelApplayByAuthor")
	public Result<?> queryExcelApplayByAuthor(ExcelAuthor excelAuthor, Page page) {
		PageHelper.startPage(page.getPageNumber(), page.getPageSize());
		List<ExcelApplay> list = excelProcessService.queryExcelApplayByAuthor(excelAuthor);
		PageInfo<ExcelApplay> pageInfo = new PageInfo<ExcelApplay>(list);
		return Result.success(pageInfo);
	}
}
