package com.example.springboot.service;

public interface GenericService<E, K> {
	void saveOrUpdate(E entity);
	void delete(E entity);
	E find(K key);
	Iterable<E> getAll();
}
