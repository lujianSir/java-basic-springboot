package com.item.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

import com.item.entity.ModelBean;
import com.item.entity.Page;
import com.item.entity.StarClass;
import com.item.tool.Result;

public interface FileService {

	// 文件信息上传
	public Result<?> fileUpload(MultipartFile file, HttpServletRequest request, String catalog, int role);

	// 通过id删除文件
	public Result<?> fileDelete(String id, String mid);

	// 模型信息录入、修改
	public Result<?> modelUpload(ModelBean model);

	// 根据文件名查询出数据信息
	public Result<?> fileinfoQuery(String filename);

	// 文件信息删除
	public Result<?> fileinfoDelete(String filename);

	// 查询所有的商城数据(后台)
	public List<ModelBean> queryModelsByAdmin(ModelBean modelBean);

	// 查询需要审核的模型审核
	public List<ModelBean> queryModelsExamine(ModelBean modelBean);

	// 根据模型ID查询模型信息
	public ModelBean queryModelById(int mid);

	// 通过模型ID删除模型以及对应的图片
	int deleteModelInfoByMid(ModelBean modelBean);

	// 查询商城中的所有数据
	public Result<?> webStoreQuery();

	// 查询商城所有的数据(带参数类型)
	public Result<?> queryModels(ModelBean modelBean, Page page, String startPrice, String endPrice, String orderBy);

	// 通过ID查询模型的信息
	public Result<?> queryModelById(String mid, String uid);

	// 修改下载状态
	public int updateModelInfoById(ModelBean modelBean);

	// 添加评论
	public Result<?> insertStarClass(StarClass starClass);
}
