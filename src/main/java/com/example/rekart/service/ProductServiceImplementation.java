package com.example.rekart.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.rekart.dto.ProductRequestDto;
import com.example.rekart.entity.Product;
import com.example.rekart.repository.ProductRepositorys;


@Service
public class ProductServiceImplementation implements ProductServices {	

	ProductRepositorys repo;
	public ProductServiceImplementation(ProductRepositorys repo) {
		super();
		this.repo = repo;
	}
	@Override
	public String addProduct(ProductRequestDto prod) {
		Product p = new Product();
		p.setName(prod.getName());
		p.setDescription(prod.getDescription());
		p.setPrice(prod.getPrice());
		p.setPhotoUrl(prod.getPhotoUrl());
		repo.save(p);
		return "Product added successfully!";
	}
	
	@Override
	public String updateProduct(Product prod) {
		repo.save(prod);
		return "Product updated successfully!";
	}
	
	@Override
	public String deleteProduct(Long prodId) {
		repo.deleteById(prodId);
		return "Product deleted successfully!";
	}
	
	@Override
	public Product viewProduct(Long prodId) {
		return repo.findById(prodId).get();
	}
	
	@Override
	public List<Product> viewAllProducts() {
		return repo.findAll();
	}
	
}