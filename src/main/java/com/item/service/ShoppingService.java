package com.item.service;

import java.util.List;

import com.item.alipay.OrderFlow;
import com.item.entity.ShoppingCart;

public interface ShoppingService {

	/**
	 * 添加/修改购物车
	 * 
	 * @param shoppingCart
	 * @return
	 */
	public int insertOrUpdateShopCart(ShoppingCart shoppingCart);

	/**
	 * 通过ID删除购物车信息
	 * 
	 * @param sid
	 * @return
	 */
	public int deleteShopCartById(String sid);

	/**
	 * 通过用户ID以及商品ID删除购物车信息
	 * 
	 * @return
	 */
	public int deleteShopCartByUserIdAndMid(OrderFlow orderFlow);

	/**
	 * 通过商城用户ID查询购物车
	 * 
	 * @return
	 */
	public List<ShoppingCart> selectShoppingCartByUid(String uid);

	/**
	 * 查询购物车数量
	 * 
	 * @param uid
	 * @return
	 */
	public int selectShoppingCartCountByUid(String uid);

	/**
	 * 勾选算总数
	 * 
	 * @return
	 */
	public String selectShoppingCartBySid(String[] st);

	/**
	 * 通过购物车的ID获取购物车的信息
	 * 
	 * @param sid
	 * @return
	 */
	ShoppingCart queryShoppingCartBySid(String sid);

	/**
	 * 通过用户以及商品ID查询之前是否已经买了商品
	 * 
	 * @param shoppingCart
	 * @return
	 */
	int queryShoppingByUserIdAndMid(ShoppingCart shoppingCart);

}
