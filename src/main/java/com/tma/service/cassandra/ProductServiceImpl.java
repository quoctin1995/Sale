package com.tma.service.cassandra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tma.entity.cassandra.Product;
import com.tma.repository.cassandra.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository productRepository;

	@Override
	public Iterable<Product> getAllProduct() {
		return productRepository.findAll();
	}
}
