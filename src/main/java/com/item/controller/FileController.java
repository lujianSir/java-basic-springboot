package com.item.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.item.entity.ModelBean;
import com.item.entity.Page;
import com.item.service.FileService;
import com.item.tool.Result;
/**
 * 文件上传、模型上传
 * @author Administrator
 *
 */
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
	 * 通过ID删除文件
	 * @param id
	 * @return
	 */
	@RequestMapping("/deleteFileById")
	@ResponseBody
	public Result<?> fileDelete(String id){	
		return fileService.fileDelete(id);
	}
	
	
	/**
	 * 模型数据录入、修改
	 */
	@RequestMapping("/model")
	@ResponseBody
	public Result<?> modelUpload(String modelname,String resource_two, String modelprice,String buildtype, String resource_one,
			 String describe, String filePics, String fileModel,String mid) {
		ModelBean model = new ModelBean();
		model.setBuildtype(buildtype);
		model.setDescribe(describe);
		model.setModelname(modelname);
		if(modelprice!=null && !modelprice.equals("")) {
			model.setModelprice(Double.parseDouble(modelprice));
		}	
		model.setResource_one(resource_one);
		model.setResource_two(resource_two);
		model.setFilePics(filePics);
		model.setFileModel(fileModel);
		if(mid!=null && !mid.equals("")) {
			model.setMid(Integer.parseInt(mid));
		}
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

	/**
	 * 商城分页查询
	 * @param modelBean 模型属性
	 * @param page 分页属性
	 * @param startPrice 开始价格
	 * @param endPrice 结尾价格
	 * @return
	 */
	@RequestMapping("/queryModels")
	@ResponseBody
	public Result<?> queryModels(ModelBean modelBean,Page page,String startPrice ,String endPrice,String price,String orderBy){
		if(price!=null &&! price.equals("")) {
			modelBean.setModelprice(Double.parseDouble(price));
		}
		return fileService.queryModels(modelBean, page, startPrice, endPrice,orderBy);
	}
	
	/**
	 * 通过ID查询模型的信息
	 * @param mid 模型ID
	 * @return
	 */
	public Result<?> queryModelById(String  mid){
		return fileService.queryModelById(mid);
	}
	
	
	
}
