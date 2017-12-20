package com.tma.repository.cassandra;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.tma.entity.cassandra.Product;

public interface ProductRepository extends CrudRepository<Product, UUID>{

}
