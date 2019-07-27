package com.sda.patterns.structural.facade.airflow;

public class AirFlowController {
    AirFlowMeter airFlowMeter = new AirFlowMeter();

    public void setAirFlowMeter(AirFlowMeter airFlowMeter) {
        this.airFlowMeter = airFlowMeter;
    }

    public void takeAir(){
        airFlowMeter.getMeasurements();
        System.out.println("Taking air.");
    }
    public void off(){
        System.out.println("Turning off...");
    }
}
