package com.tma.service.cassandra;

import com.tma.entity.cassandra.Location;

public interface LocationService {
	Iterable<Location> getAllLocation();
}
