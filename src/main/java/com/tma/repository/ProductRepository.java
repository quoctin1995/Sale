package com.tma.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tma.entity.Product;

public interface ProductRepository extends JpaRepository<Product, UUID> {

}
