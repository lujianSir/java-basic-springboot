package com.item.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.item.entity.Industry;
import com.item.entity.IndustryModel;
import com.item.entity.Page;
import com.item.service.IndustryService;
import com.item.tool.Result;

@RestController
@RequestMapping(value = "industry")
public class IndustryController {

	@Autowired
	private IndustryService industryService;

	/**
	 * 添加或者修改行业
	 * 
	 * @param industry
	 * @return
	 */
	@RequestMapping(value = "/insertOrUpdateIndustry")
	public Result<?> insertOrUpdateIndustry(Industry industry) {
		return industryService.insertOrUpdateIndustry(industry);
	}

	/**
	 * 删除
	 * 
	 * @param industry
	 * @return
	 */
	@RequestMapping(value = "/deleteIndustry")
	public Result<?> deleteIndustry(Industry industry) {
		return industryService.deleteIndustry(industry);
	}

	/**
	 * 
	 * @param industry
	 * @return
	 */
	@RequestMapping(value = "/insertOrUpdateIndustrys")
	public Result<?> insertOrUpdateIndustrys(String id) {
		int row = industryService.insertOrUpdateIndustrys(id);
		if (row > 0) {
			return Result.success("添加成功");
		} else {
			return Result.error(500, "添加失败");
		}

	}

	/**
	 * 查询行业
	 * 
	 * @param industry
	 * @return
	 */
	@RequestMapping(value = "/queryIndustryServices")
	public Result<?> queryIndustryServices(Industry industry) {
		List<Industry> list = industryService.queryIndustryServices(industry);
		return Result.success(list);
	}

	/**
	 * 授权
	 * 
	 * @param industry
	 * @return
	 */
	@RequestMapping(value = "/insertIndustryModel")
	public Result<?> insertIndustryModel(String mids, String id) {
		List<IndustryModel> list = new ArrayList<IndustryModel>();
		if (mids != null && !mids.equals("")) {
			String[] models = mids.split(",");
			for (int i = 0; i < models.length; i++) {
				IndustryModel industryModel = new IndustryModel();
				industryModel.setId(Integer.parseInt(id));
				industryModel.setMid(Integer.parseInt(models[i]));
				list.add(industryModel);
			}
		}
		int row = industryService.insertIndustryModel(list);
		if (row > 0) {
			return Result.success();
		} else {
			return Result.error(500, "授权失败");
		}
	}

	/**
	 * 查询已经分配的ID
	 * 
	 * @param industryModel
	 * @return
	 */
	@RequestMapping(value = "/queryModelBeanByIid")
	public Result<?> queryModelBeanByIid(IndustryModel industryModel, Page page) {
		PageHelper.startPage(page.getPageNumber(), page.getPageSize());
		List<IndustryModel> list = industryService.queryModelBeanByIid(industryModel);
		PageInfo<IndustryModel> pageInfo = new PageInfo<IndustryModel>(list);
		return Result.success(pageInfo);
	}

	/**
	 * 模型关联
	 * 
	 * @param industryModel
	 * @param style
	 * @return
	 */
	@RequestMapping(value = "/insertOrDeleteIndustryModel")
	public Result<?> insertOrDeleteIndustryModel(IndustryModel industryModel, String style) {
		return industryService.insertOrDeleteIndustryModel(industryModel, style);
	}

}
