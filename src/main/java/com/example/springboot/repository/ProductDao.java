package com.example.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.springboot.entity.Product;

public interface ProductDao extends CrudRepository<Product, Integer>{

}
