package com.tma.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tma.entity.Location;
import com.tma.repository.LocationRepository;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class LocationServiceTest {
	// @Mock
	// private LocationRepository locationRepository;
	//
	// @InjectMocks
	// private LocationServiceImpl locationService;
	//
	// @Before
	// public void setup() {
	// MockitoAnnotations.initMocks(this);
	// }
	//
	// @Test
	// public void testGetAll() {
	// UUID uuid = UUID.randomUUID();
	// List<Location> locationList = new ArrayList<Location>();
	// locationList.add(new Location(uuid));
	// when(locationRepository.findAll()).thenReturn(locationList);
	//
	// Iterable<Location> result = locationService.getAllLocation();
	// Assert.assertNotNull("failure - expected not null", result);
	//
	// Assert.assertThat(result, is(locationList));
	// }

	@Mock
	private LocationRepository locationRepository;

	@InjectMocks
	private LocationServiceImpl locationService;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testGetAllLocation() {
		List<Location> locationList = new ArrayList<Location>();
		locationList.add(new Location());
		locationList.add(new Location());
		locationList.add(new Location());
		when(locationRepository.findAll()).thenReturn(locationList);
		List<Location> result = locationService.getAllLocation();

		assertEquals(3, result.size());
	}

	@Test
	public void testGetLocation() {
		UUID uuid = UUID.randomUUID();
		Location location = new Location();
		when(locationRepository.findOne(uuid)).thenReturn(location);
		Location result = locationService.getOneLocation(uuid);
		Assert.assertNotNull("failure - expected not null", result);
	}

	@Test
	public void saveLocation() {
		Location location = new Location();
		
		UUID uuid = UUID.randomUUID();
		location.setLocationId(uuid);
		location.setCountry("viet nam");
		location.setCity("hcm");
		
		when(locationRepository.save(location)).thenReturn(location);
		Location result = locationService.saveLocation(location);
		assertEquals(result.getLocationId(), uuid);
		assertEquals(result.getCountry(), "viet nam");
		assertEquals(result.getCity(), "hcm");
	}

	@Test
	public void removeLocation() {
		UUID uuid = UUID.randomUUID();
	
		locationService.deleteLocation(uuid);
		
		Location result = locationService.getOneLocation(uuid);
		Assert.assertNull(result);
	}

}
