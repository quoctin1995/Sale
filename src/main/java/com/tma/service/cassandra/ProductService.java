package com.tma.service.cassandra;

import com.tma.entity.cassandra.Product;

public interface ProductService {
	Iterable<Product> getAllProduct();
}
