package com.sda.patterns.creational.abstract_factory.factory;

import com.sda.patterns.creational.abstract_factory.button.Button;

public interface GUIFactory {
    Button createButton();
}
