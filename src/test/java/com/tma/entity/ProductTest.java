package com.tma.entity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class ProductTest {
	@Test
    public void testCreate() {
		UUID uuid=UUID.randomUUID();
        Product product = new Product(uuid);
        product.setProductId(uuid);
        product.setItem(1);
        product.setclass_pr("abc");
        product.setInventory("def");
 
        assertEquals(product.getProductId(), uuid);
        assertNotNull(product.getItem());
        assertEquals(product.getclass_pr(), "abc");
        assertEquals(product.getInventory(), "def");
    }

}
