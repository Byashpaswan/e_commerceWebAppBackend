package com.Byas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Byas.model.OrderItem;

public interface OrderItemRepository  extends JpaRepository<OrderItem,Long>{
	

}
