package com.example.springboot.service;

import com.example.springboot.entity.User;

public interface UserService extends GenericService<User, Integer> {
	User findByUsername(String username);
}
