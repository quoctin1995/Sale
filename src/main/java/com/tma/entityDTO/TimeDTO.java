package com.tma.entityDTO;

import java.util.UUID;

import com.tma.entity.Time;

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

	public Integer getMonth() {
		return month;
	}


	public Integer getQuarter() {
		return quarter;
	}

	public Integer getYear() {
		return year;
	}

}
