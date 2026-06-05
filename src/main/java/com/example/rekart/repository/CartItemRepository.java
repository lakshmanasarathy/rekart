package com.example.rekart.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.rekart.entity.CartItem;
import com.example.rekart.entity.Preproducts;
import com.example.rekart.entity.User;



public interface CartItemRepository extends JpaRepository<CartItem, Long> {

    List<CartItem> findByUser(User
    		user);

    Optional<CartItem> findByUserAndProduct(User user, Preproducts product);

    Optional<CartItem> findByIdAndUser(Long id, User user);
    
    void deleteByUser(User user);
}