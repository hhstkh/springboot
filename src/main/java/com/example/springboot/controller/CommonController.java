package com.example.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.springboot.service.MasterDataService;

//@ControllerAdvice
public class CommonController {
	/*@Autowired
	private MasterDataService masterDataService;*/
	
	/*@ModelAttribute
	public void getMasterData(ModelMap model, HttpServletRequest request) {
		List<Category> categories = masterDataService.getAllCategory();
		Cart cart = CartUtil.getCartInSession(request);
		model.addAttribute("cart", cart);
		model.addAttribute("categories", categories);
	}*/
}
