package com.vodafone.co.uk.service;

import java.util.List;

import com.vodafone.co.uk.model.Product;


public interface ProductService {
	
	public void createProduct(Product product);
	public void modfiyProduct(int id, Product product);
	public Product getProductById(int id);
	public List<Product> listProduct();
	public void removeProduct(int id);

}
