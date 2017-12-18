package com.example.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.springboot.entity.Employee;
import com.example.springboot.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/employee")
	public String getAllEmployees(ModelMap model) {
		Iterable<Employee> listEmployees = employeeService.getAll();
		model.put("employees", listEmployees);
		return "list-employee";
	}

}
