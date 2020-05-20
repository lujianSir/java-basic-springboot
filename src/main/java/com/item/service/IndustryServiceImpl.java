package com.item.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.item.entity.Industry;
import com.item.entity.IndustryModel;
import com.item.mapper.IndustryMapper;
import com.item.tool.Result;

@Service
@Transactional
public class IndustryServiceImpl implements IndustryService {

	@Autowired
	private IndustryMapper industryMapper;

	@Override
	public int insertOrUpdateIndustry(Industry industry) {
		// TODO Auto-generated method stub
		int row = 0;
		if (industry.getId() > 0) {// 编辑
			row = industryMapper.updateIndustry(industry);
		} else {
			row = industryMapper.insertIndustry(industry);
		}
		return row;
	}

	@Override
	public int deleteIndustry(Industry industry) {
		// TODO Auto-generated method stub
		return industryMapper.deleteIndustry(industry);
	}

	@Override
	public List<Industry> queryIndustryServices(Industry industry) {
		// TODO Auto-generated method stub
		List<Industry> list = industryMapper.queryIndustryServices(industry);
		list = parseMenuTree(list);
		return list;
	}

	public static List<Industry> parseMenuTree(List<Industry> list) {
		List<Industry> result = new ArrayList<Industry>();

		// 1、获取第一级节点
		for (Industry industry : list) {
			if (industry.getPid() == 0) {
				result.add(industry);
			}
		}

		// 2、递归获取子节点
		for (Industry parent : result) {
			parent = recursiveTree(parent, list);
		}

		return result;
	}

	public static Industry recursiveTree(Industry parent, List<Industry> list) {
		for (Industry industry : list) {
			if (Objects.equals(parent.getId(), industry.getPid())) {
				industry = recursiveTree(industry, list);
				parent.getChildrens().add(industry);
			}
		}

		return parent;
	}

	@Override
	public int insertIndustryModel(List<IndustryModel> list) {
		// TODO Auto-generated method stub
		return industryMapper.insertIndustryModel(list);
	}

	@Override
	public List<IndustryModel> queryModelBeanByIid(IndustryModel industryModel) {
		// TODO Auto-generated method stub
		List<IndustryModel> list = industryMapper.queryModelBeanByIid(industryModel);
		String modelpic = "";
		for (int i = 0; i < list.size(); i++) {
			String pic = list.get(i).getModelpic();
			if (pic != null && !pic.equals("")) {
				String[] pics = pic.split(",");
				modelpic = pics[0];
			}
			list.get(i).setModelpic(modelpic);
		}
		return list;
	}

	@Override
	public Result<?> insertOrDeleteIndustryModel(IndustryModel industryModel, String style) {
		// TODO Auto-generated method stub
		int row = 0;
		if (style != null && !style.equals("")) {
			if (Integer.parseInt(style) == 1) {
				row = industryMapper.insertIndustryModelByIdAndMid(industryModel);
				if (row > 0) {
					return Result.success("添加成功");
				} else {
					return Result.error(500, "添加失败");
				}
			} else {
				row = industryMapper.deleteIndustryModelByIdAndMid(industryModel);
				if (row > 0) {
					return Result.success("删除成功");
				} else {
					return Result.error(501, "删除失败");
				}
			}
		} else {
			return Result.error(502, "");
		}

	}

}
