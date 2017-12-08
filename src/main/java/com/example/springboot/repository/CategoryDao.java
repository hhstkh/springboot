package com.example.springboot.repository;

import org.springframework.stereotype.Repository;

import com.example.springboot.entity.Category;

@Repository
public class CategoryDao extends CrudRepository<Category, Integer>{

}
