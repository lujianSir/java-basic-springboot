package com.item.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.item.entity.ModelBean;
import com.item.service.FileService;
import com.item.tool.Result;

@Controller
@RequestMapping(value = "file")
public class FileController {

	@Autowired
	private FileService fileService;

	@RequestMapping("/test1")
	public String file() {
		return "/file";
	}

	@RequestMapping("/test2")
	public String multiFile() {
		return "/multifile";
	}

	/**
	 * 实现文件上传
	 */
	@RequestMapping("/upload")
	@ResponseBody
	public Result<?> fileUpload(@RequestParam("file") MultipartFile file, @RequestParam("catalog") String catalog,
			@RequestParam("role") int role, HttpServletRequest request) {
		return fileService.fileUpload(file, request, catalog, role);
	}

	/**
	 * 模型数据录入
	 */
	@RequestMapping("/model")
	@ResponseBody
	public Result<?> modelUpload(@RequestParam("modelname") String modelname,
			@RequestParam("resource_two") String resource_two, @RequestParam("modelprice") double modelprice,
			@RequestParam("buildtype") String buildtype, @RequestParam("resource_one") String resource_one,
			@RequestParam("describe") String describe) {

		ModelBean model = new ModelBean();
		model.setBuildtype(buildtype);
		model.setDescribe(describe);
		model.setModelname(modelname);
		model.setModelprice(modelprice);
		model.setResource_one(resource_one);
		model.setResource_two(resource_two);

		return fileService.modelUpload(model);
	}

	/**
	 * 根据文件名称查询数据
	 */
	@RequestMapping("/query")
	@ResponseBody
	public Result<?> fileinfoQuery(@RequestParam("filename") String filename) {
		return fileService.fileinfoQuery(filename);
	}

	/**
	 * 根据文件名称删除数据
	 */
	@RequestMapping("/delete")
	@ResponseBody
	public Result<?> fileinfoDelete(@RequestParam("filename") String filename) {
		return fileService.fileinfoDelete(filename);
	}
	
	/** 商城界面加载数据
	 * 
	 */
	@RequestMapping("/store")
	@ResponseBody
	public Result<?> webStoreQuery(){
		return fileService.webStoreQuery();
	}

}
