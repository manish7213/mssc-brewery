package com.manish.sfg.msscbrewery.service;

import com.manish.sfg.msscbrewery.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    CustomerDto getCustomerById(UUID custId);
}
