package com.sky.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sky.domain.Product;
import com.sky.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public void addProduct(Product product) {
		System.out.println("in Service");
		if (product.getPrice() > 20)
			productRepository.addproduct(product);
	}
	

	@Override
	public List<Product> getProducts() {
		return productRepository.getProducts();
	}


	@Override
	public Product getProductbyid(String id) {
		// TODO Auto-generated method stub
		return productRepository.getProductbyid(id);
	}


	@Override
	public Product deleteProductbyid(String id) {
		// TOD
		return productRepository.deleteProductbyid(id);
	}


	@Override
	public Product updatebyid(Product product) {
		// TODO Auto-generated method stub
		return productRepository.updatebyid(product);
	}






}
