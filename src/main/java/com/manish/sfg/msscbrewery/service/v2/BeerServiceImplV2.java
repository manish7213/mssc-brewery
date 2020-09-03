package com.manish.sfg.msscbrewery.service.v2;

import com.manish.sfg.msscbrewery.model.v2.BeerDtoV2;
import com.manish.sfg.msscbrewery.model.v2.BeerStyleEnum;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Log4j2
public class BeerServiceImplV2 implements BeerServiceV2 {
    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return BeerDtoV2.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle(BeerStyleEnum.ALE)
                .build();
    }

    @Override
    public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDtoV2) {
        return BeerDtoV2.builder()
                .id(UUID.randomUUID())
                .beerName("Bud")
                .beerStyle(BeerStyleEnum.LAGER)
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDtoV2) {

        //todo: Real world scenario to update
    }

    @Override
    public void deleteBeerById(UUID beerId) {

        //todo: delete beer here
    }
}
