package com.example.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.springboot.entity.Category;
import com.example.springboot.repository.CategoryDao;
import com.example.springboot.service.CategoryService;

@Service
@Transactional
public class CategoryServiceImpl extends GenericServiceImpl<Category, Integer> implements CategoryService {
	
	private CategoryDao categoryDao;
	
	@Autowired
	public CategoryServiceImpl(CrudRepository<Category, Integer> categoryDao) {
		super(categoryDao);
		this.categoryDao = (CategoryDao)categoryDao;
	}
}
