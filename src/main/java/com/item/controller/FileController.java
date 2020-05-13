package com.item.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.item.alipay.FlowModel;
import com.item.entity.Image;
import com.item.entity.ModelBean;
import com.item.entity.Page;
import com.item.entity.StarClass;
import com.item.service.FileService;
import com.item.service.PayService;
import com.item.tool.JavaTool;
import com.item.tool.Result;

/**
 * 文件上传、模型上传
 * 
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

	@RequestMapping("/test2")
	public String multiFile() {
		return "/file";
	}

	/**
	 * 实现文件上传1
	 */
	@RequestMapping("/upload")
	@ResponseBody
	public Result<?> fileUpload(@RequestParam("file") MultipartFile file, @RequestParam("catalog") String catalog,
			@RequestParam("role") int role, HttpServletRequest request) {
		return fileService.fileUpload(file, request, catalog, role);
	}

	/**
	 * 文件下载
	 * 
	 * @param response
	 * @param request
	 * @return
	 */

	@RequestMapping(value = "/download")
	@ResponseBody
	public Result<?> fileDownload(HttpServletResponse response, HttpServletRequest request, String fileModel,
			String filepic, String mid) throws IOException {

		if (mid != null && !mid.equals("")) {
			ModelBean modelBean = new ModelBean();
			modelBean.setMid(Integer.parseInt(mid));
			fileService.updateModelInfoById(modelBean);
		}
		String path = "";
		String s = "";
		if (fileModel != null && !fileModel.equals("")) {
			path = System.getProperty("user.dir") + "/upload/web/模型源文件/";
			s = path + fileModel;
		}
		if (filepic != null && !filepic.equals("")) {
			path = System.getProperty("user.dir") + "/upload/web/模型封面/";
			s = path + filepic;
		}
		// 文件存放服务端的位置
		// String path = "/usr/local/jar/"+rootPath+"web/模型源文件/";

		path = path.replaceAll("\\\\", "/");
		// String newrootPath = rootPath+"web/模型源文件/";
		System.out.println(path);

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
	 * 通过ID删除文件
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/deleteFileById")
	@ResponseBody
	public Result<?> fileDelete(String id, String mid) {
		return fileService.fileDelete(id, mid);
	}

	/**
	 * 模型数据录入、修改
	 */
	@RequestMapping("/model")
	@ResponseBody
	public Result<?> modelUpload(String modelname, String modelprice, String unitprice, String buildtype,
			String resource_one, String resource_two, String resource_three, String resource_four, String mdescribe,
			String filePics, String fileModel, String mid, String userid, String modelstatus, String examine,
			String examinepeople, String examineremark) {
		ModelBean model = new ModelBean();
		model.setBuildtype(buildtype);
		model.setMdescribe(mdescribe);
		model.setModelname(modelname);
		if (modelprice != null && !modelprice.equals("")) {
			model.setModelprice(Double.parseDouble(modelprice));
		}
		if (unitprice != null && !unitprice.equals("")) {
			model.setUnitprice(Double.parseDouble(unitprice));
		}
		model.setResource_one(resource_one);
		model.setResource_two(resource_two);
		model.setResource_three(resource_three);
		model.setResource_four(resource_four);
		model.setFilePics(filePics);
		model.setFileModel(fileModel);
		model.setUserid(userid);
		model.setCreatTime(JavaTool.getCurrent());
		model.setExamineremark(examineremark);
		if (modelstatus != null && !modelstatus.equals("")) {
			model.setModelstatus(Integer.parseInt(modelstatus));
		}

		if (mid != null && !mid.equals("")) {
			model.setMid(Integer.parseInt(mid));
		} else {
			model.setExamine(0);
		}
		if (examine != null && !examine.equals("")) {
			model.setExamine(Integer.parseInt(examine));
		}

		if (examinepeople != null && !examinepeople.equals("")) {
			model.setExaminepeople(examinepeople);
			model.setExaminetime(JavaTool.getCurrent());
		}
		return fileService.modelUpload(model);
	}

	/**
	 * 后台查询所有的模型
	 * 
	 * @param modelBean
	 * @param page
	 * @return
	 */
	@RequestMapping("/queryModelsByAdmin")
	@ResponseBody
	public Result<?> queryModelsByAdmin(ModelBean modelBean, Page page) {
		PageHelper.startPage(page.getPageNumber(), page.getPageSize());
		List<ModelBean> list = fileService.queryModelsByAdmin(modelBean);
		for (int i = 0; i < list.size(); i++) {
			List<Image> images = new ArrayList<Image>();
			String pics = list.get(i).getFilePics();
			if (pics != null && !pics.equals("")) {
				String[] ps = pics.split(",");
				for (int j = 0; j < ps.length; j++) {
					Image image = new Image();
					image.setPic(ps[j]);
					images.add(image);
				}
				list.get(i).setImages(images);
			}
		}
		PageInfo<ModelBean> pageInfo = new PageInfo<ModelBean>(list);
		return Result.success(pageInfo);
	}

	/**
	 * 模型审核
	 * 
	 * @param modelBean
	 * @param page
	 * @return
	 */
	@RequestMapping("/queryModelsExamine")
	@ResponseBody
	public Result<?> queryModelsExamine(ModelBean modelBean, Page page, String examinename) {
		if (examinename != null && !examinename.equals("")) {
			modelBean.setExamine(Integer.parseInt(examinename));
		}
		PageHelper.startPage(page.getPageNumber(), page.getPageSize());
		List<ModelBean> list = fileService.queryModelsExamine(modelBean);
		for (int i = 0; i < list.size(); i++) {
			List<Image> images = new ArrayList<Image>();
			String pics = list.get(i).getFilePics();
			if (pics != null && !pics.equals("")) {
				String[] ps = pics.split(",");
				for (int j = 0; j < ps.length; j++) {
					Image image = new Image();
					image.setPic(ps[j]);
					images.add(image);
				}
				list.get(i).setImages(images);
			}
		}
		PageInfo<ModelBean> pageInfo = new PageInfo<ModelBean>(list);
		return Result.success(pageInfo);
	}

	/**
	 * 删除模型信息
	 * 
	 * @param modelBean
	 * @return
	 */
	@RequestMapping("/deleteModelInfoByMid")
	@ResponseBody
	public Result<?> deleteModelInfoByMid(ModelBean modelBean) {
		ModelBean m = fileService.queryModelById(modelBean.getMid());
		String filePics = m.getFilePics();
		if (filePics != null && !filePics.equals("")) {
			String[] pics = filePics.split(",");
			for (int i = 0; i < pics.length; i++) {
				String pic = pics[i];
				fileService.fileinfoDelete(pic);
			}
		}
		String fileModel = m.getFileModel();
		if (fileModel != null && !fileModel.equals("")) {
			fileService.fileinfoDelete(fileModel);
		}
		int row = fileService.deleteModelInfoByMid(modelBean);
		return Result.success(row);
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

	/**
	 * 商城界面加载数据
	 * 
	 */
	@RequestMapping("/store")
	@ResponseBody
	public Result<?> webStoreQuery() {
		return fileService.webStoreQuery();
	}

	/**
	 * 商城分页查询
	 * 
	 * @param modelBean  模型属性
	 * @param page       分页属性
	 * @param startPrice 开始价格
	 * @param endPrice   结尾价格
	 * @return
	 */
	@RequestMapping("/queryModels")
	@ResponseBody
	public Result<?> queryModels(ModelBean modelBean, Page page, String startPrice, String endPrice, String price,
			String orderBy) {
		if (price != null && !price.equals("")) {
			modelBean.setModelprice(Double.parseDouble(price));
		}
		return fileService.queryModels(modelBean, page, startPrice, endPrice, orderBy);
	}

	/**
	 * 通过ID查询模型的信息
	 * 
	 * @param mid 模型ID
	 * @return
	 */
	@RequestMapping("/queryModelById")
	@ResponseBody
	public Result<?> queryModelById(String mid, String uid) {
		FlowModel flowModel = new FlowModel();
		flowModel.setMid(Integer.parseInt(mid));
		flowModel.setUid(uid);
		payService.updateFlowModelByUserIdAndMid(flowModel);
		return fileService.queryModelById(mid, uid);
	}

	/**
	 * 查询已购模型
	 * 
	 * @param uid
	 * @param page
	 * @return
	 */
	@RequestMapping("/selectFlowModelByUserId")
	@ResponseBody
	public Result<?> selectFlowModelByUserId(String uid, Page page) {
		PageHelper.startPage(page.getPageNumber(), page.getPageSize());
		List<FlowModel> list = payService.selectFlowModelByUserId(uid);
		for (int i = 0; i < list.size(); i++) {
			List<Image> images = new ArrayList<Image>();
			String filePics = list.get(i).getFilePics();
			if (filePics != null && !filePics.equals("")) {
				String[] pics = filePics.split(",");
				for (int j = 0; j < pics.length; j++) {
					Image image = new Image();
					image.setPic(pics[j]);
					images.add(image);
				}
				list.get(i).setImages(images);
			}

		}
		PageInfo<FlowModel> pageInfo = new PageInfo<FlowModel>(list);
		return Result.success(pageInfo);
	}

	/**
	 * 添加点评
	 * 
	 * @param starClass
	 * @return
	 */
	@RequestMapping("/insertStarClass")
	@ResponseBody
	public Result<?> insertStarClass(StarClass starClass) {
		return fileService.insertStarClass(starClass);
	}
}
