package com.item.service;

import java.util.List;

import com.item.entity.ExcelApplay;
import com.item.entity.ExcelAuthor;
import com.item.tool.Result;

public interface ExcelProcessService {

	/**
	 * 创建流程
	 * 
	 * @param excelApplay
	 * @return
	 */
	int creatExcelProcess(ExcelApplay excelApplay, String author);

	/**
	 * 查询当前用户发起的所有申请
	 * 
	 * @param excelApplay
	 * @return
	 */
	List<ExcelApplay> queryExcelApplayByName(ExcelApplay excelApplay);

	/**
	 * 查询当前人需要审批的流程
	 * 
	 * @param excelAuthor
	 * @return
	 */
	List<ExcelApplay> queryExcelApplayByAuthorName(ExcelAuthor excelAuthor);

	/**
	 * 
	 * @param excelApplay
	 * @param excelAuthor
	 * @return
	 */
	Result<?> updateApplayAndAuthor(ExcelApplay excelApplay, ExcelAuthor excelAuthor);

	/**
	 * 查询该流程对应的评论
	 * 
	 * @return
	 */
	List<ExcelAuthor> queryExcelAuthorByApplayId(ExcelApplay excelApplay);

	/**
	 * 通过当前的用户查询已经审批的步骤
	 * 
	 * @param excelAuthor
	 * @return
	 */
	List<ExcelApplay> queryExcelApplayByAuthor(ExcelAuthor excelAuthor);

	/**
	 * 通过文件名删除
	 */
	void deleteApplayAndAuthor(ExcelApplay excelApplay);

	/**
	 * 查询审批通过的
	 * 
	 * @return
	 */
	List<ExcelApplay> queryExcelApplayByStatus(ExcelApplay excelApplay);

}
