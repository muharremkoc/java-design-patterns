package com.pattern.designpatterns.creational.abstractfactory;

import com.pattern.designpatterns.creational.abstractfactory.factories.GUIFactory;
import com.pattern.designpatterns.creational.abstractfactory.factories.MacOSFactory;
import com.pattern.designpatterns.creational.abstractfactory.factories.WindowsFactory;

public class AbstractFactoryMain {
    private static  Application configureApplication(){
        Application app;
        GUIFactory guiFactory;
        String osName=System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")){
            guiFactory=new MacOSFactory();
            app=new Application(guiFactory);
        }else {
            guiFactory=new WindowsFactory();
            app=new Application(guiFactory);
        }
        return app;
    }




    public static void main(String[] args) {
          Application app=configureApplication();
          app.paint();
    }
}
