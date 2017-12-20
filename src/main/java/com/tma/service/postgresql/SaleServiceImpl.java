package com.tma.service.postgresql;

import java.math.BigDecimal;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tma.entity.postgresql.Sale;
import com.tma.repository.postgresql.SaleRepository;

@Service
public class SaleServiceImpl implements SaleService {

	@Autowired
	private SaleRepository saleRepository;

//	@Override
//	public List<Sale> getAllSale() {
//		return saleRepository.findAll();
//	}

	@Override
	public void saveSale(Sale Sale) {
		saleRepository.save(Sale);
	}

	@Override
	public void addSale(UUID productId, UUID timeId, UUID locationId, BigDecimal dollars) {
		saleRepository.addSale(productId, timeId, locationId, dollars);
	}
	
	@Override
	public Iterable<Sale> getAllSale() {
		return saleRepository.findAll();
	}

}
