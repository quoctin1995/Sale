package com.tma.service.postgresql;

import com.tma.entity.postgresql.Time;

public interface TimeService {
//	List<Time> getAllTime();
	Iterable<Time> getAllTime();

	void saveTime(Time time);
}
