package com.Byas.service;

import com.Byas.exception.CartItemException;
import com.Byas.exception.UserException;
import com.Byas.model.Cart;
import com.Byas.model.CartItem;
import com.Byas.model.Product;

public interface CartItemService {
	
	public CartItem createCartItem(CartItem cartItem);
	
	public CartItem updateCartItem(Long userId, Long id,CartItem cartItem)throws CartItemException,UserException;
	
	
	
	public CartItem isCartItemExist(Cart cart,Product product ,String size,Long userId);
	 public void removeCartItem(Long userId,Long cartItemId)throws CartItemException,UserException;
	 
	 public CartItem findCartItemById(Long cartItemId)throws CartItemException;

}
