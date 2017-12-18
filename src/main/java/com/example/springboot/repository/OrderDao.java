package com.example.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.springboot.entity.Order;

public interface OrderDao extends CrudRepository<Order, Integer>{

}
