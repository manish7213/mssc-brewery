package com.manish.sfg.msscbrewery.mapper;

import com.manish.sfg.msscbrewery.domain.Beer;
import com.manish.sfg.msscbrewery.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);

}
