package com.tma.entity.postgresql;

import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "location", schema = "public")
public class Location {

	private UUID locationId;
	private String country;
	private String city;
	private Set<Sale> sale;

	public Location() {
	}

	public Location(UUID locationId) {
		this.locationId = locationId;
	}

	public Location(UUID locationId, String country, String city, Set<Sale> sale) {
		this.locationId = locationId;
		this.country = country;
		this.city = city;
		this.sale = sale;
	}

	@Id
	@Column(name = "location_id", unique = true, nullable = false)
	public UUID getLocationId() {
		return this.locationId;
	}

	public void setLocationId(UUID locationId) {
		this.locationId = locationId;
	}

	@Column(name = "country", length = 1)
	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Column(name = "city", length = 1)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@OneToMany(mappedBy = "location", fetch = FetchType.LAZY)
	public Set<Sale> getsale() {
		return this.sale;
	}

	public void setsale(Set<Sale> sale) {
		this.sale = sale;
	}
}