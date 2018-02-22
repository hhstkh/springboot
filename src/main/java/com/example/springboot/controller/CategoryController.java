package com.example.springboot.controller;


import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.springboot.entity.Category;
import com.example.springboot.service.CategoryService;

@Controller
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping(value = "/admin/category-list", method = RequestMethod.GET)
	public String listCategories(Model model) {
		Iterable<Category> categories = categoryService.getAll();
		model.addAttribute("categories", categories);
		return "category-list";
	}
	
	@RequestMapping(value = "/admin/category-form", method = RequestMethod.GET)
	public String showCategoryForm(ModelMap model) {
		model.addAttribute("category", new Category());
		return "category-form";
	}
	
	@RequestMapping(value = "/admin/category-form/{categoryId}", method = RequestMethod.GET)
	public String editCategory(@PathVariable int categoryId,  ModelMap model) {
		Category category = categoryService.find(categoryId);
		model.addAttribute("category", category);
		return "category-form";
	}
	
	@RequestMapping(value = "/admin/category-form", method = RequestMethod.POST)
	public String saveCategory(@Valid @ModelAttribute("category")Category category, BindingResult result) {
		if (result.hasErrors()) {
			return "errors";
		}
		
		categoryService.saveOrUpdate(category);
		
		return "redirect:/admin/category-list";
	}

}
