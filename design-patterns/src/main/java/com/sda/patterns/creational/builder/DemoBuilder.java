package com.sda.patterns.creational.builder;

import com.sda.patterns.creational.builder.builders.CarBuilder;
import com.sda.patterns.creational.builder.director.Director;

public class DemoBuilder {

    public static void main(String[] args) {
        CarBuilder carBuilder = new CarBuilder();
        Director director = new Director();

        //  use a director to construct a sports car
        director.constructSportsCar(carBuilder);

        // TODO: use a director to construct a manual for the car

    }
}
