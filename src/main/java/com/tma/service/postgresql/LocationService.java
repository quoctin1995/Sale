package com.tma.service.postgresql;

import com.tma.entity.postgresql.Location;

public interface LocationService {
	void saveLocation(Location location);
	
//	List<Location> getAllLocation();
	Iterable<Location> getAllLocation();

}
