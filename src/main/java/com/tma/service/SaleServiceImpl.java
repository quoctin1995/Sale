package com.tma.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tma.entity.Sale;
import com.tma.repository.SaleRepository;

@Service
public class SaleServiceImpl implements SaleService {

	@Autowired
	private SaleRepository saleRepository;

	@Override
	public List<Sale> getSale() {
		return saleRepository.findAll();
	}

	@Override
	public void saveSale(Sale Sale) {
		saleRepository.save(Sale);
	}

	@Override
	public void addSale(UUID productId, UUID timeId, UUID locationId, BigDecimal dollars) {
		saleRepository.addSale(productId, timeId, locationId, dollars);
	}

}
