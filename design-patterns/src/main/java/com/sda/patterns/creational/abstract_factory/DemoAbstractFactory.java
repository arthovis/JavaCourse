package com.sda.patterns.creational.abstract_factory;

import com.sda.patterns.creational.abstract_factory.factory.MacFactory;
import com.sda.patterns.creational.abstract_factory.factory.WinFactory;

import java.util.Scanner;

public class DemoAbstractFactory {

    public static void main(String[] args) {
        //  create a correct factory based on input (win or mac)

        //  create an application UI and paint it
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the OS (WIN/MAC): ");
        String os = scanner.nextLine();
        if (os.equals("WIN")) {
            WinFactory winFactory = new WinFactory();
            Application application = new Application(winFactory);
            application.createUI();
            application.paint();
        } else if (os.equals("MAC")) {
            MacFactory macFactory = new MacFactory();
            Application application = new Application(macFactory);
            application.createUI();
            application.paint();
        }


    }
}

