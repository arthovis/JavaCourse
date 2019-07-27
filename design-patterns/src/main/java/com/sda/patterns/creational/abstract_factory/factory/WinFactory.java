package com.sda.patterns.creational.abstract_factory.factory;

import com.sda.patterns.creational.abstract_factory.button.Button;
import com.sda.patterns.creational.abstract_factory.button.WinButton;

public class WinFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }
}
