package com.sda.patterns.creational.builder.builders;

import com.sda.patterns.creational.builder.cars.Type;
import com.sda.patterns.creational.builder.components.Engine;
import com.sda.patterns.creational.builder.components.GPSNavigator;
import com.sda.patterns.creational.builder.components.Transmission;
import com.sda.patterns.creational.builder.components.TripComputer;

public interface Builder {

    void setType(Type type);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);
}
