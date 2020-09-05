package com.manish.sfg.msscbrewery.service;

import com.manish.sfg.msscbrewery.model.BeerDto;
import com.manish.sfg.msscbrewery.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    CustomerDto getCustomerById(UUID custId);

    CustomerDto saveNewCustomer(CustomerDto customerDto);

    void updateCustomer(UUID customerId, CustomerDto customerDto);

    void deleteBeerById(UUID customerId);
}
