package com.pattern.designpatterns.creational.builder.components;

import com.pattern.designpatterns.creational.builder.cars.Car;

public class TripComputer {
  private Car car;

    public void setCar(Car car) {
        this.car = car;
    }
    public void showFuelLevel(){
        System.out.println("Fuel level"+car.getFuel());
    }
  public void showStatus(){
        if (this.car.getEngine().isStarted()){
            System.out.println("Car is Started");
        }else {
            System.out.println("Car isn't started");
        }
  }
}
