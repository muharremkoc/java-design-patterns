package com.pattern.designpatterns.creational.builder.builders;

import com.pattern.designpatterns.creational.builder.cars.CarType;
import com.pattern.designpatterns.creational.builder.components.Engine;
import com.pattern.designpatterns.creational.builder.components.GPSNavigator;
import com.pattern.designpatterns.creational.builder.components.Transmission;
import com.pattern.designpatterns.creational.builder.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);

}
