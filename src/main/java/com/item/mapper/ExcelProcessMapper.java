package com.item.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.item.entity.ApplayAuthor;
import com.item.entity.ExcelApplay;
import com.item.entity.ExcelAuthor;

@Repository
public interface ExcelProcessMapper {

	/**
	 * 创建流程
	 * 
	 * @param excelApplay
	 * @return
	 */
	int creatExcelProcess(ExcelApplay excelApplay);

	/**
	 * 批量添加审批人员
	 * 
	 * @param list
	 */
	void insertExcelAuthor(List<ExcelAuthor> list);

	/**
	 * 添加第三方
	 * 
	 * @param list
	 */
	void insertApplayAuthor(List<ApplayAuthor> list);

	/**
	 * 通过名称查询发起的申请
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
	 * 修改流程的熟属性
	 * 
	 * @param excelApplay
	 */
	void updateExcelApplay(ExcelApplay excelApplay);

	/**
	 * 修改审批人的属性
	 * 
	 * @param excelAuthor
	 */
	void updateExcelAuthor(ExcelAuthor excelAuthor);

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
}
