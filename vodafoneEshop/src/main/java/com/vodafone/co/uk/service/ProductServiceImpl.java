package com.vodafone.co.uk.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vodafone.co.uk.model.Product;
import com.vodafone.co.uk.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public void createProduct(Product product) {

		try {
			productRepository.save(product);
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

	@Override
	public List<Product> listProduct() {
		
		List<Product> prodList = new ArrayList<>();
		try {
			productRepository.findAll().forEach(prodList::add);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return prodList;
	}

	@Override
	public void removeProduct(int id) {
		String strid = String.valueOf(id);
		productRepository.delete(strid);

	}

	@Override
	public Product getProductById(int id) {
		productRepository.findOne(String.valueOf(id));
		return null;
	}

	@Override
	public void modfiyProduct(int id, Product product) {
		productRepository.save(product);

	}

}
