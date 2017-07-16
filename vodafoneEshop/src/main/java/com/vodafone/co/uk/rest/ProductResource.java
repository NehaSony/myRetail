package com.vodafone.co.uk.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vodafone.co.uk.model.Product;
import com.vodafone.co.uk.service.ProductService;


@RestController
@RequestMapping("/product")
public class ProductResource {
	
	@Autowired
	private ProductService productSvc;
	
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<String> createProduct(@RequestBody Product product){
		productSvc.createProduct(product);
		return 	new ResponseEntity<String>(HttpStatus.OK);
	}
	
	@RequestMapping("/id/{id}")
	public @ResponseBody Product getProductById(@PathVariable(value = "id") int id){
		productSvc.getProductById(id);
		return 	productSvc.getProductById(id);
	}
	
	@RequestMapping("/list")
	public @ResponseBody List<Product> getProducts(){
		
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(1,"iphone7","Mobile",30,700,"Test Desc"));
		productList.add(new Product(2,"iphone7 Plus","Mobile",20,800,"Test Desc"));
		productList.add(new Product(3,"iphone6s Plus","Mobile",48,600,"Test Desc"));
		productSvc.listProduct();
		return 	productList;
	}
	
	@RequestMapping(value = "/id/{id}",method = RequestMethod.PUT)
	public @ResponseBody ResponseEntity<String> modifyProduct(@PathVariable(value = "id") int id,@RequestBody Product product){
		productSvc.modfiyProduct(id,product);
		return 	new ResponseEntity<String>(HttpStatus.OK);					
	}
	
	@RequestMapping(value = "/id/{id}",method = RequestMethod.DELETE)
	public @ResponseBody ResponseEntity<String> removeProduct(@PathVariable(value = "id") int id){
//		Product product = new Product(0,"iphone7","Mobile",30,1000,"Test Desc");
		productSvc.removeProduct(id);
		return 	new ResponseEntity<String>(HttpStatus.OK);					
	}

}
