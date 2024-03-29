package com.sda.patterns.behavioral.state;

import com.sda.patterns.behavioral.state.ui.Player;
import com.sda.patterns.behavioral.state.ui.UI;

public class DemoStatePattern {

    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
