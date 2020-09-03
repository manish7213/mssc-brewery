package com.manish.sfg.msscbrewery.controller;

import com.manish.sfg.msscbrewery.model.CustomerDto;
import com.manish.sfg.msscbrewery.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerControlller {

    private final CustomerService customerService;

    public CustomerControlller(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{custId}")
    public ResponseEntity<CustomerDto> getCustomer(@PathVariable("custId") UUID custId) {

        return new ResponseEntity<>(customerService.getCustomerById(custId), HttpStatus.OK);
    }
}
