package com.example.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.springboot.repository.GenericDao;
import com.example.springboot.repository.ProductDao;
import com.example.springboot.service.ProductService;
import com.springtutorial.entity.Product;

@Service
public class ProductServiceImpl extends GenericServiceImpl<Product, Integer> implements ProductService {
	
	private ProductDao productDao;
	
	@Autowired
	public ProductServiceImpl(@Qualifier("productDaoImpl")GenericDao<Product, Integer> genericDao) {
		super(genericDao);
		this.productDao = (ProductDao) genericDao;
	}
}
