package com.tma.entity;

import static org.junit.Assert.assertEquals;

import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class LocationTest {

	@Test
	public void testCreate() {
		UUID uuid=UUID.randomUUID();
		Location location = new Location(uuid);
		location.setLocationId(uuid);
		location.setCountry("viet nam");
		location.setCity("hcm");

		assertEquals(location.getLocationId(), uuid);
		assertEquals(location.getCountry(), "viet nam");
		assertEquals(location.getCity(), "hcm");
	}

//	@Test
//	public void test1() {
//		Location test = mock(Location.class);
//		
//		UUID uuid=UUID.randomUUID();
//		
//		when(test.getLocationId()).thenReturn(uuid);
//
//		assertEquals(test.getLocationId(), uuid);
//	}

}
