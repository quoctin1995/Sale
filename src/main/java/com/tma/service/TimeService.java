package com.tma.service;

import java.util.List;

import com.tma.entity.Time;

public interface TimeService {
	List<Time> getAllTime();

	Time saveTime(Time time);
}
