package com.sda.solid.interfacesegregation.after;

public class ToyPlane implements Toy, Flyable{
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
    public void fly(){
        System.out.println("Look mommy, no wheels!!!!");
    }
}
