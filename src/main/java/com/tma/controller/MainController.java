package com.tma.controller;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tma.entity.Location;
import com.tma.service.LocationService;

@Controller
public class MainController {
	
	@Autowired
	private LocationService locationService;

	@GetMapping("/")
	public String home(HttpServletRequest request){
		request.setAttribute("mode", "HOME");
		return "index";
	}
	
	@GetMapping("/all-location")
	public String allLocation(HttpServletRequest request){
		request.setAttribute("locations", locationService.getAllLocation());
		request.setAttribute("mode", "ALL");
		return "index";
	}
	
	@GetMapping("/new-location")
	public String newLocation(HttpServletRequest request){
		request.setAttribute("mode", "NEW");
		return "index";
	}
	
	@PostMapping("/save-location")
	public String saveLocation(@ModelAttribute Location location, HttpServletRequest request){
		UUID uuid = UUID.randomUUID();
		location.setLocationId(uuid);
		locationService.saveLocation(location);
		request.setAttribute("locations", locationService.getAllLocation());
		request.setAttribute("mode", "ALL");
		return "index";
	}
	
	@GetMapping("/delete-location")
	public String deleteLocation(@RequestParam UUID locationId, HttpServletRequest request){
		locationService.deleteLocation(locationId);
		request.setAttribute("locations", locationService.getAllLocation());
		request.setAttribute("mode", "ALL");
		return "index";
	}
	
	@GetMapping("/update-location")
	public String updateLocation(@RequestParam UUID locationId, HttpServletRequest request){
		request.setAttribute("location", locationService.getOneLocation(locationId));
		request.setAttribute("mode", "UPDATE");
		return "index";
	}
	
}
