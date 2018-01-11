package com.tma.entity;

import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "time", schema = "public")
public class Time {

	private UUID timeId;
	private Integer month;
	private Integer quarter;
	private Integer year;
	private Set<Sale> sale;

	public Time() {
	}

	public Time(UUID timeId) {
		this.timeId = timeId;
	}

//	public Time(UUID timeId, Integer month, Integer quarter, Integer year, Set<Sale> sale) {
//		this.timeId = timeId;
//		this.month = month;
//		this.quarter = quarter;
//		this.year = year;
//		this.sale = sale;
//	}

	@Id
	@Column(name = "time_id", unique = true, nullable = false)
	public UUID getTimeId() {
		return this.timeId;
	}

	public void setTimeId(UUID timeId) {
		this.timeId = timeId;
	}

	@Column(name = "month")
	public Integer getMonth() {
		return this.month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	@Column(name = "quarter")
	public Integer getQuarter() {
		return this.quarter;
	}

	public void setQuarter(Integer quarter) {
		this.quarter = quarter;
	}

	@Column(name = "year")
	public Integer getYear() {
		return this.year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "time")
	public Set<Sale> getsale() {
		return this.sale;
	}

	public void setsale(Set<Sale> sale) {
		this.sale = sale;
	}

}
