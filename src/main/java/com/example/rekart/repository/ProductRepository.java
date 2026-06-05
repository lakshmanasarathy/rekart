package com.example.rekart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.rekart.entity.Preproducts;



public interface ProductRepository extends JpaRepository<Preproducts, Long> {
}