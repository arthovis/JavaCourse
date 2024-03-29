package com.sda.patterns.behavioral.mediator.components;

import com.sda.patterns.behavioral.mediator.mediator.Mediator;

public interface Component {

    void setMediator(Mediator mediator);

    String getName();
}
