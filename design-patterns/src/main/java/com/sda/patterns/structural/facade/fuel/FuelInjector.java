package com.sda.patterns.structural.facade.fuel;

public class FuelInjector {
    FuelPump fuelPump = new FuelPump();

    public void setFuelPump(FuelPump fuelPump) {
        this.fuelPump = fuelPump;
    }

    public void on(){
        System.out.println("Turning on...");
    }

    public void inject(){
        System.out.println("Injecting...");
    }

    public void off(){
        System.out.println("Turning off...");
    }
}
