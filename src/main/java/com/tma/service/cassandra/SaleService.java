package com.tma.service.cassandra;

import com.tma.entity.cassandra.Sale;

public interface SaleService {
	Iterable<Sale> getAllSale();
}
