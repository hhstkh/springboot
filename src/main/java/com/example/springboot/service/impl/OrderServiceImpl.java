package com.example.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.springboot.entity.Order;
import com.example.springboot.repository.OrderDao;
import com.example.springboot.service.OrderService;

@Service
@Transactional
public class OrderServiceImpl extends GenericServiceImpl<Order, Integer> implements OrderService {
	private OrderDao orderDao;
	
	@Autowired
	public OrderServiceImpl(CrudRepository<Order, Integer> orderDao) {
		super(orderDao);
		this.orderDao = (OrderDao)orderDao;
	}
}
