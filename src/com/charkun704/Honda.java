package com.charkun704;

public class Honda extends Car {
    public Honda(String carName, int cylinders) {
        super(carName, cylinders);
    }

    @Override
    public String startEngine() {
        return "Honda startEngine";
    }

    @Override
    public String accelerate() {
        return "Honda accelerate";
    }

    @Override
    public String brake() {
        return "Honda startEngine";
    }
}
