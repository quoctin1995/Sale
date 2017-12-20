package com.tma.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tma.entity.cassandra.Location;
import com.tma.entityDTO.cassandra.LocationDTO;
import com.tma.exception.NoHandlerFoundException;
import com.tma.service.cassandra.LocationService;

@RestController
@RequestMapping("getlocation")
public class LocationControllerGet {

	@Autowired
	private LocationService locationService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<LocationDTO>> getAllLocations()  {
		List<Location> listLocation = (List<Location>) locationService.getAllLocation();
		
		if(listLocation.size() == 0) {
			throw new NoHandlerFoundException("NOT FOUND DATA");
		}
		
		List<LocationDTO> listLocationDTO = new ArrayList<>();
		for (Location location : listLocation) {
			listLocationDTO.add(new LocationDTO(location));
		}
		return new ResponseEntity<>(listLocationDTO,HttpStatus.OK);
	}
}