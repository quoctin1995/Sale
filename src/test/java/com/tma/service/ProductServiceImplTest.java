package com.tma.service;


import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.tma.SaleProjectApplicationTests;
import com.tma.entity.Product;

public class ProductServiceImplTest extends SaleProjectApplicationTests {
	@Autowired
	private ProductService service;

	@Test
	public void testFindAll() {

		Iterable<Product> list = service.getAllProduct();
		Assert.assertNotNull("failure - expected not null", list);

	}
	

}
