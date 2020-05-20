package com.item.service;

import java.util.List;

import com.item.entity.Industry;
import com.item.entity.IndustryModel;
import com.item.tool.Result;

/**
 * 行业接口
 * 
 * @author Administrator
 *
 */
public interface IndustryService {

	/**
	 * 添加或者修改行业信息
	 * 
	 * @param industry
	 * @return
	 */
	Result<?> insertOrUpdateIndustry(Industry industry);

	/**
	 * 批量添加行业信息
	 * 
	 * @param list
	 * @return
	 */
	int insertOrUpdateIndustrys(String id);

	/**
	 * 删除
	 * 
	 * @param industry
	 * @return
	 */
	Result<?> deleteIndustry(Industry industry);

	/**
	 * 查询
	 * 
	 * @param industry
	 * @return
	 */
	List<Industry> queryIndustryServices(Industry industry);

	/**
	 * 授权绑定
	 * 
	 * @param industryModel
	 * @return
	 */
	int insertIndustryModel(List<IndustryModel> list);

	/**
	 * 查询模型是否已经分配
	 * 
	 * @param industryModel
	 * @return
	 */
	List<IndustryModel> queryModelBeanByIid(IndustryModel industryModel);

	/**
	 * 添加或者删除模型关联
	 * 
	 * @param industryModel
	 * @return
	 */
	Result<?> insertOrDeleteIndustryModel(IndustryModel industryModel, String style);

}
