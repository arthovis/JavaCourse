package com.sda.patterns.creational.builder.director;

import com.sda.patterns.creational.builder.builders.Builder;

public class Director {
    public void constructSportsCar(Builder builder){
        builder.reset();
        builder.setSeats(2);
        builder.setGPS(true);
    }
}
