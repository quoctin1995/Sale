package com.tma.service;


import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.tma.SaleProjectApplicationTests;
import com.tma.entity.Location;

public class LocationServiceImplTest extends SaleProjectApplicationTests {

	@Autowired
	private LocationService service;

	@Test
	public void testFindAll() {

		Iterable<Location> list = service.getAllLocation();
		Assert.assertNotNull("failure - expected not null", list);
	} 

}
