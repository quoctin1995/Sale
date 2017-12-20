package com.tma.service.postgresql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tma.entity.postgresql.Location;
import com.tma.repository.postgresql.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService {

	@Autowired
	private LocationRepository locationRepository;

	@Override
	public void saveLocation(Location location) {
		locationRepository.save(location);

	}

//	@Override
//	public List<Location> getAllLocation() {
//		return locationRepository.findAll();
//	}
	
	@Override
	public Iterable<Location> getAllLocation() {
		return locationRepository.findAll();
	}

}
