package com.item.service;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.item.entity.ExcelContent;
import com.item.entity.ExcelManage;
import com.item.mapper.ExcelMapper;
import com.item.tool.ExcelUtil;
import com.item.tool.JavaTool;
import com.item.tool.Utils;

@Service
@Transactional
public class ExcelServcieImpl implements ExcelServcie {

	@Autowired
	private ExcelMapper excelMapper;

	@Override
	public int importExcelInfo(InputStream in, MultipartFile file, ExcelManage excelManage) throws Exception {
		// TODO Auto-generated method stub

		if (!file.isEmpty()) {
			try {
				// 文件存放服务端的位置
				File dir = null;
				String filename = file.getOriginalFilename();
				excelManage.setExcelname(filename);
				String newrootPath = System.getProperty("user.dir") + "/upload";
				System.out.println(newrootPath);
				dir = new File(newrootPath + File.separator + "excel" + File.separator);
				if (!dir.exists()) {
					dir.mkdirs();
				}
				String filePath = dir.getAbsolutePath() + File.separator + filename;
				excelManage.setRealpath(filePath);
				// 写文件到服务器
				File serverFile = new File(filePath);
				file.transferTo(serverFile);

			} catch (Exception e) {

			}
		}
		String eid = JavaTool.getUserId();
		excelManage.setEid(eid);
		excelManage.setCreattime(Utils.getCurrent());
		List<List<Object>> listob = ExcelUtil.getBankListByExcel(in, file.getOriginalFilename());
		System.out.println(listob);
		List<ExcelContent> excelContentList = new ArrayList<ExcelContent>();
		for (int i = 0; i < listob.size(); i++) {
			List<Object> ob = listob.get(i);
			int total = ob.size();
			ExcelContent excelContent = new ExcelContent();
			excelContent.setEid(eid);
			if (0 < total) {
				excelContent.setStr1(String.valueOf(ob.get(0)));
				ob.remove(0);
			}
			if (1 < total) {
				excelContent.setStr2(String.valueOf(ob.get(0)));
				ob.remove(0);
			}
			if (2 < total) {
				excelContent.setStr3(String.valueOf(ob.get(0)));
				ob.remove(0);
			}
			if (3 < total) {
				excelContent.setStr4(String.valueOf(ob.get(0)));
				ob.remove(0);
			}
			if (4 < total) {
				excelContent.setStr5(String.valueOf(ob.get(0)));
				ob.remove(0);
			}
			if (5 < total) {
				if (ob.size() > 0) {
					String str6 = "";
					for (int m = 0; m < ob.size(); m++) {
						str6 += ob.get(m);
						if (m < ob.size() - 1) {
							str6 += "  ";
						}
					}
					excelContent.setStr6(str6);
				}

			}
			excelContentList.add(excelContent);
		}

		System.out.println(excelContentList);

		excelMapper.insertExcelContent(excelContentList);
		excelManage.setExcelstatus(1);
		int row = excelMapper.insertExcelManage(excelManage);

		return row;
	}

	@Override
	public List<ExcelManage> queryExcelManage(ExcelManage excelManage) {
		// TODO Auto-generated method stub
		return excelMapper.queryExcelManage(excelManage);
	}

	@Override
	public List<ExcelContent> queryExcelContentByEid(ExcelManage excelManage) {
		// TODO Auto-generated method stub
		List<ExcelContent> list = excelMapper.queryExcelContentByEid(excelManage);
		return list;
	}

	@Override
	public int deleteExcelByEid(String eid) {
		// TODO Auto-generated method stub
		ExcelManage excelManage = new ExcelManage();
		excelManage.setEid(eid);
		List<ExcelManage> list = excelMapper.queryExcelManage(excelManage);
		String realpath = list.get(0).getRealpath();
		// 删除文件
		File file = new File(realpath);
		if (file.exists()) {
			file.delete();
		}
		excelMapper.deleteExcelContentByEid(eid);
		int row = excelMapper.deleteExcelManageByEid(eid);
		return row;
	}

	@Override
	public int queryExcelManageByExcelname(String excelname) {
		// TODO Auto-generated method stub
		return excelMapper.queryExcelManageByExcelname(excelname);
	}

	@Override
	public List<ExcelManage> queryByTitle(List<String> list) {
		// TODO Auto-generated method stub
		return excelMapper.queryByTitle(list);
	}

	@Override
	public int updateExcelManage(ExcelManage excelManage) {
		// TODO Auto-generated method stub
		return excelMapper.updateExcelManage(excelManage);
	}

}
