package com.example.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.springboot.repository.EmployeeDao;
import com.example.springboot.repository.GenericDao;
import com.example.springboot.service.EmployeeService;
import com.springtutorial.entity.Employee;

@Service
@Transactional
public class EmployeeServiceImpl extends GenericServiceImpl<Employee, Integer> implements EmployeeService{
	private EmployeeDao empoyeeDao;
	
	public EmployeeServiceImpl() {
		
	}
	
	@Autowired
	public EmployeeServiceImpl(@Qualifier("employeeDaoImpl")GenericDao<Employee, Integer> genericDao) {
		super(genericDao);
		this.empoyeeDao = (EmployeeDao)genericDao;
	}
	
	
}
