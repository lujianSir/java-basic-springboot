package com.item.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.item.alipay.FlowModel;
import com.item.entity.ModelBean;
import com.item.entity.Page;
import com.item.service.FileService;
import com.item.service.PayService;
import com.item.tool.JavaTool;
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
	
	@Autowired
	private PayService payService;

	@Value("${disk-path}")
	private String rootPath;
	
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
	 * 文件下载
	 * @param response
	 * @param request
	 * @return
	 */

	@RequestMapping(value = "/download")
	@ResponseBody
	public Result<?> fileDownload(HttpServletResponse response,HttpServletRequest request,String fileModel) throws IOException  {	
		// 文件存放服务端的位置		
		//String path = "/usr/local/jar/"+rootPath+"web/模型源文件/";
		String path = rootPath+"web/模型源文件/";
		System.out.println(path);
		String s = path + fileModel;
		// path是指欲下载的文件的路径。
	     File file = new File(s);
	     // 取得文件名。
	     String filename = file.getName();
	     if(!file.exists()){
             System.out.println("Have no such file!");
             return Result.error(500, "文件不存在");
         }
	     FileInputStream fileInputStream = new FileInputStream(file);
         //设置Http响应头告诉浏览器下载这个附件,下载的文件名也是在这里设置的
         response.setHeader("Content-Disposition", "attachment;Filename=" + URLEncoder.encode(filename, "UTF-8"));
         OutputStream outputStream = response.getOutputStream();
         byte[] bytes = new byte[2048];
         int len = 0;
         while ((len = fileInputStream.read(bytes))>0){
             outputStream.write(bytes,0,len);
         }
         fileInputStream.close();
         outputStream.close();
         System.out.println("成功");
		//JavaTool.download(s, response);
		return Result.success();
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
	public Result<?> modelUpload(String modelname,String resource_two, String modelprice,String unitprice,String buildtype, String resource_one,
			 String describe, String filePics, String fileModel,String mid,String userid) {
		ModelBean model = new ModelBean();
		model.setBuildtype(buildtype);
		model.setDescribe(describe);
		model.setModelname(modelname);
		if(modelprice!=null && !modelprice.equals("")) {
			model.setModelprice(Double.parseDouble(modelprice));
		}
		if(unitprice!=null && !unitprice.equals("")) {
			model.setUnitprice(Double.parseDouble(unitprice));
		}
		model.setResource_one(resource_one);
		model.setResource_two(resource_two);
		model.setFilePics(filePics);
		model.setFileModel(fileModel);
		model.setUserid(userid);
		model.setCreatTime(JavaTool.getCurrent());
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
	@RequestMapping("/queryModelById")
	@ResponseBody
	public Result<?> queryModelById(String  mid,String uid){
		return fileService.queryModelById(mid,uid);
	}
	
	/**
	 * 查询已购模型
	 * @param uid
	 * @param page
	 * @return
	 */
	@RequestMapping("/selectFlowModelByUserId")
	@ResponseBody
	public Result<?> selectFlowModelByUserId(String uid,Page page){		
		PageHelper.startPage(page.getPageNumber(), page.getPageSize());
		List<FlowModel> list=payService.selectFlowModelByUserId(uid); 
		PageInfo<FlowModel> pageInfo = new PageInfo<FlowModel>(list);		
		return Result.success(pageInfo);
	}
	
}
