package com.tma.service;

import java.util.List;
import java.util.UUID;

import com.tma.entity.Location;

public interface LocationService {
	void saveLocation(Location location);
	
	List<Location> getAllLocation();
	
	Location getLocation(UUID locationId);
	
	void deleteLocation(UUID locationId);

}
