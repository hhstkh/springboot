package com.example.springboot.service.impl;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.springboot.service.GenericService;

@Service
public abstract class GenericServiceImpl<E, K extends Serializable> implements GenericService<E, K>{

	private CrudRepository<E, K> genericDao;
	

	public GenericServiceImpl() {
	}
	
	

	public GenericServiceImpl(CrudRepository<E, K> genericDao) {
		super();
		this.genericDao = genericDao;
	}

	@Override
	public void saveOrUpdate(E entity) {
		genericDao.save(entity);
		
	}

	@Override
	public void delete(E entity) {
		genericDao.delete(entity);
		
	}

	@Override
	public E find(K key) {
		return genericDao.findOne(key);
	}

	@Override
	public Iterable<E> getAll() {
		return genericDao.findAll();
	}

}
