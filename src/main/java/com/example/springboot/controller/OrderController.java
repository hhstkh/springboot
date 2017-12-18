package com.example.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/checkout")
public class OrderController {
	/*
	@Autowired
	private ProductService productService;
	@Autowired
	private OrderService orderService;
	@Autowired
	private CustomerService customerService;
	
	
	@RequestMapping(value = "/cart", method = RequestMethod.GET)
	public String viewCart(ModelMap model, HttpServletRequest request) {
		Cart cart = CartUtil.getCartInSession(request);
		model.addAttribute("cart", cart);
		return "cart-detail";
	}
	
	@RequestMapping(value = "/addOrUpdateProduct", method = RequestMethod.POST)
	@ResponseBody
	public Cart addProduct(@RequestParam(value = "productId") int productId, 
			@RequestParam(value = "buyQty") int buyQty,
			HttpServletRequest request, HttpServletResponse response) {
		Cart cart = CartUtil.getCartInSession(request);
		Product product = productService.find(productId);
		cart.addCartItem(buyQty, product);
		
		return cart;
	}
	
	@RequestMapping(value = "/remove/{productId}")
	public String removeCartItem(@PathVariable Integer productId, HttpServletRequest request) {
		Cart cart = CartUtil.getCartInSession(request);
		Map<Integer, CartItem> cartItems = cart.getCartItems();
		if (cartItems.containsKey(productId)) {
			cartItems.remove(productId);
		}
		return "redirect:/checkout/cart";
	}
	
	@RequestMapping(value = "/shipping", method = RequestMethod.GET)
	public String getShippingForm(ModelMap model, HttpServletRequest request) {
		Cart cart = CartUtil.getCartInSession(request);
		model.addAttribute("cart", cart);
		model.addAttribute("customer", new Customer());
		return "shipping-form";
	}
	
	@RequestMapping(value = "/shipping", method = RequestMethod.POST)
	public String doShipping(@Valid @ModelAttribute("customer") Customer customer, BindingResult result, HttpServletRequest request) {
		if (result.hasErrors()) {
			return "error";
		}
		
		// customerService.save(customer);
		
		customer = customerService.find(1);
		
		Cart cart = CartUtil.getCartInSession(request);
		
		Order order = new Order();
		order.setAmount(cart.getGrandTotal());
		order.setCustomer(customer);
		
		for(Entry<Integer, CartItem> entry : cart.getCartItems().entrySet()) {
			CartItem cartItem = entry.getValue();
			
			Product product = productService.find(cartItem.getProductId());
			
			OrderDetail orderDetail = new OrderDetail();
			orderDetail.setAmount(cartItem.getTotalPrice());
			orderDetail.setPrice(product.getPrice());
			
			orderDetail.setProduct(product);
			orderDetail.setOrder(order);
			
			 order.getOrderDetails().add(orderDetail);
			
		}
		
		orderService.saveOrUpdate(order);
		
		CartUtil.removeCartInSession(request);
		
		return "redirect:/checkout/shipping-info";
	}
	
	@RequestMapping(value = "/shipping-info")
	public String checkoutSuccessMsg() {
		return "shipping-info";
	}
	*/

}
