package com.sda.patterns.creational.builder.builders;

public interface Builder {
    void reset();
    void setSeats(int seats);
    void setGPS(boolean gps);
}
