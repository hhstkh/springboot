package com.example.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.springboot.entity.User;
import com.example.springboot.repository.UserDao;
import com.example.springboot.service.UserService;

@Service
@Transactional
public class UserServiceImpl extends GenericServiceImpl<User, Integer> implements UserService {
	private UserDao userDao;
	
	@Autowired
	public UserServiceImpl(CrudRepository<User, Integer> userDao) {
		super(userDao);
		this.userDao = (UserDao)userDao;
	}

	@Override
	public User findByUsername(String username) {
		return this.userDao.findByUsername(username);
	}
}
