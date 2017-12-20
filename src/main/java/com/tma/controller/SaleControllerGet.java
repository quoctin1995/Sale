package com.tma.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tma.entity.cassandra.Sale;
import com.tma.entityDTO.cassandra.SaleDTO;
import com.tma.exception.NoHandlerFoundException;
import com.tma.service.cassandra.SaleService;

@RestController
@RequestMapping("getsale")
public class SaleControllerGet {

	@Autowired
	private SaleService saleService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<SaleDTO>> getAllSales(){
		List<Sale> listSales = (List<Sale>) saleService.getAllSale();
		
		if (listSales.size() == 0) {
			throw new NoHandlerFoundException("NOT FOUND DATA");
		}
		
		List<SaleDTO> listSaleDTO = new ArrayList<>();
		for (Sale sale : listSales) {
			listSaleDTO.add(new SaleDTO(sale));
		}
		return new ResponseEntity<>(listSaleDTO,HttpStatus.OK);
	}
}
