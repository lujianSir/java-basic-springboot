package com.item.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.item.entity.ExcelContent;
import com.item.entity.ExcelManage;

@Repository
public interface ExcelMapper {

	/**
	 * 添加表单信息
	 * 
	 * @param excelManage
	 */
	int insertExcelManage(ExcelManage excelManage);

	/**
	 * 添加内容
	 * 
	 * @param excelContent
	 */
	void insertExcelContent(List<ExcelContent> list);

	/**
	 * 查询所有提交的信息
	 * 
	 * @param excelManage
	 * @return
	 */
	List<ExcelManage> queryExcelManage(ExcelManage excelManage);

	/**
	 * 查询excel表格内容
	 * 
	 * @param excelContent
	 * @return
	 */
	List<ExcelContent> queryExcelContentByEid(ExcelManage excelManage);

	/**
	 * 通过ID删除表单信息
	 * 
	 * @param eid
	 * @return
	 */
	int deleteExcelManageByEid(String eid);

	/**
	 * 通过ID删除内容
	 * 
	 * @param eid
	 * @return
	 */
	int deleteExcelContentByEid(String eid);

	/**
	 * 通过表单名称进行查询
	 * 
	 * @return
	 */
	int queryExcelManageByExcelname(String excelname);

	/**
	 * 编辑表单信息
	 * 
	 * @param excelManage
	 * @return
	 */
	int updateExcelManage(ExcelManage excelManage);

	/**
	 * 批量查询
	 * 
	 * @param list
	 * @return
	 */
	List<ExcelManage> queryByTitle(List<String> list);
}
