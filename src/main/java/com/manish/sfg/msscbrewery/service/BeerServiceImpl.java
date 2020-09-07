package com.manish.sfg.msscbrewery.service;

import com.manish.sfg.msscbrewery.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("Bud")
                .beerStyle("Premium")
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {

        //todo: Real world scenario to update
    }

    @Override
    public void deleteBeerById(UUID beerId) {

        //todo: delete beer here
    }
}
