package com.sda.patterns.creational.abstract_factory.factory;

import com.sda.patterns.creational.abstract_factory.button.Button;
import com.sda.patterns.creational.abstract_factory.button.MacButton;

public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }
}
