package com.tma.service.postgresql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tma.entity.postgresql.Product;
import com.tma.repository.postgresql.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public void saveProduct(Product product) {
		productRepository.save(product);
	}

//	@Override
//	public List<Product> getAllProduct() {
//		return productRepostory.findAll();
//	}
	
	@Override
	public Iterable<Product> getAllProduct() {
		return productRepository.findAll();
	}

}
