package com.tma.service.postgresql;

import java.math.BigDecimal;
import java.util.UUID;

import com.tma.entity.postgresql.Sale;

public interface SaleService {

//	List<Sale> getSale();
	Iterable<Sale> getAllSale();

	void saveSale(Sale sale);

	void addSale(UUID productId, UUID timeId, UUID locationId, BigDecimal dollars);
}
