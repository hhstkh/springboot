package com.example.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.springboot.entity.User;

public interface UserDao extends CrudRepository<User, Integer>{

	User findByUsername(String username);

}
