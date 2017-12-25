package com.tma.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tma.entity.Time;
import com.tma.entityDTO.TimeDTO;
import com.tma.service.TimeService;


@RestController
@RequestMapping("time")
public class TimeController {

	@Autowired
	private TimeService timeService;

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Time> addTime(@RequestBody Time time) {
		UUID uuid = UUID.randomUUID();
		time.setTimeId(uuid);
		timeService.saveTime(time);
		return new ResponseEntity<Time>(time, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<TimeDTO>> getTimes() {
		List<Time> listTimes = timeService.getAllTime();

		List<TimeDTO> listTimeDTO = new ArrayList<>();
		for (Time time : listTimes) {
			listTimeDTO.add(new TimeDTO(time));
		}
		return new ResponseEntity<>(listTimeDTO, HttpStatus.OK);
	}

}
