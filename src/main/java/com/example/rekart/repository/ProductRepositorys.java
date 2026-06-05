package com.example.rekart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.rekart.entity.Product;

public interface ProductRepositorys
	
	extends JpaRepository<Product, Long> {

}
