package com.sda.solid.liskov.after;


public class TransportationDevice {
    private String name;
    private double speed;
    private String year;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setYearOfFabrication(String year){
        this.year = year;
    }

}
