package com.item.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.item.entity.ShoppingCart;

@Repository
public interface ShoppingMapper {

	/**
	 * 添加购物车
	 * @param shoppingCart
	 * @return
	 */
	public int insertShopCart(ShoppingCart shoppingCart);
	
	/**
	 * 修改购物车信息
	 * @param shoppingCart
	 * @return
	 */
	public int updateShopCart(ShoppingCart shoppingCart);
	
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
}
