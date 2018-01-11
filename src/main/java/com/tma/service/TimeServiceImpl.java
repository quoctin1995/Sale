package com.tma.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tma.entity.Time;
import com.tma.repository.TimeRepository;

@Service
public class TimeServiceImpl implements TimeService {

	@Autowired
	private TimeRepository timeRepository;

	@Override
	public List<Time> getAllTime() {
		return timeRepository.findAll();
	}

	@Override
	public Time saveTime(Time time) {
		return timeRepository.save(time);
	}

}
