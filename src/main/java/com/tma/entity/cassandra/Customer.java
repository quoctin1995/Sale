package com.tma.entity.cassandra;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

import java.util.UUID;

@Table("customer")
public class Customer {
    @PrimaryKey("customer_id")
    private UUID customerId;
    @Column("customer_name")
    private String customerName;
    @Column("address")
    private String address;

    public Customer(UUID customerId, String customerName, String address) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.address = address;
    }
    public Customer() {
    	
    }

    public UUID getCustomerId() {
        return customerId;
    }

    public void setCustomerId(UUID customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
