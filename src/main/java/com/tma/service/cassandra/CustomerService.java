package com.tma.service.cassandra;

import com.tma.entity.cassandra.Customer;

public interface CustomerService {
    Iterable<Customer> getAllCustomer();
}
