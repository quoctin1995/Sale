package com.tma.service;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.tma.SaleProjectApplicationTests;
import com.tma.entity.Time;

public class TimeServiceImplTest extends SaleProjectApplicationTests {
	@Autowired
	private TimeService service;

	@Test
	public void testFindAll() {

		Iterable<Time> list = service.getAllTime();
		Assert.assertNotNull("failure - expected not null", list);
	}

}
