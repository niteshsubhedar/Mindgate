package com.sky.service;

import java.util.List;

import com.sky.domain.Product;

public interface ProductService {

	public void addProduct(Product product);
	public List<Product> getProducts();
	
	public Product getProductbyid(String id);

	public Product deleteProductbyid(String id);
	
	public Product updatebyid(Product product);
}
