package com.pattern.designpatterns.creational.builder.builders;

import com.pattern.designpatterns.creational.builder.cars.Car;
import com.pattern.designpatterns.creational.builder.cars.CarType;
import com.pattern.designpatterns.creational.builder.components.Engine;
import com.pattern.designpatterns.creational.builder.components.GPSNavigator;
import com.pattern.designpatterns.creational.builder.components.Transmission;
import com.pattern.designpatterns.creational.builder.components.TripComputer;

public class CarBuilder implements Builder {
   private CarType type;
   private int seats;
   private Engine engine;
   private Transmission transmission;
   private TripComputer tripComputer;
   private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType type) {
        this.type=type;

    }

    @Override
    public void setSeats(int seats) {
        this.seats=seats;

    }

    @Override
    public void setEngine(Engine engine) {
            this.engine=engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission=transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
             this.tripComputer=tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
                      this.gpsNavigator=gpsNavigator;
    }
    public Car getResult(){
        return new Car(type,seats,engine,transmission,tripComputer,gpsNavigator);
    }
}
