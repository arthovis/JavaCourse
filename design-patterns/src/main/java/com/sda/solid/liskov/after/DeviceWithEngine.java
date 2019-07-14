package com.sda.solid.liskov.after;

public class DeviceWithEngine extends TransportationDevice {
    private Engine engine;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void startEngine(){}
}
