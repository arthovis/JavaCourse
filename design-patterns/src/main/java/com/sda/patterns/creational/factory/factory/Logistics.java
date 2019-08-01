package com.sda.patterns.creational.factory.factory;

import com.sda.patterns.creational.factory.transports.Transport;

public abstract class Logistics {

    public void planDelivery() {
        Transport transport = createTransport();
        transport.deliver();
    }

    abstract Transport createTransport();
}
