package com.tma.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tma.entity.Location;
import com.tma.repository.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService {

	@Autowired
	private LocationRepository locationRepository;

	@Override
	public Location saveLocation(Location location) {
		return locationRepository.save(location);

	}

	@Override
	public List<Location> getAllLocation() {
		return locationRepository.findAll();
	}
	
	@Override
	public Location getOneLocation(UUID locationId) {
		return locationRepository.findOne(locationId);
	}
	
	@Override
	public void deleteLocation(UUID locationId) {
		locationRepository.delete(locationId);

	}

}
