package com.example.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.springboot.entity.Product;
import com.example.springboot.repository.ProductDao;
import com.example.springboot.service.ProductService;

@Service
public class ProductServiceImpl extends GenericServiceImpl<Product, Integer> implements ProductService {
	
	private ProductDao productDao;
	
	@Autowired
	public ProductServiceImpl(CrudRepository<Product, Integer> productDao) {
		super(productDao);
		this.productDao = (ProductDao) productDao;
	}
}
