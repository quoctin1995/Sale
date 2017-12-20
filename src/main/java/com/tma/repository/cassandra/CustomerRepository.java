package com.tma.repository.cassandra;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.tma.entity.cassandra.Customer;

public interface CustomerRepository extends CrudRepository<Customer, UUID> {
}
