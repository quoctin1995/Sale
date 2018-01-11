package com.tma.service;

import java.util.List;

import com.tma.entity.Product;

public interface ProductService {
	Product saveProduct(Product product);

	List<Product> getAllProduct();
}
