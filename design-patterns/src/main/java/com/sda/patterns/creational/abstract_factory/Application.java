package com.sda.patterns.creational.abstract_factory;

import com.sda.patterns.creational.abstract_factory.button.Button;
import com.sda.patterns.creational.abstract_factory.factory.GUIFactory;

public class Application {
    private GUIFactory factory;
    private Button button;

    public Application(GUIFactory factory) {
        this.factory = factory;
    }

    void createUI() {
        this.button = factory.createButton();
    }

    void paint(){
        button.paint();
    }
}
