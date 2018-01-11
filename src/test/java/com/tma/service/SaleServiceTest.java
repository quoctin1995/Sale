package com.tma.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.postgresql.util.PGmoney;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tma.entity.Location;
import com.tma.entity.Product;
import com.tma.entity.Sale;
import com.tma.entity.SaleId;
import com.tma.entity.Time;
import com.tma.repository.SaleRepository;

@RunWith(SpringJUnit4ClassRunner.class)
public class SaleServiceTest {
//	@Mock
//	private SaleRepository saleRepository;
//	
//	@InjectMocks
//	private SaleServiceImpl saleService;
//	
//	@Before
//	public void setup(){
//		MockitoAnnotations.initMocks(this);
//	}
//	
//	@Test
//	public void testGetAll(){
////		UUID uuid=UUID.randomUUID();
////		UUID uuid1=UUID.randomUUID();
////		UUID uuid2=UUID.randomUUID();
////		BigDecimal dollars = new BigDecimal(1000.0);
//		List<Sale> saleList = new ArrayList<Sale>();
//		saleList.add(new Sale());
//		when(saleRepository.findAll()).thenReturn(saleList);
//		
//		Iterable<Sale> result = saleService.getAllSale();
//		Assert.assertNotNull("failure - expected not null", result);
//		Assert.assertThat(result, is(saleList));
//	}
	
	@Mock
	private SaleRepository saleRepository;

	@InjectMocks
	private SaleServiceImpl saleService;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testGetAllSale() {
		List<Sale> SaleList = new ArrayList<Sale>();
		SaleList.add(new Sale());
		SaleList.add(new Sale());
		SaleList.add(new Sale());
		when(saleRepository.findAll()).thenReturn(SaleList);
		List<Sale> result = saleService.getAllSale();

		assertEquals(3, result.size());
	}

	@Test
	public void saveSale() {
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
		
		when(saleRepository.save(sale)).thenReturn(sale);
		Sale result = saleService.saveSale(sale);
		assertEquals(result.getId(), id);
        assertEquals(result.getProduct(), product);
        assertEquals(result.getTime(), time);
        assertEquals(result.getLocation(), location);
        assertEquals(result.getDollars(), dollars);
	}

}
