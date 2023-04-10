package com.app.serviceinterface;

import java.util.List;

import com.app.model.Product;

public interface ProductInterface
{

	public void saveProduct(Product p);

	public List<Product> getAllProducts();

	public Product searchByName(String productname);

}
