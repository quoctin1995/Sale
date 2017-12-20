package com.tma.entityDTO.cassandra;

import java.util.UUID;

import com.tma.entity.cassandra.Time;

public class TimeDTO {
	private UUID timeId;
	private Integer month;
	private Integer quarter;
	private Integer year;

	public TimeDTO(Time time) {
		this.timeId = time.getTimeId();
		this.month = time.getMonth();
		this.quarter = time.getQuarter();
		this.year = time.getYear();
	}

	public UUID getTimeId() {
		return timeId;
	}

//	public void setTimeId(UUID timeId) {
//		this.timeId = timeId;
//	}

	public Integer getMonth() {
		return month;
	}

//	public void setMonth(Integer month) {
//		this.month = month;
//	}

	public Integer getQuarter() {
		return quarter;
	}

//	public void setQuarter(Integer quarter) {
//		this.quarter = quarter;
//	}

	public Integer getYear() {
		return year;
	}

//	public void setYear(Integer year) {
//		this.year = year;
//	}

}