package com.item.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;

@Entity
public class ModelBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5275731141905140281L;

	// 模型ID
	private int mid;

	// 模型名称
	private String modelname;
	// 模型总价格
	private double modelprice = -0.1;

	// 模型单价
	private double unitprice = -0.1;

	// 构建类型
	private String buildtype;
	// 资源库类型一级

	private String resource_one;

	// 资源库类型二级
	private String resource_two;

	// 资源库类型三级
	private String resource_three;

	// 资源库类型四级
	private String resource_four;

	// 模型图片地址
	private String filePics;

	private List<Image> images;// 所有的图片路径

	// 模型地址
	private String fileModel;

	// 模型描述
	private String mdescribe;

	// 下载数量
	private int download;

	// 星级
	private int starclass;

	// 上传时间
	private String creatTime;

	private String creatTimeName;

	// 上传用户id
	private String userid;

	// 上传用户名称
	private String username;

	private int status;// 该用户是否已经购买(到期) 0 未到期 1

	// 模型状态(0 公有 1 私有)
	private int modelstatus;

	private String modelstatusname;// 状态名称

	private int examine = -1;// 审核 待审核 0 已审核是 1 未通过 2

	private String examinename;// s审核名称

	private boolean flag;// 判断是否能审核

	private String examinepeople;// 审核人的ID

	private String examinepeoplename;// 审核人名称

	private String examinetime;// 审核时间

	private String examineremark;// 备注

	private int starnumber;// 是否已经评论

	public int getStarnumber() {
		return starnumber;
	}

	public void setStarnumber(int starnumber) {
		this.starnumber = starnumber;
	}

	public String getExamineremark() {
		return examineremark;
	}

	public void setExamineremark(String examineremark) {
		this.examineremark = examineremark;
	}

	public String getExaminepeoplename() {
		return examinepeoplename;
	}

	public void setExaminepeoplename(String examinepeoplename) {
		this.examinepeoplename = examinepeoplename;
	}

	public String getExaminetime() {
		return examinetime;
	}

	public void setExaminetime(String examinetime) {
		this.examinetime = examinetime;
	}

	public String getMdescribe() {
		return mdescribe;
	}

	public void setMdescribe(String mdescribe) {
		this.mdescribe = mdescribe;
	}

	public String getExaminepeople() {
		return examinepeople;
	}

	public void setExaminepeople(String examinepeople) {
		this.examinepeople = examinepeople;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public String getExaminename() {
		return examinename;
	}

	public void setExaminename(String examinename) {
		this.examinename = examinename;
	}

	public List<Image> getImages() {
		return images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}

	public String getModelstatusname() {
		return modelstatusname;
	}

	public void setModelstatusname(String modelstatusname) {
		this.modelstatusname = modelstatusname;
	}

	public int getExamine() {
		return examine;
	}

	public void setExamine(int examine) {
		this.examine = examine;
	}

	public String getModelname() {
		return modelname;
	}

	public void setModelname(String modelname) {
		this.modelname = modelname;
	}

	public double getModelprice() {
		return modelprice;
	}

	public void setModelprice(double modelprice) {
		this.modelprice = modelprice;
	}

	public String getBuildtype() {
		return buildtype;
	}

	public void setBuildtype(String buildtype) {
		this.buildtype = buildtype;
	}

	public String getFilePics() {
		return filePics;
	}

	public void setFilePics(String filePics) {
		this.filePics = filePics;
	}

	public String getFileModel() {
		return fileModel;
	}

	public void setFileModel(String fileModel) {
		this.fileModel = fileModel;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public int getDownload() {
		return download;
	}

	public void setDownload(int download) {
		this.download = download;
	}

	public int getStarclass() {
		return starclass;
	}

	public void setStarclass(int starclass) {
		this.starclass = starclass;
	}

	public String getCreatTime() {
		return creatTime;
	}

	public void setCreatTime(String creatTime) {
		this.creatTime = creatTime;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public double getUnitprice() {
		return unitprice;
	}

	public void setUnitprice(double unitprice) {
		this.unitprice = unitprice;
	}

	public String getCreatTimeName() {
		return creatTimeName;
	}

	public void setCreatTimeName(String creatTimeName) {
		this.creatTimeName = creatTimeName;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getModelstatus() {
		return modelstatus;
	}

	public void setModelstatus(int modelstatus) {
		this.modelstatus = modelstatus;
	}

	public String getResource_one() {
		return resource_one;
	}

	public void setResource_one(String resource_one) {
		this.resource_one = resource_one;
	}

	public String getResource_two() {
		return resource_two;
	}

	public void setResource_two(String resource_two) {
		this.resource_two = resource_two;
	}

	public String getResource_three() {
		return resource_three;
	}

	public void setResource_three(String resource_three) {
		this.resource_three = resource_three;
	}

	public String getResource_four() {
		return resource_four;
	}

	public void setResource_four(String resource_four) {
		this.resource_four = resource_four;
	}

}
