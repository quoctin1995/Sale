package com.tma.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tma.entity.cassandra.Time;
import com.tma.entityDTO.cassandra.TimeDTO;
import com.tma.exception.NoHandlerFoundException;
import com.tma.service.cassandra.TimeService;

@RestController
@RequestMapping("gettime")
public class TimeControllerGet {

	@Autowired
	private TimeService timeService;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<TimeDTO>> getAllTimes() {
		List<Time> listTime = (List<Time>) timeService.getAllTime();
		
		if(listTime.size() == 0) {
			throw new NoHandlerFoundException("NOT FOUND DATA");
		}
		
		List<TimeDTO> listTimeDTO = new ArrayList<>();
		for (Time time : listTime) {
			listTimeDTO.add(new TimeDTO(time));
		}
		return new ResponseEntity<>(listTimeDTO, HttpStatus.OK);
	}

}
