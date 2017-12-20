package com.tma.service.cassandra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tma.entity.cassandra.Time;
import com.tma.repository.cassandra.TimeRepository;

@Service
public class TimeServiceImpl implements TimeService{
	@Autowired
	private TimeRepository timeRepository;
	
	@Override
	public Iterable<Time> getAllTime() {
		return timeRepository.findAll();
	}

}
