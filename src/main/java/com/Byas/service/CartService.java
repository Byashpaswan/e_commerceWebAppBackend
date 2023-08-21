package com.Byas.service;

import com.Byas.exception.ProductException;
import com.Byas.model.Cart;
import com.Byas.model.User;
import com.Byas.request.AddItemRequest;

public interface CartService {
	
	public Cart createCart(User user);
	
	public String addCartItem(Long userId,AddItemRequest req)throws ProductException;
	
	public Cart findUserCart(Long userId);
	

}
