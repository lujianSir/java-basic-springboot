package com.item.service;

import java.io.File;
import java.text.DecimalFormat;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.item.entity.ModelBean;
import com.item.entity.ShoppingCart;
import com.item.mapper.FileMapper;
import com.item.mapper.ShoppingMapper;
import com.item.tool.JavaTool;
@Service
public class ShoppingServiceImpl implements ShoppingService{

	private static final Logger LOG = LoggerFactory.getLogger(FlowServiceImpl.class);
	
	@Autowired
	private ShoppingMapper shoppingMapper;
	
	@Autowired
	private FileMapper fileMapper;
	
	@Override
	public int insertOrUpdateShopCart(ShoppingCart shoppingCart) {
		// TODO Auto-generated method stub
		ModelBean modelBean=fileMapper.queryModelById(shoppingCart.getMid());
		// 0代表前台 1代表模型端
		DecimalFormat df = new DecimalFormat("#.00");  
		switch (shoppingCart.getCycle()) {
		case 1://一个月
			shoppingCart.setAccount(df.format(modelBean.getUnitprice()));
			break;
		case 2://半年 九折
			shoppingCart.setAccount(df.format(modelBean.getUnitprice()*6*0.9));
			break;
		case 3://一年 八折
			shoppingCart.setAccount(df.format(modelBean.getUnitprice()*12*0.8));
			break;
		case 4://永久
			shoppingCart.setAccount(df.format(modelBean.getModelprice()));
			break;
		default:
			break;
		}	
		
		ShoppingCart shop=shoppingMapper.selectShopCartByUidAndMid(shoppingCart);
		if(shop!=null) {
			shoppingCart.setSid(shop.getSid());
		}	
		if(shoppingCart.getSid()!=null && !shoppingCart.getSid().equals("")) {
			return shoppingMapper.updateShopCart(shoppingCart);
		}else{
			String sid=JavaTool.getUserId();
			shoppingCart.setSid(sid);
			return shoppingMapper.insertShopCart(shoppingCart);
		}
			
	}

	@Override
	public int deleteShopCartById(String sid) {
		// TODO Auto-generated method stub
		return shoppingMapper.deleteShopCartById(sid);
	}

	@Override
	public List<ShoppingCart> selectShoppingCartByUid(String uid) {
		// TODO Auto-generated method stub
		return shoppingMapper.selectShoppingCartByUid(uid);
	}

	@Override
	public int selectShoppingCartCountByUid(String uid) {
		// TODO Auto-generated method stub
		return shoppingMapper.selectShoppingCartCountByUid(uid);
	}

	@Override
	public String selectShoppingCartBySid(String[] st) {
		// TODO Auto-generated method stub
		return shoppingMapper.selectShoppingCartBySid(st);
	}

}
