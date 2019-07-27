package com.sda.patterns.creational.builder.builders;

import com.sda.patterns.creational.builder.cars.Car;

public class CarBuilder implements Builder {
    private Car car;
    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void setSeats(int seats) {
        this.car.setSeats(seats);
    }

    @Override
    public void setGPS(boolean gps) {
        this.car.setHasGPS(gps);
    }

    public Car getResult(){
        return this.car;
    }
}
