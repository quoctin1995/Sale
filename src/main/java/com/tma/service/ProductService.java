package com.tma.service;

import java.util.List;

import com.tma.entity.Product;

public interface ProductService {
	void saveProduct(Product product);

	List<Product> findAllProduct();
}
