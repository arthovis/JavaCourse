package com.sda.solid.liskov.after;

public class Car extends DeviceWithEngine {
    private Engine engine;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void startEngine(){
        System.out.println("Vrooom");
    }
}
