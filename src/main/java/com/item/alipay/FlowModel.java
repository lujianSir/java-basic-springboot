package com.item.alipay;

import java.io.Serializable;
import java.util.Date;

/**
 * 已购模型
 * @author Administrator
 *
 */
public class FlowModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//id
	private String fid;

	//商城用户ID
	private String uid;
	
	//模型ID
	private int mid;
	
	//最终交易的钱
	private double endaccount;
	
	//周期
	private int cycle; //一个月 1  半年 2  一年 3  永久 4
	
	//开始时间
	private Date starttime;
		
	//结束时间
	private Date endtime;
	
}
