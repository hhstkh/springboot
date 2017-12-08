package com.example.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.springboot.repository.CustomerDao;
import com.example.springboot.repository.GenericDao;
import com.example.springboot.service.CustomerService;
import com.springtutorial.entity.Customer;

@Service
public class CustomerServiceImpl extends GenericServiceImpl<Customer, Integer> implements CustomerService {
	
	private CustomerDao customerDao;
	
	@Autowired
	public CustomerServiceImpl(@Qualifier("customerDaoImpl")GenericDao<Customer, Integer> genericDao) {
		super(genericDao);
		this.customerDao = (CustomerDao)genericDao;
	}

}
