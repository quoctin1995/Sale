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

import com.tma.entity.Location;
import com.tma.entityDTO.LocationDTO;
import com.tma.service.LocationService;

@RestController
@RequestMapping("location")
public class LocationController {
	
	@Autowired
	private LocationService locationService;

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Location> addLocation(@RequestBody Location location) {
		UUID uuid = UUID.randomUUID();
		location.setLocationId(uuid);
		locationService.saveLocation(location);
		return new ResponseEntity<Location>(HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<LocationDTO>> getAllLocation() {
		List<Location> listLocation = null;
		listLocation = locationService.getAllLocation();

		List<LocationDTO> listLocationDTO = new ArrayList<>();
		for (Location location : listLocation) {
			listLocationDTO.add(new LocationDTO(location));
		}
		return new ResponseEntity<>(listLocationDTO, HttpStatus.OK);
	}
	
	
}

//	@Autowired
//	private LocationService locationService;
//
//	@RequestMapping(value = "location", method = RequestMethod.POST)
//	public ResponseEntity<Location> addLocation(@RequestBody Location location) {
//		UUID uuid = UUID.randomUUID();
//		location.setLocationId(uuid);
//		locationService.saveLocation(location);
//		return new ResponseEntity<Location>(HttpStatus.OK);
//	}
//
//	@RequestMapping(value = "location/{locationId}", method = RequestMethod.GET)
//	public ResponseEntity<List<LocationDTO>> getAllLocation(UUID locationId) {
//		Location listLocation = null;
//		listLocation = locationService.getOneLocation(locationId);
//
////		if (listLocation.size() == 0) {
////			throw new NoHandlerFoundException("NOT FOUND DATA");
////		}
//
//		List<LocationDTO> listLocationDTO = new ArrayList<>();
////		for (Location location : listLocation) {
//			listLocationDTO.add(new LocationDTO(listLocation));
////		}
//		return new ResponseEntity<>(listLocationDTO, HttpStatus.OK);
//	}
//}
