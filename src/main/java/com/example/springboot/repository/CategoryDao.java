package com.example.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springboot.entity.Category;

@Repository
public interface  CategoryDao extends CrudRepository<Category, Integer>{

}
