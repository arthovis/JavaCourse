package com.sda.patterns.creational.factory.factory;

import com.sda.patterns.creational.factory.transports.Transport;
import com.sda.patterns.creational.factory.transports.Truck;

public class RoadLogistics extends Logistics {

    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
