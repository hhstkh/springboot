package com.example.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.springboot.entity.Customer;
import com.example.springboot.repository.CustomerDao;
import com.example.springboot.service.CustomerService;

@Service
public class CustomerServiceImpl extends GenericServiceImpl<Customer, Integer> implements CustomerService {
	
	private CustomerDao customerDao;
	
	@Autowired
	public CustomerServiceImpl(CrudRepository<Customer, Integer> customerDao) {
		super(customerDao);
		this.customerDao = (CustomerDao)customerDao;
	}

}
