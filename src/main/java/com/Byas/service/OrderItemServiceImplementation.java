package com.Byas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Byas.model.OrderItem;
import com.Byas.repository.OrderItemRepository;

@Service
public class OrderItemServiceImplementation implements OrderItemService {
	
	@Autowired
	private OrderItemRepository orderItemRepository;

	@Override
	public OrderItem createOrderItem(OrderItem orderItem) {
		
		return orderItemRepository.save(orderItem);
	}

}
