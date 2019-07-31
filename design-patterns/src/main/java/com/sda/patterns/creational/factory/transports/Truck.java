package com.sda.patterns.creational.factory.transports;

public class Truck implements Transport {

    @Override
    public void deliver() {
        System.out.println("truck delivering");
    }
}
