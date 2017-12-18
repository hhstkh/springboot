package com.example.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.springboot.entity.Employee;
import com.example.springboot.repository.EmployeeDao;
import com.example.springboot.service.EmployeeService;

@Service
@Transactional
public class EmployeeServiceImpl extends GenericServiceImpl<Employee, Integer> implements EmployeeService{
	private EmployeeDao empoyeeDao;
	
	public EmployeeServiceImpl() {
		
	}
	
	@Autowired
	public EmployeeServiceImpl(CrudRepository<Employee, Integer> empoyeeDao) {
		super(empoyeeDao);
		this.empoyeeDao = (EmployeeDao)empoyeeDao;
	}
	
	
}
