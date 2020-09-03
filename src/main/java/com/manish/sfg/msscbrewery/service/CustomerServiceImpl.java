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
}
