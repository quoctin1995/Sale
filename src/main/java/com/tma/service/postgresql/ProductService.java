package com.tma.service.postgresql;

import com.tma.entity.postgresql.Product;

public interface ProductService {
	void saveProduct(Product product);

//	List<Product> findAllProduct();
	Iterable<Product> getAllProduct();
}
