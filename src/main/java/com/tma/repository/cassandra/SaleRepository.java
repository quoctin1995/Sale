package com.tma.repository.cassandra;

import org.springframework.data.repository.CrudRepository;

import com.tma.entity.cassandra.Sale;
import com.tma.entity.cassandra.SaleId;

public interface SaleRepository extends CrudRepository<Sale, SaleId>{

}
