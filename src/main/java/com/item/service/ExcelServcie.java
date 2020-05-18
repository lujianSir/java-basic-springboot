package com.item.service;

import java.io.InputStream;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.item.entity.ExcelContent;
import com.item.entity.ExcelManage;
import com.item.tool.Result;

public interface ExcelServcie {

	/**
	 * 上传excel
	 */
	int importExcelInfo(InputStream in, MultipartFile file, ExcelManage excelManage) throws Exception;

	/**
	 * 批量上传
	 * 
	 * @param in
	 * @param file
	 * @return
	 * @throws Exception
	 */
	Result<?> uploadZipFilesAndParse(MultipartFile file, String userid) throws Exception;

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
	 * 根据ID删除excel信息
	 * 
	 * @param eid
	 * @return
	 */
	int deleteExcelByEid(String eid);

	/**
	 * 通过表单名称进行查询
	 * 
	 * @return
	 */
	int queryExcelManageByExcelname(String excelname);

	/**
	 * 批量查询
	 * 
	 * @param list
	 * @return
	 */
	List<ExcelManage> queryByTitle(List<String> list);

	/**
	 * 编辑
	 * 
	 * @param excelManage
	 * @return
	 */
	int updateExcelManage(ExcelManage excelManage);

}
