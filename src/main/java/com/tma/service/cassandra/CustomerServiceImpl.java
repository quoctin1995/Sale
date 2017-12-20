package com.tma.service.cassandra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tma.entity.cassandra.Customer;
import com.tma.repository.cassandra.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Iterable<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }
}
