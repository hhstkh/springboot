package com.example.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.springboot.entity.Category;
import com.example.springboot.service.CategoryService;

@Service
@Transactional
public class CategoryServiceImpl extends GenericServiceImpl<Category, Integer> implements CategoryService {
	private CategoryDao categoryDao;
	
	
	@Autowired
	public CategoryServiceImpl(@Qualifier("categoryDaoImpl") GenericDao<Category, Integer> genericDao) {
		super(genericDao);
		this.categoryDao = (CategoryDao)genericDao;
	}
}
