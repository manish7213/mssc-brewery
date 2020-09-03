package com.manish.sfg.msscbrewery.controller;

import com.manish.sfg.msscbrewery.model.BeerDto;
import com.manish.sfg.msscbrewery.service.BeerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;
@Deprecated
@Slf4j
@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID beerId) {
        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity handlePost(@RequestBody BeerDto beerDto) {
        BeerDto savedDto = beerService.saveNewBeer(beerDto);
        HttpHeaders httpHeaders = new HttpHeaders();
        //todo: Get complete URL as headerValue
        httpHeaders.add("Location", "/api/v1/beer/" + savedDto.getId().toString());
        return new ResponseEntity<>(httpHeaders, HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity handleUpdate(@PathVariable("beerId") UUID beerId,@RequestBody BeerDto beerDto) {
        beerService.updateBeer(beerId, beerDto);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{beerId}")
    public void deleteBeer(@PathVariable("beerId") UUID beerId) {
        log.debug("Deleting Beer {}" + beerId);
        beerService.deleteBeerById(beerId);
    }

}
