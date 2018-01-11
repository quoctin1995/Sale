package com.tma.entity;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.postgresql.util.PGmoney;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class SaleTest {
	@Test
    public void testCreate() {
		Sale sale = new Sale();
        SaleId id = new SaleId();
        Location location = new Location();
        Product product = new Product();
        Time time = new Time();
        PGmoney dollars = new PGmoney(1000.0);
        sale.setId(id);
        sale.setProduct(product);
        sale.setTime(time);
        sale.setLocation(location);
        sale.setDollars(dollars);
 
        assertEquals(sale.getId(), id);
        assertEquals(sale.getProduct(), product);
        assertEquals(sale.getTime(), time);
        assertEquals(sale.getLocation(), location);
        assertEquals(sale.getDollars(), dollars);
    }

}
