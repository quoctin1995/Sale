package com.tma.service.cassandra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tma.entity.cassandra.Sale;
import com.tma.repository.cassandra.SaleRepository;


@Service
public class SaleServiceImpl implements SaleService{
	@Autowired
	private SaleRepository saleRepository;
	
	@Override
	public Iterable<Sale> getAllSale() {
		return saleRepository.findAll();
	}
}
