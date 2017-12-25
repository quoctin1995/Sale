package com.tma.service;

import java.util.List;

import com.tma.entity.Time;

public interface TimeService {
	List<Time> getAllTime();

	void saveTime(Time time);
}
