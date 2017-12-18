package com.example.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.springboot.entity.Employee;

public interface EmployeeDao extends CrudRepository<Employee, Integer> {

}
