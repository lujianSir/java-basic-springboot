package com.item.service;

import java.util.List;

import com.item.entity.Industry;
import com.item.entity.IndustryModel;

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
	int insertOrUpdateIndustry(Industry industry);

	/**
	 * 删除
	 * 
	 * @param industry
	 * @return
	 */
	int deleteIndustry(Industry industry);

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

}
