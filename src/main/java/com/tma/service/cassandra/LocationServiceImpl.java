package com.tma.service.cassandra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tma.entity.cassandra.Location;
import com.tma.repository.cassandra.LocationRepository;


@Service
public class LocationServiceImpl implements LocationService{
	@Autowired
	private LocationRepository locationRepository;
	
	@Override
	public Iterable<Location> getAllLocation() {
		return locationRepository.findAll();
	}
}
