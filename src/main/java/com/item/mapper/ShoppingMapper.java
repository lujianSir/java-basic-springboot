package com.item.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.item.alipay.OrderFlow;
import com.item.entity.ShoppingCart;

@Repository
public interface ShoppingMapper {

	/**
	 * 添加购物车
	 * 
	 * @param shoppingCart
	 * @return
	 */
	public int insertShopCart(ShoppingCart shoppingCart);

	/**
	 * 修改购物车信息
	 * 
	 * @param shoppingCart
	 * @return
	 */
	public int updateShopCart(ShoppingCart shoppingCart);

	/**
	 * 查询用户之前是否加入过此商品
	 * 
	 * @param shoppingCart
	 * @return
	 */
	public ShoppingCart selectShopCartByUidAndMid(ShoppingCart shoppingCart);

	/**
	 * 通过ID删除购物车信息
	 * 
	 * @param sid
	 * @return
	 */
	public int deleteShopCartById(String sid);

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
	 * 通过用户ID以及商品ID删除购物车信息
	 * 
	 * @return
	 */
	public int deleteShopCartByUserIdAndMid(OrderFlow orderFlow);

}
