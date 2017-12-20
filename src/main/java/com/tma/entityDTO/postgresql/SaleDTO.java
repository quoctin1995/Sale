package com.tma.entityDTO.postgresql;

import java.math.BigDecimal;
import java.util.UUID;

import com.tma.entity.postgresql.Sale;

public class SaleDTO {
	private UUID productId;
	private UUID locationId;
	private UUID timeId;
	private BigDecimal dollars;

	public SaleDTO(Sale sale) {
		this.productId = sale.getProduct().getProductId();
		this.locationId = sale.getLocation().getLocationId();
		this.timeId = sale.getTime().getTimeId();
		this.dollars = BigDecimal.valueOf(sale.getDollars().val);
	}

	public UUID getProductId() {
		return productId;
	}

	public void setProductId(UUID productId) {
		this.productId = productId;
	}

	public UUID getLocationId() {
		return locationId;
	}

	public void setLocationId(UUID locationId) {
		this.locationId = locationId;
	}

	public UUID getTimeId() {
		return timeId;
	}

	public void setTimeId(UUID timeId) {
		this.timeId = timeId;
	}

	public BigDecimal getDollars() {
		return dollars;
	}

	public void setDollars(BigDecimal dollars) {
		this.dollars = dollars;
	}

}
