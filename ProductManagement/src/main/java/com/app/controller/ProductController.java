package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Product;
import com.app.serviceinterface.ProductInterface;

@RestController
@RequestMapping("/product")
public class ProductController 
{
	@Autowired
	ProductInterface productinterface;
	
	@PostMapping("/save")
	public ResponseEntity<String> saveProduct(@RequestBody Product p)
	{
		System.out.println(p.toString());
		productinterface.saveProduct(p);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body("product saved");
		
	}
	
	@GetMapping("/getproduct")
	public  List<Product> getAllProducts()
	{
		return productinterface.getAllProducts();
	}
	
	@GetMapping("/name/{pr}")
	public Product searchByName(@PathVariable String pr)
	{
		System.out.println(pr);
		Product searchByName = productinterface.searchByName(pr);
		System.out.println(searchByName.toString());
		return searchByName;
		
	}
	
	
	
	
	
	
	
	
	
}
