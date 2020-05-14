package com.item.service;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.item.config.FileUploadProperties;
import com.item.entity.ExcelContent;
import com.item.entity.ExcelManage;
import com.item.mapper.ExcelMapper;
import com.item.tool.ExcelUtil;
import com.item.tool.FileUtil;
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
	@Cacheable(value = "excelContentList", key = "#excelManage.excelname")
	public List<ExcelContent> queryExcelContentByEid(ExcelManage excelManage) {
		// TODO Auto-generated method stub
		List<ExcelContent> list = excelMapper.queryExcelContentByEid(excelManage);
		return list;
	}

	@Override
	@CacheEvict(value = "excelContentList", allEntries = true)
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

	@Override
	public String uploadZipFilesAndParse(InputStream in, MultipartFile file) throws Exception {
		// TODO Auto-generated method stub

		String filename = file.getOriginalFilename();
		String name = filename.substring(0, filename.indexOf("."));
		String fileType = filename.substring(filename.lastIndexOf(".") + 1).toLowerCase(Locale.US);
		String gettime = Utils.getCurrenttime();
		// 判断文件是不是zip类型
		if (fileType.equals("zip")) {
			String desPath = FileUploadProperties.getLocation() + File.separator + gettime;
			// 文件存放服务端的位置
			File dir = null;
			// 下面这三行的代码就是把上传文件copy到服务器，一定不要遗漏了。
			// 遗漏了这个代码，在本地测试环境不会出问题，在服务器上一定会报没有找到文件的错误
			String savePath = FileUploadProperties.getLocation();
			dir = new File(savePath);
			if (!dir.exists()) {
				dir.mkdirs();
			}
			String filePath = dir.getAbsolutePath() + File.separator + filename;
			File savefile = new File(filePath);
			file.transferTo(savefile);
			FileUtil fileUtil = new FileUtil();
			// 解压zip文件
			FileUtil.unZip(file, desPath, savePath);

			// 读取文件夹里面的excel文件
			String strPath = desPath + File.separator + name;

			List<File> list = getFileList(strPath);
			System.out.println(list.get(0).getName());
			List<List<Object>> listob = ExcelUtil.getBankListByExcel(in, file.getOriginalFilename());
			System.out.println(listob);

			FileUtil.clearFiles(filePath);
		}
		return null;
	}

	// 获取excel表格
	public static List<File> getFileList(String strPath) {
		List<File> filelist = new ArrayList<File>();
		File dir = new File(strPath);
		File[] files = dir.listFiles(); // 该文件目录下文件全部放入数组
		if (files != null) {
			for (int i = 0; i < files.length; i++) {
				String fileName = files[i].getName();
				if (files[i].isDirectory()) { // 判断是文件还是文件夹
					getFileList(files[i].getAbsolutePath()); // 获取文件绝对路径
				} else if (fileName.endsWith(".xls") || fileName.endsWith(".xlsx")) { // 判断文件名是否以.avi结尾
					String strFileName = files[i].getAbsolutePath();
					System.out.println("---" + strFileName);
					filelist.add(files[i]);
				} else {
					continue;
				}
			}

		}
		return filelist;
	}
}
