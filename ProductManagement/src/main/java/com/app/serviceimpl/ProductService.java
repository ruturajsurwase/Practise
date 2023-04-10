package com.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Product;
import com.app.repository.ProductRepository;
import com.app.serviceinterface.ProductInterface;

@Service
public class ProductService implements ProductInterface
{
	@Autowired
	ProductRepository productrepository;
	
	@Override
	public void saveProduct(Product p) 
	{
		productrepository.save(p);
		
	}

	@Override
	public List<Product>  getAllProducts() 
	{
		return productrepository.findAll();
		
	}

	@Override
	public Product searchByName(String pr) 
	{
		
		 Product findByProductName = productrepository.findByProductName(pr);
		 return findByProductName;
	
	}

}
