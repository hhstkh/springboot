package com.example.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.springboot.repository.GenericDao;
import com.example.springboot.repository.UserDao;
import com.example.springboot.service.UserService;
import com.springtutorial.entity.User;

@Service
@Transactional
public class UserServiceImpl extends GenericServiceImpl<User, Integer> implements UserService {
	private UserDao userDao;
	
	@Autowired
	public UserServiceImpl(@Qualifier("userDaoImpl") GenericDao<User, Integer> genericDao) {
		this.userDao = (UserDao)genericDao;
	}

	@Override
	public User findByUsername(String username) {
		return this.userDao.findByUsername(username);
	}
}
