package com.tma.service.cassandra;

import com.tma.entity.cassandra.Time;

public interface TimeService {
	Iterable<Time> getAllTime();
}
