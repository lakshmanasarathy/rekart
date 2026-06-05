package com.example.rekart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.rekart.entity.PaymentTransaction;


public interface PaymentTransactionRepository extends JpaRepository<PaymentTransaction, Long> {
}
