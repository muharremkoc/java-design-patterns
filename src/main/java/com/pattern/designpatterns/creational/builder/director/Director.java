package com.pattern.designpatterns.creational.builder.director;

import com.pattern.designpatterns.creational.builder.builders.Builder;
import com.pattern.designpatterns.creational.builder.cars.CarType;
import com.pattern.designpatterns.creational.builder.components.Engine;
import com.pattern.designpatterns.creational.builder.components.GPSNavigator;
import com.pattern.designpatterns.creational.builder.components.Transmission;
import com.pattern.designpatterns.creational.builder.components.TripComputer;

public class Director {
    public void constructSportsCar(Builder builder){
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0d,0d));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }
    public void constructCityCar(Builder builder){
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2,0d));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }
    public void constructSUVCar(Builder builder){
        builder.setCarType(CarType.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5d,0d));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPSNavigator(new GPSNavigator());
    }

}
