package com.tma.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tma.entity.Product;
import com.tma.repository.ProductRepository;

@RunWith(SpringJUnit4ClassRunner.class)
public class ProductServiceTest {
//	@Mock
//	private ProductRepository productRepository;
//	
//	@InjectMocks
//	private ProductServiceImpl productService;
//	
//	@Before
//	public void setup(){
//		MockitoAnnotations.initMocks(this);
//	}
//	
//	@Test
//	public void testGetAll(){
//		UUID uuid=UUID.randomUUID();
//		List<Product> productList = new ArrayList<Product>();
//		productList.add(new Product(uuid));
//		when(productRepository.findAll()).thenReturn(productList);
//		
//		Iterable<Product> result = productService.getAllProduct();
//		Assert.assertNotNull("failure - expected not null", result);
//		Assert.assertThat(result, is(productList));
//	}
	
	@Mock
	private ProductRepository productRepository;

	@InjectMocks
	private ProductServiceImpl productService;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testGetAllProduct() {
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product());
		productList.add(new Product());
		productList.add(new Product());
		when(productRepository.findAll()).thenReturn(productList);
		List<Product> result = productService.getAllProduct();

		assertEquals(3, result.size());
	}

	@Test
	public void saveProduct() {
		Product product = new Product();
		
		UUID uuid=UUID.randomUUID();
        product.setProductId(uuid);
        product.setItem(1);
        product.setclass_pr("abc");
        product.setInventory("def");
		
		when(productRepository.save(product)).thenReturn(product);
		Product result = productService.saveProduct(product);
		assertEquals(result.getProductId(), uuid);
        assertNotNull(result.getItem());
        assertEquals(result.getclass_pr(), "abc");
        assertEquals(result.getInventory(), "def");
	}

}
