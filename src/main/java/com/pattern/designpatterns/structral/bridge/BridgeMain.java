package com.pattern.designpatterns.structral.bridge;

import com.pattern.designpatterns.structral.bridge.devices.Device;
import com.pattern.designpatterns.structral.bridge.devices.Radio;
import com.pattern.designpatterns.structral.bridge.devices.Tv;
import com.pattern.designpatterns.structral.bridge.remotes.AdvancedRemote;
import com.pattern.designpatterns.structral.bridge.remotes.BasicRemote;

public class BridgeMain {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());

    }
    public static void testDevice(Device device){
        System.out.println("Tests with basic remote");
        BasicRemote basicRemote=new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote");
        AdvancedRemote advancedRemote =new AdvancedRemote(device);
        advancedRemote.power();
        device.printStatus();
    }

}
