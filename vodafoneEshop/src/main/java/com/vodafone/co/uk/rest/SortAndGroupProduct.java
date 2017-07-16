package com.vodafone.co.uk.rest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.vodafone.co.uk.model.Product;

public class SortAndGroupProduct{

	public static void main(String[] args) {
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(2,"iphone7 Plus","Mobile",20,800,"Test Desc"));
		productList.add(new Product(1,"iphone7","Mobile",30,700,"Test Desc"));
		productList.add(new Product(4,"Sure Signal","Device",48,600,"Test Desc"));		
		productList.add(new Product(5,"Sure Signal Plus","Device",48,600,"Test Desc"));
		productList.add(new Product(3,"iphone6s Plus","Mobile",48,600,"Test Desc"));
		productList.add(new Product(3,"iphone6s Plus","Mobile",48,600,"Test Desc"));
		productList.forEach(p->{System.out.println(p.hashCode());});
		productList.forEach(System.out::println);
		System.out.println("::::::::::::::::::::::::");
		Collections.sort(productList,Product.compareByName);
		productList.forEach(System.out::println);
		System.out.println("::::::::::::::::::::::::");
		Collections.sort(productList,Product.sortAndGroupProductByType);
		productList.forEach(System.out::println);
		System.out.println("::::::::::::::::::::::::");
		Collections.sort(productList,(Product p1, Product p2 ) -> p1.getType().compareTo(p2.getType()));		
		productList.forEach(System.out::println);
		
		
	}

		

}
