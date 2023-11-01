package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import ecommerce.EProduct;
import ecommerce.dao.EProductDAO;

@Controller
public class ProductController {
	
	@Autowired
	EProductDAO eproductDAO;
	
	@RequestMapping(value = "/listProducts", method = RequestMethod.GET)
	public String listProducts(ModelMap map) {
		List<EProduct> list = eproductDAO.getProducts();
		map.addAttribute("list", list);
		return "listProducts";
	}

	@RequestMapping(value = "/addProduct", method = RequestMethod.POST)
	public String addProduct(@RequestParam String name, @RequestParam float price ) {
		eproductDAO.addProduct(name, price);
		
		return "addProductSuccess"; // go to addProductSuccess.jsp
	}

	@RequestMapping(value = "/deleteProduct", method = RequestMethod.POST)
	public String deleteProduct(@RequestParam int id) {
		eproductDAO.deleteProduct(id);

		return "deleteProductSuccess"; // go to deleteProductSuccess.jsp
	}
}