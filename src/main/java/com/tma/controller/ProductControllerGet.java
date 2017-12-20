package com.tma.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tma.entity.cassandra.Product;
import com.tma.entityDTO.cassandra.ProductDTO;
import com.tma.exception.NoHandlerFoundException;
import com.tma.service.cassandra.ProductService;

@RestController
@RequestMapping("getproduct")
public class ProductControllerGet {

	@Autowired
	private ProductService productService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<ProductDTO>> getAllProducts() {
		List<Product> listProduct = (List<Product>) productService.getAllProduct();
		
		if(listProduct == null) {
			throw new NoHandlerFoundException("NOT FOUND DATA");
		}
		
		List<ProductDTO> listProductDTO = new ArrayList<>();
		for (Product product : listProduct) {
			listProductDTO.add(new ProductDTO(product));
		}
		return new ResponseEntity<>(listProductDTO, HttpStatus.OK);
	}
} 
