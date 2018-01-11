package com.tma.entity;

import static org.junit.Assert.assertEquals;

import java.util.UUID;

import org.junit.Test;

public class SaleIdTest {
	@Test
    public void testCreate() {
        SaleId sale = new SaleId();
        UUID uuid=UUID.randomUUID();
		UUID uuid1=UUID.randomUUID();
		UUID uuid2=UUID.randomUUID();
        sale.setProductId(uuid);
        sale.setTimeId(uuid1);
        sale.setLocationId(uuid2);
 
        assertEquals(sale.getProductId(), uuid);
        assertEquals(sale.getTimeId(), uuid1);
        assertEquals(sale.getLocationId(), uuid2);
    }

}
