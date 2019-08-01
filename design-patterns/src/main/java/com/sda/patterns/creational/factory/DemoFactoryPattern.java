package com.sda.patterns.creational.factory;

import com.sda.patterns.creational.factory.factory.RoadLogistics;
import com.sda.patterns.creational.factory.factory.SeaLogistics;

import java.util.Scanner;

public class DemoFactoryPattern {

    public static void main(String[] args) {

        //  create the right factory based on an input (truck or ship)
        Scanner input = new Scanner(System.in);
        System.out.println("Insert type of transport (truck/ship): ");
        String transport = input.nextLine();
        if (transport.equals("truck")) {
            RoadLogistics factory = new RoadLogistics();
            factory.planDelivery();
            factory.createTransport();
        } else if (transport.equals("ship")) {
            SeaLogistics factory = new SeaLogistics();
            factory.planDelivery();
            factory.createTransport();
        }

    }
}

