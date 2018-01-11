package com.tma.entityDTO;

import java.util.UUID;

import com.tma.entity.Location;

public class LocationDTO {
	private UUID locationId;
	private String country;
	private String city;

	public LocationDTO(Location location) {
		this.locationId = location.getLocationId();
		this.country = location.getCountry();
		this.city = location.getCity();
	}

	public UUID getLocationId() {
		return locationId;
	}

	public String getCountry() {
		return country;
	}

	public String getCity() {
		return city;
	}

}
