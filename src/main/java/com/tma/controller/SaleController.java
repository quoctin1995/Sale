package com.tma.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tma.entity.Sale;
import com.tma.service.SaleService;


@RestController
@RequestMapping("sale")
public class SaleController {

	@Autowired
	private SaleService saleService;

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Sale> add(@RequestBody Sale sales) {
		saleService.addSale(sales.getProduct().getProductId(), sales.getTime().getTimeId(),
				sales.getLocation().getLocationId(), BigDecimal.valueOf(sales.getDollars().val));
		return new ResponseEntity<Sale>(sales, HttpStatus.OK);
	}
}
