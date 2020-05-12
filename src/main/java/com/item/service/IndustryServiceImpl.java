package com.item.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.item.entity.Industry;
import com.item.entity.IndustryModel;
import com.item.mapper.IndustryMapper;

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
		return industryMapper.queryIndustryServices(industry);
	}

	@Override
	public int insertIndustryModel(List<IndustryModel> list) {
		// TODO Auto-generated method stub
		return industryMapper.insertIndustryModel(list);
	}

	@Override
	public List<IndustryModel> queryModelBeanByIid(IndustryModel industryModel) {
		// TODO Auto-generated method stub
		return industryMapper.queryModelBeanByIid(industryModel);
	}

}
