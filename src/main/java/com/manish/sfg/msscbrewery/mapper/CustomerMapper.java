package com.manish.sfg.msscbrewery.mapper;

import com.manish.sfg.msscbrewery.domain.Customer;
import com.manish.sfg.msscbrewery.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    CustomerDto customerToCustomerDto(Customer customer);

    Customer customerDtoToCustomer(CustomerDto customerDto);
}
