package com.manish.sfg.msscbrewery.service;

import com.manish.sfg.msscbrewery.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID custId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Manish")
                .build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("MANISH")
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
    //todo: impl
    }

    @Override
    public void deleteBeerById(UUID customerId) {
    //todo: impl
    }
}
