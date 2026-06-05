package com.example.rekart.service;

import java.util.List;

import com.example.rekart.dto.ProductRequestDto;
import com.example.rekart.entity.Product;


public interface ProductServices {

	String addProduct(ProductRequestDto prod);
	String updateProduct(Product prod);
	String deleteProduct(Long prodId);
	Product viewProduct(Long prodId);
	List<Product> viewAllProducts();
	
	
}