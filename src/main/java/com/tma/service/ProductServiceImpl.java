package com.tma.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tma.entity.Product;
import com.tma.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepostory;

	@Override
	public void saveProduct(Product product) {
		productRepostory.save(product);
	}

	@Override
	public List<Product> findAllProduct() {
		return productRepostory.findAll();
	}

}
