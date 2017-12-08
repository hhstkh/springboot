package com.example.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.repository.CategoryDao;
import com.example.springboot.service.MasterDataService;
import com.springtutorial.entity.Category;

@Service
public class MasterDataServiceImpl implements MasterDataService {
	
	@Autowired
	private CategoryDao categoryDao;
	
	@Override
	public List<Category> getAllCategory() {
		return categoryDao.getAll();
	}

}
