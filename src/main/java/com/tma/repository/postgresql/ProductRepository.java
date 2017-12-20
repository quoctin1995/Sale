package com.tma.repository.postgresql;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tma.entity.postgresql.Product;

public interface ProductRepository extends JpaRepository<Product, UUID> {

}
