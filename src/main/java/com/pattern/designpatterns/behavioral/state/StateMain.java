package com.pattern.designpatterns.behavioral.state;

import com.pattern.designpatterns.behavioral.state.ui.Player;
import com.pattern.designpatterns.behavioral.state.ui.UI;

public class StateMain {
    public static void main(String[] args) {
        Player player=new Player();
        UI ui=new UI(player);
        ui.init();

    }
}
