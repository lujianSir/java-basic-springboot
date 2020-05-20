package com.item.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.item.entity.Industry;
import com.item.entity.IndustryModel;

@Repository
public interface IndustryMapper {

	/**
	 * 添加
	 * 
	 * @param industry
	 * @return
	 */
	int insertIndustry(Industry industry);

	/**
	 * 修改
	 * 
	 * @param industry
	 * @return
	 */
	int updateIndustry(Industry industry);

	/**
	 * 删除
	 * 
	 * @param industry
	 * @return
	 */
	int deleteIndustry(Industry industry);

	/**
	 * 查询是否存在子集
	 * 
	 * @param industry
	 * @return
	 */
	List<Industry> queryIndustryChildrens(Industry industry);

	/**
	 * 查询
	 * 
	 * @param industry
	 * @return
	 */
	List<Industry> queryIndustryServices(Industry industry);

	/**
	 * 批量添加授权
	 * 
	 * @param list
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
	 * 添加模型关联
	 * 
	 * @param industryModel
	 * @return
	 */
	int insertIndustryModelByIdAndMid(IndustryModel industryModel);

	/**
	 * 删除模型关联
	 * 
	 * @param industryModel
	 * @return
	 */
	int deleteIndustryModelByIdAndMid(IndustryModel industryModel);

	/**
	 * 批量添加行业信息
	 * 
	 * @param list
	 * @return
	 */
	int insertOrUpdateIndustrys(List<Industry> list);

	/**
	 * 查询行业是否已经绑定
	 * 
	 * @param industry
	 * @return
	 */
	List<IndustryModel> queryModelsById(Industry industry);
}
