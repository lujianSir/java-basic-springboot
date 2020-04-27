package com.item.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.item.entity.ExcelContent;
import com.item.entity.ExcelManage;
import com.item.entity.Page;
import com.item.service.ExcelServcie;
import com.item.tool.Result;

@Controller
@RequestMapping("/excel")
public class ExcelController {

	@Autowired
	private ExcelServcie excelServcie;

	@RequestMapping("/test1")
	public String file() {
		return "/file";
	}

	// 表格的导入
	@RequestMapping("/impotr")
	@ResponseBody
	public Result<?> impotr(@RequestParam("file") MultipartFile file, HttpServletRequest request,
			ExcelManage excelManage) throws Exception {

		String filename = file.getOriginalFilename();
		int total = excelServcie.queryExcelManageByExcelname(filename);
		if (total > 0) {
			return Result.error(500, "表格已存在");
		} else {
			InputStream in = file.getInputStream();
			// 数据导入
			int row = excelServcie.importExcelInfo(in, file, excelManage);
			in.close();
			return Result.success("导入成功");
		}

	}

	/**
	 * 分页查询所有的提交信息
	 * 
	 * @param excelManage
	 * @param page
	 * @return
	 */
	@RequestMapping("/queryExcelManage")
	@ResponseBody
	public Result<?> queryExcelManage(ExcelManage excelManage, Page page) {
		PageHelper.startPage(page.getPageNumber(), page.getPageSize());
		List<ExcelManage> list = excelServcie.queryExcelManage(excelManage);
		PageInfo<ExcelManage> pageInfo = new PageInfo<ExcelManage>(list);
		return Result.success(pageInfo);
	}

	/**
	 * 点击查询excel内容
	 * 
	 * @param excelContent
	 * @return
	 */
	@RequestMapping("/queryExcelContentByEid")
	@ResponseBody
	public Result<?> queryExcelManage(ExcelContent excelContent) {
		List<ExcelContent> list = excelServcie.queryExcelContentByEid(excelContent);
		return Result.success(list);
	}

	/**
	 * excel 下载
	 * 
	 * @param response
	 * @param request
	 * @param eid
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/download")
	@ResponseBody
	public Result<?> fileDownload(HttpServletResponse response, HttpServletRequest request, String excelname)
			throws IOException {
		// 文件存放服务端的位置
		// String path = "/usr/local/jar/"+rootPath+"web/模型源文件/";
		String path = System.getProperty("user.dir") + "/upload/excel/";
		path = path.replaceAll("\\\\", "/");
		// String newrootPath = rootPath+"web/模型源文件/";
		System.out.println(path);
		String s = path + excelname;
		// path是指欲下载的文件的路径。
		File file = new File(s);
		// 取得文件名。
		String filename = file.getName();
		if (!file.exists()) {
			System.out.println("Have no such file!");
			return Result.error(500, "文件不存在");
		}
		FileInputStream fileInputStream = new FileInputStream(file);
		// 设置Http响应头告诉浏览器下载这个附件,下载的文件名也是在这里设置的
		response.setHeader("Content-Disposition", "attachment;Filename=" + URLEncoder.encode(filename, "UTF-8"));
		OutputStream outputStream = response.getOutputStream();
		byte[] bytes = new byte[2048];
		int len = 0;
		while ((len = fileInputStream.read(bytes)) > 0) {
			outputStream.write(bytes, 0, len);
		}
		fileInputStream.close();
		outputStream.close();
		System.out.println("成功");
		// JavaTool.download(s, response);
		return Result.success();
	}

	/**
	 * 通过ID删除表信息
	 * 
	 * @param eid
	 * @return
	 */
	@RequestMapping("/deleteExcelByEid")
	@ResponseBody
	public Result<?> deleteExcelByEid(String eid) {
		int row = excelServcie.deleteExcelByEid(eid);
		return Result.success(row);
	}
}
