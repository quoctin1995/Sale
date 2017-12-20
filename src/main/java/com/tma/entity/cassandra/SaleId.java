package com.tma.entity.cassandra;
import java.util.UUID;
import java.io.Serializable;

import org.springframework.cassandra.core.PrimaryKeyType;
import org.springframework.data.cassandra.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.mapping.PrimaryKeyColumn;
@PrimaryKeyClass
public class SaleId implements Serializable{
	
	@PrimaryKeyColumn(name = "product_id",ordinal = 0, type = PrimaryKeyType.PARTITIONED)
	private UUID productId;
	@PrimaryKeyColumn(name = "time_id",ordinal = 1, type = PrimaryKeyType.CLUSTERED)
	private UUID timeId;
	@PrimaryKeyColumn(name = "location_id", ordinal = 2, type = PrimaryKeyType.CLUSTERED)
	private UUID locationId;
	@PrimaryKeyColumn(name = "customer_id", ordinal = 3, type = PrimaryKeyType.CLUSTERED)
	private UUID customerId;
	
	public SaleId() {
		
	}
	public UUID getProductId() {
		return productId;
	}
	public void setProductId(UUID productId) {
		this.productId = productId;
	}
	public UUID getTimeId() {
		return timeId;
	}
	public void setTimeId(UUID timeId) {
		this.timeId = timeId;
	}
	public UUID getLocationId() {
		return locationId;
	}
	public void setLocationId(UUID locationId) {
		this.locationId = locationId;
	}

	public UUID getCustomerId() {
		return customerId;
	}

	public void setCustomerId(UUID customerId) {
		this.customerId = customerId;
	}
}

