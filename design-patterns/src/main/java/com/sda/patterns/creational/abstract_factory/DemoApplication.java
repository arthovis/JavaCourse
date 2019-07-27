package com.sda.patterns.creational.abstract_factory;

import com.sda.patterns.creational.abstract_factory.factory.GUIFactory;
import com.sda.patterns.creational.abstract_factory.factory.MacFactory;
import com.sda.patterns.creational.abstract_factory.factory.WinFactory;

public class DemoApplication {
    public static void main(String[] args) {
        GUIFactory factory;
        String os = "win";
        if (os == "win"){
            factory = new WinFactory();
            factory.createButton();
        } else if (os == "mac"){
            factory = new MacFactory();
            factory.createButton();
        }
    }
}
