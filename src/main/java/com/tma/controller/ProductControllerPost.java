package com.tma.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tma.entity.postgresql.Product;
import com.tma.entityDTO.postgresql.ProductDTO;
import com.tma.exception.NoHandlerFoundException;
import com.tma.service.postgresql.ProductService;

@RestController
@RequestMapping("product")
public class ProductControllerPost {

	@Autowired
	private ProductService productService;

	@RequestMapping(method = RequestMethod.POST)
	public void saveProduct(@RequestBody Product product) {
		UUID uuid = UUID.randomUUID();
		product.setProductId(uuid);
		productService.saveProduct(product);
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<ProductDTO> getAllProducts() {
		List<Product> listProduct = (List<Product>) productService.getAllProduct();

		if (listProduct == null) {
			throw new NoHandlerFoundException("NOT FOUND DATA");
		}

		List<ProductDTO> listProductDTO = new ArrayList<>();
		for (Product product : listProduct) {
			listProductDTO.add(new ProductDTO(product));
		}
		return listProductDTO;
	}
}
