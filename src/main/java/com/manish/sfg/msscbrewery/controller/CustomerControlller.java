package com.manish.sfg.msscbrewery.controller;

import com.manish.sfg.msscbrewery.model.BeerDto;
import com.manish.sfg.msscbrewery.model.CustomerDto;
import com.manish.sfg.msscbrewery.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.ConstraintViolationException;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Slf4j
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

    @PostMapping
    public ResponseEntity handlePost(@Valid @RequestBody CustomerDto customerDto) {
        CustomerDto savedDto = customerService.saveNewCustomer(customerDto);
        HttpHeaders httpHeaders = new HttpHeaders();
        //todo: Get complete URL as headerValue
        httpHeaders.add("Location", "/api/v1/customer/" + savedDto.getId().toString());
        return new ResponseEntity<>(httpHeaders, HttpStatus.CREATED);
    }

    @PutMapping("/{customerId}")
    public ResponseEntity handleUpdate(@PathVariable("customerId") UUID customerId, @Valid @RequestBody CustomerDto customerDto) {
        customerService.updateCustomer(customerId, customerDto);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{customerId}")
    public void deleteBeer(@PathVariable("customerId") UUID customerId) {
        log.debug("Deleting Beer {0}" + customerId);
        customerService.deleteBeerById(customerId);
    }

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<List> handleErrors(ConstraintViolationException e) {

        List<String> errors = new ArrayList<>(e.getConstraintViolations().size());

        e.getConstraintViolations()
                .forEach(constraintViolation -> errors.add(constraintViolation.getPropertyPath() + " | " + constraintViolation.getMessage()));
        return new ResponseEntity<>(errors,HttpStatus.BAD_REQUEST);
    }

}
