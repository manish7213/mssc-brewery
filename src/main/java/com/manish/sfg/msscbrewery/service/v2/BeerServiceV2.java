package com.manish.sfg.msscbrewery.service.v2;

import com.manish.sfg.msscbrewery.model.BeerDto;
import com.manish.sfg.msscbrewery.model.v2.BeerDtoV2;

import java.util.UUID;

public interface BeerServiceV2 {


    BeerDtoV2 getBeerById(UUID beerId);

    BeerDtoV2 saveNewBeer(BeerDtoV2 beerDtoV2);

    void updateBeer(UUID beerId, BeerDtoV2 beerDtoV2);

    void deleteBeerById(UUID beerId);
}
