package com.sky.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sky.domain.Product;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

	private static List<Product> products = new ArrayList<Product>();

	@Override
	public void addproduct(Product product) {
		System.out.println("in repository");
		products.add(product);

	}

	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return products;
	}

	@Override
	public Product getProductbyid(String id) {
		
		Iterator<Product> itr = products.iterator();
		
		while (itr.hasNext()) {
			Product product = (Product) itr.next();
			if(product.getProductID().equals(id)) {
				return product;
			}
			
		} 
		return null;
	}

	@Override
	public Product deleteProductbyid(String id) {
		// TODO Auto-generated method stub
		int index = 0;
		for (Product product : products) {
			
			if(product.getProductID().equals(id)) {
				products.remove(index);
			return product;
			}
			index = index + 1;
		}
		
		return null;
	}

	@Override
	public Product updatebyid(Product product) {
		
		int index = 0;
		for (Product product1 : products) {
			
			if(product1.getProductID().equals(product.getProductID())) {
				
			products.set(index, product);
			return product;
			}
			index = index + 1;
		}
		
		
	
return null;
	}
	
}

