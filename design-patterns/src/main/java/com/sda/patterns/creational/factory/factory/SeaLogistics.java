package com.sda.patterns.creational.factory.factory;

import com.sda.patterns.creational.factory.transports.Ship;
import com.sda.patterns.creational.factory.transports.Transport;

public class SeaLogistics extends Logistics {

    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
