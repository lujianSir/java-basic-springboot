package com.item.service;

import java.util.List;

import com.item.entity.ShoppingCart;

public interface ShoppingService {
	
	/**
	 * 添加/修改购物车
	 * @param shoppingCart
	 * @return
	 */
	public int insertOrUpdateShopCart(ShoppingCart shoppingCart);
	
	/**
	 * 通过ID删除购物车信息
	 * @param sid
	 * @return
	 */
	public int deleteShopCartById(String sid);
	
	/**
	 * 通过商城用户ID查询购物车
	 * @return
	 */
	public List<ShoppingCart> selectShoppingCartByUid(String uid);
	/**
	 * 查询购物车数量
	 * @param uid
	 * @return
	 */
	public int selectShoppingCartCountByUid(String uid);
}
