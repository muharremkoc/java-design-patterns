package com.pattern.designpatterns.creational.builder;

import com.pattern.designpatterns.creational.builder.builders.CarBuilder;
import com.pattern.designpatterns.creational.builder.builders.CarManualBuilder;
import com.pattern.designpatterns.creational.builder.cars.Car;
import com.pattern.designpatterns.creational.builder.cars.Manual;
import com.pattern.designpatterns.creational.builder.director.Director;

public class BuilderMain {
    public static void main(String[] args) {
        Director director=new Director();
        CarBuilder builder=new CarBuilder();
        director.constructSportsCar(builder);

        Car car=builder.getResult();
        System.out.println("Car built:\n"+car.getCarType());

        CarManualBuilder manualBuilder=new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual carManual=manualBuilder.getResult();
        System.out.println("\nCar manual built:\n"+carManual.print());
    }
}
