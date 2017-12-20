package com.tma.entityDTO.cassandra;

import java.math.BigDecimal;
import java.util.UUID;

import com.tma.entity.cassandra.Sale;

public class SaleDTO {

	private UUID productId;
	private UUID locationId;
	private UUID timeId;
	private UUID customerId;
	private BigDecimal dollars;

	public SaleDTO(Sale sales) {
		this.productId = sales.getProductId();
		this.locationId = sales.getLocationId();
		this.timeId = sales.getTimeId();
		this.customerId = sales.getCustomerId();
		this.dollars = sales.getDollars();
	}

	public UUID getProductId() {
		return productId;
	}

//	public void setProductId(UUID productId) {
//		this.productId = productId;
//	}

	public UUID getLocationId() {
		return locationId;
	}

//	public void setLocationId(UUID locationId) {
//		this.locationId = locationId;
//	}

	public UUID getTimeId() {
		return timeId;
	}

//	public void setTimeId(UUID timeId) {
//		this.timeId = timeId;
//	}

	public UUID getCustomerId() {
		return customerId;
	}

//	public void setCustomerId(UUID customerId) {
//		this.customerId = customerId;
//	}

	public BigDecimal getDollars() {
		return dollars;
	}

//	public void setDollars(BigDecimal dollars) {
//		this.dollars = dollars;
//	}

}

