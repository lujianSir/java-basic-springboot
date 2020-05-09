package com.item.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.item.entity.ApplayAuthor;
import com.item.entity.ExcelApplay;
import com.item.entity.ExcelAuthor;
import com.item.entity.ExcelManage;
import com.item.entity.Page;
import com.item.mapper.ExcelMapper;
import com.item.mapper.ExcelProcessMapper;
import com.item.tool.JavaTool;
import com.item.tool.Result;
import com.item.tool.Utils;

@Service
@Transactional
public class ExcelProcessServiceImpl implements ExcelProcessService {

	@Autowired
	private ExcelProcessMapper excelProcessMapper;

	@Autowired
	private ExcelMapper excelMapper;

	@Override
	public int creatExcelProcess(ExcelApplay excelApplay, String author) {
		// TODO Auto-generated method stub
		String applyid = Utils.getCurrentymdhms();
		excelApplay.setApplyid(applyid);
		excelApplay.setApplystatus(2);
		String creattime = Utils.getCurrent();
		excelApplay.setApplycreattime(creattime);
		List<ExcelAuthor> list = new ArrayList<ExcelAuthor>();
		List<ApplayAuthor> applayAuthors = new ArrayList<ApplayAuthor>();
		if (author != null && !author.equals("")) {
			ExcelAuthor eauthor = new ExcelAuthor();
			String eauthorid = JavaTool.getUserId();
			eauthor.setNumber(1);
			eauthor.setAuthorname(excelApplay.getApplyname());
			eauthor.setAuthorid(eauthorid);
			eauthor.setAuthorstatus(4);
			eauthor.setAuthortime(creattime);
			eauthor.setAuthorreson(excelApplay.getApplyreson());
			list.add(eauthor);

			ApplayAuthor eAuthor = new ApplayAuthor();
			eAuthor.setApplyid(applyid);
			eAuthor.setAuthorid(eauthorid);
			applayAuthors.add(eAuthor);

			String[] authors = author.split(",");
			for (int i = 0; i < authors.length; i++) {
				ExcelAuthor excelAuthor = new ExcelAuthor();
				excelAuthor.setAuthorname(authors[i]);
				String authorid = JavaTool.getUserId();
				excelAuthor.setAuthorid(authorid);
				excelAuthor.setNumber(i + 2);
				if (authors.length > 1) {
					if (i == 0) {
						excelAuthor.setAuthorstatus(2);
					} else {
						excelAuthor.setAuthorstatus(1);
					}

				} else {
					excelAuthor.setAuthorstatus(2);
				}
				list.add(excelAuthor);

				ApplayAuthor applayAuthor = new ApplayAuthor();
				applayAuthor.setApplyid(applyid);
				applayAuthor.setAuthorid(authorid);
				applayAuthors.add(applayAuthor);
			}
		}
		excelProcessMapper.insertExcelAuthor(list);
		excelProcessMapper.insertApplayAuthor(applayAuthors);

		ExcelManage excelManage = new ExcelManage();
		excelManage.setExcelname(excelApplay.getExcelname());
		excelManage.setExcelstatus(2);
		excelMapper.updateExcelManageStauts(excelManage);

		int row = excelProcessMapper.creatExcelProcess(excelApplay);
		return row;
	}

	@Override
	public Page queryExcelApplayByName(ExcelApplay excelApplay, Page page) {
		// TODO Auto-generated method stub
		List<ExcelApplay> list = excelProcessMapper.queryExcelApplayByNamePage(excelApplay, page);
		for (int i = 0; i < list.size(); i++) {
			ExcelApplay eApplay = list.get(i);
			List<ExcelAuthor> eAuthors = excelProcessMapper.queryExcelAuthorByApplayId(eApplay);
			list.get(i).setExcelMessages(eAuthors);
		}
		int total = excelProcessMapper.queryCountApplay(excelApplay);
		page.setList(list);
		page.setTotal(total);
		return page;
	}

	@Override
	public List<ExcelApplay> queryExcelApplayByAuthorName(ExcelAuthor excelAuthor) {
		// TODO Auto-generated method stub
		return excelProcessMapper.queryExcelApplayByAuthorName(excelAuthor);
	}

	@Override
	public Result<?> updateApplayAndAuthor(ExcelApplay excelApplay, ExcelAuthor excelAuthor) {
		// TODO Auto-generated method stub
		excelAuthor.setAuthortime(Utils.getCurrent());
		List<ExcelApplay> excelApplays = excelProcessMapper.queryExcelApplayByName(excelApplay);
		ExcelApplay applay = excelApplays.get(0);
		List<ExcelAuthor> excelAuthors = excelApplays.get(0).getExcelAuthors();
		List<ExcelAuthor> otherexcelAuthors = new ArrayList<ExcelAuthor>();
		for (int p = 0; p < excelAuthors.size(); p++) {
			otherexcelAuthors.add(excelAuthors.get(p));
		}
		int num = 0;
		if (excelAuthors.size() == 1 || excelAuthor.getAuthorstatus() == 3) {
			if (excelAuthor.getAuthorstatus() == 3) {
				for (int j = 0; j < excelAuthors.size(); j++) {
					if (otherexcelAuthors.get(0).getAuthorid().equals(excelAuthor.getAuthorid())) {
						otherexcelAuthors.remove(0);
						break;
					} else {
						otherexcelAuthors.remove(0);
					}
				}
				if (otherexcelAuthors.size() > 0) {
					for (int m = 0; m < otherexcelAuthors.size(); m++) {
						ExcelAuthor exau = otherexcelAuthors.get(m);
						exau.setAuthorstatus(5);
						excelProcessMapper.updateExcelAuthor(exau);
					}
				}
			}
			applay.setApplystatus(excelAuthor.getAuthorstatus());
			excelProcessMapper.updateExcelApplay(applay);
			excelProcessMapper.updateExcelAuthor(excelAuthor);

			ExcelManage excelManage = new ExcelManage();// 修改文件的状态
			excelManage.setExcelname(applay.getExcelname());
			excelManage.setExcelstatus(excelAuthor.getAuthorstatus());
			excelMapper.updateExcelManageStauts(excelManage);
		} else {
			for (int i = 0; i < excelAuthors.size(); i++) {
				ExcelAuthor author = excelAuthors.get(i);// 2 1 1 421 441 444
				if (author.getAuthorstatus() == 2) {
					author.setAuthorstatus(excelAuthor.getAuthorstatus());
					if (excelAuthors.size() != num + 1) {
						ExcelAuthor nextauthor = excelAuthors.get(i + 1);
						nextauthor.setAuthorstatus(2);
						excelProcessMapper.updateExcelAuthor(nextauthor);
					}
					excelProcessMapper.updateExcelAuthor(excelAuthor);
					if (excelAuthor.getAuthorstatus() == 4) {
						num++;
					}
					break;
				} else {
					num++;
					continue;
				}

			}
			if (num == excelAuthors.size()) {
				applay.setApplystatus(4);
				excelProcessMapper.updateExcelApplay(applay);

				ExcelManage excelManage = new ExcelManage();// 修改文件的状态
				excelManage.setExcelname(applay.getExcelname());
				excelManage.setExcelstatus(4);
				excelMapper.updateExcelManageStauts(excelManage);

			}

		}

		return Result.success();
	}

	@Override
	public List<ExcelAuthor> queryExcelAuthorByApplayId(ExcelApplay excelApplay) {
		// TODO Auto-generated method stub
		return excelProcessMapper.queryExcelAuthorByApplayId(excelApplay);
	}

	@Override
	public List<ExcelApplay> queryExcelApplayByAuthor(ExcelAuthor excelAuthor) {
		// TODO Auto-generated method stub
		List<ExcelApplay> list = excelProcessMapper.queryExcelApplayByAuthor(excelAuthor);
		for (int i = 0; i < list.size(); i++) {
			ExcelApplay excelApplay = list.get(i);
			List<ExcelAuthor> eAuthors = excelProcessMapper.queryExcelAuthorByApplayId(excelApplay);
			list.get(i).setExcelMessages(eAuthors);
			String str = "";
			for (int j = 0; j < eAuthors.size(); j++) {
				str += eAuthors.get(j).getAuthorname();
				if (j < eAuthors.size() - 1) {
					str += " ";
				}
			}
			list.get(i).setAuthornames(str);

		}
		return list;
	}

	@Override
	public void deleteApplayAndAuthor(ExcelApplay excelApplay) {
		// TODO Auto-generated method stub
		ExcelApplay eapplay = excelProcessMapper.queryApplayByExcelName(excelApplay.getExcelname());
		if (eapplay != null) {
			List<ApplayAuthor> list = excelProcessMapper.queryApplayAuthorByApplayId(eapplay.getApplyid());
			for (int i = 0; i < list.size(); i++) {
				ApplayAuthor applayAuthor = list.get(i);
				excelProcessMapper.deleteExcelAuthorByAuthorid(applayAuthor.getAuthorid());
			}
			excelProcessMapper.deleteApplayByExcelName(excelApplay.getExcelname());
		}

	}

	@Override
	public List<ExcelApplay> queryExcelApplayByStatus(ExcelApplay excelApplay) {
		// TODO Auto-generated method stub
		return null;
	}

}
