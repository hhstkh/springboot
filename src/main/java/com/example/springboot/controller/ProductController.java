package com.example.springboot.controller;

import org.springframework.stereotype.Controller;

@Controller
public class ProductController {
	
	/*@Autowired
	private ProductService productService;
	
	@Autowired
	private CategoryEditor categoryEditor;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(Category.class, this.categoryEditor);
	}
	
	@RequestMapping("/products")
	public String listProducts(Model model) {
		List<Product> products = productService.getAll();
		
		model.addAttribute("products", products);
		return "list-product";
	}
	
	@RequestMapping(value = "/product-form", method = RequestMethod.GET)
	public String getProductForm(ModelMap model) {
		model.addAttribute("product", new Product());
		
		return "product-form";
	}
	
	@RequestMapping(value="/product/edit/{productId}")
	public String editProduct(@PathVariable int productId, ModelMap model) {
		
		Product p = productService.find(productId);
		model.addAttribute("product", p);
		
		return "product-form";
	}
	
	@RequestMapping(value="/product/delete/{productId}")
	public String deleteProduct(@PathVariable int productId, ModelMap model) {
		
		Product p = productService.find(productId);
		productService.delete(p);
		
		return "redirect:/admin/bikes";
	}
	
	@RequestMapping(value = "/product-form", method = RequestMethod.POST)
	public String saveProduct(@Valid @ModelAttribute("product") Product product, BindingResult result) {
		if (result.hasErrors()) {
			return "error";
		}
		
		CommonsMultipartFile[] files = product.getMultipartFiles();
		for (CommonsMultipartFile partFile : files) {
			byte[] imgBytes = partFile.getBytes();
			if (imgBytes != null && imgBytes.length > 0) {
				product.setProductImg(imgBytes);
			}
		}
		
		productService.saveOrUpdate(product);
		
		return "redirect:/product-form";
	}
	
	@RequestMapping(value="/product/{productId}")
	public String viewProduct(@PathVariable int productId, ModelMap model) {
		
		Product p = productService.find(productId);
		model.addAttribute("product", p);
		
		return "product-detail";
	}*/

}
