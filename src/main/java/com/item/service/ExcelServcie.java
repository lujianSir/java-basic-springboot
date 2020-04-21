package com.item.service;

import java.io.InputStream;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.item.entity.ExcelContent;
import com.item.entity.ExcelManage;

public interface ExcelServcie {

	/**
	 * 上传excel
	 */
	int importExcelInfo(InputStream in, MultipartFile file, ExcelManage excelManage) throws Exception;

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
	List<ExcelContent> queryExcelContentByEid(ExcelContent excelContent);

	/**
	 * 根据ID删除excel信息
	 * 
	 * @param eid
	 * @return
	 */
	int deleteExcelByEid(String eid);

}
