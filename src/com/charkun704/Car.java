package com.charkun704;

public class Car {
    private String carName;
    private boolean hasEngine;
    private int cylinders;
    private int wheels;

    public Car(String carName, int cylinders) {
        this.carName = carName;
        this.hasEngine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getCarName() {
        return carName;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine(){
        return "Car.startEngine(): Engine start.";
    }

    public String accelerate(){
        return "Car.accelerate(): Speed up.";
    }

    public String brake(){
        return "Car.brake(): Slowking down.";
    }
}
