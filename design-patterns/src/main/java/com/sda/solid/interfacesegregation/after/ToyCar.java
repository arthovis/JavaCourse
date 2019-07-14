package com.sda.solid.interfacesegregation.after;

public class ToyCar implements Toy, Movable {
    private double price;
    private String color;

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void move() {
        System.out.println("Vrooom");
    }
}
