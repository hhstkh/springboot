package com.example.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.springboot.entity.Customer;

public interface CustomerDao extends CrudRepository<Customer, Integer> {

}
