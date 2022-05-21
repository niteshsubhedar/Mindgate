package com.sky.repository;

import java.util.List;

import com.sky.domain.Product;

public interface ProductRepository {

	public void addproduct(Product product);
	public List<Product> getProducts();
}
