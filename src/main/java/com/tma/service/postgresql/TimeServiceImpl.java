package com.tma.service.postgresql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tma.entity.postgresql.Time;
import com.tma.repository.postgresql.TimeRepository;

@Service
public class TimeServiceImpl implements TimeService {

	@Autowired
	private TimeRepository timeRepository;

//	@Override
//	public List<Time> getAllTime() {
//		return timeRepository.findAll();
//	}

	@Override
	public void saveTime(Time time) {
		timeRepository.save(time);
	}
	
	@Override
	public Iterable<Time> getAllTime() {
		return timeRepository.findAll();
	}

}
