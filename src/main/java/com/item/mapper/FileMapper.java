package com.item.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.item.entity.FileBean;
import com.item.entity.ModelBean;

@Repository
public interface FileMapper {

	// 文件信息录入数据库
	public void fileinfoAdd(FileBean file);

	// 通过ID查询上传文件的信息
	public FileBean selectFileById(String id);

	// 模型信息录入
	public void modelinfoAdd(ModelBean model);

	// 模型信息的修改
	public void modelInfoUpdate(ModelBean model);

	// 根据文件名查询出数据信息
	public List<FileBean> fileinfoQuery(String filename);

	// 删除文件信息
	public void fileinfoDelete(String id);

	// 商城主页信息模型加载
	public List<FileBean> webStoreQuery();

	// 查询所有的商城数据(后台)
	public List<ModelBean> queryModelsByAdmin(@Param("modelBean") ModelBean modelBean, @Param("roleid") int roleid);

	// 查询需要审核的模型审核
	public List<ModelBean> queryModelsExamine(@Param("modelBean") ModelBean modelBean, @Param("roleid") int roleid);

	// 通过模型ID删除模型以及对应的图片
	int deleteModelInfoByMid(ModelBean modelBean);

	// 查询商城所以的信息
	public List<ModelBean> queryModels(@Param("modelBean") ModelBean modelBean, @Param("startPrice") Double startPrice,
			@Param("endPrice") Double endPrice, @Param("orderBy") String orderBy);

	// 通过ID查询模型的信息
	public ModelBean queryModelById(int mid);

	// 通过用户和模型ID查询
	public ModelBean queryModelByIdAndUserId(@Param("mid") int mid, @Param("uid") String uid);

	// 通过模型ID修改下载量以及评分
	public void updateStarAndDownById(ModelBean model);

}
