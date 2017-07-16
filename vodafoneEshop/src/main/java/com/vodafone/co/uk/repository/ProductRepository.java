package com.vodafone.co.uk.repository;

import org.springframework.data.repository.CrudRepository;

import com.vodafone.co.uk.model.Product;

public interface ProductRepository extends CrudRepository<Product, String> {

}
