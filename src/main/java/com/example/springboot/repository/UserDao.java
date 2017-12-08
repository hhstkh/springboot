package com.example.springboot.repository;

import com.example.springboot.entity.User;

public interface UserDao extends GenericDao<User, Integer>{

	User findByUsername(String username);

}
