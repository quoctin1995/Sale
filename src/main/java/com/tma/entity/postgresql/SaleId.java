package com.tma.entity.postgresql;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class SaleId implements java.io.Serializable {
	private UUID productId;
	private UUID timeId;
	private UUID locationId;

	public SaleId() {
	}

	public SaleId(UUID productId, UUID timeId, UUID locationId) {
		this.productId = productId;
		this.timeId = timeId;
		this.locationId = locationId;
	}

	@Column(name = "product_id", nullable = false)
	public UUID getProductId() {
		return this.productId;
	}

	public void setProductId(UUID productId) {
		this.productId = productId;
	}

	@Column(name = "time_id", nullable = false)
	public UUID getTimeId() {
		return this.timeId;
	}

	public void setTimeId(UUID timeId) {
		this.timeId = timeId;
	}

	@Column(name = "location_id", nullable = false)
	public UUID getLocationId() {
		return this.locationId;
	}

	public void setLocationId(UUID locationId) {
		this.locationId = locationId;
	}

}
