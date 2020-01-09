package com.item.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.item.entity.ModelBean;
import com.item.entity.Page;
import com.item.entity.ShoppingCart;
import com.item.service.ShoppingService;
import com.item.tool.Result;

/**
 * 购物、交易
 * @author Administrator
 *
 */
@RestController
@RequestMapping(value = "shop")
public class ShoppingController {

	@Autowired
	private ShoppingService shoppingService;
	
	 /**
	  * 添加、修改购物车
	  * @param shoppingCart
	  * @return
	  */
	@RequestMapping(value = "/insertOrUpdateShopCart")
	public Result<?> insertOrUpdateShopCart(ShoppingCart shoppingCart) {	
		int num=shoppingService.insertOrUpdateShopCart(shoppingCart);
		int totalShop=shoppingService.selectShoppingCartCountByUid(shoppingCart.getUid());
		if(num>0) {
			return	Result.success(totalShop);
		}else {
			return Result.error(500, "服务端错误");
		}	
	}
	
	/**
	 * 删除购物车信息
	 * @param sid
	 * @return
	 */
	@RequestMapping(value = "/deleteShopCartById")
	public Result<?> deleteShopCartById(String sid,String uid) {	
		int num=shoppingService.deleteShopCartById(sid);
		int totalShop=shoppingService.selectShoppingCartCountByUid(uid);
		if(num>0) {
			return	Result.success(totalShop);
		}else {
			return Result.error(500, "服务端错误");
		}	
	}
	
	/**
	 * 通过用户ID查询购物车内容
	 * @param uid
	 * @param page
	 * @return
	 */
	@RequestMapping(value = "/selectShoppingCartByUid")
	public Result<?> selectShoppingCartByUid(String uid,Page page) {			
		PageHelper.startPage(page.getPageNumber(), page.getPageSize());
		List<ShoppingCart> list= shoppingService.selectShoppingCartByUid(uid);
		PageInfo<ShoppingCart> pageInfo = new PageInfo<ShoppingCart>(list);				
		return Result.success(pageInfo);
	}
	
}
