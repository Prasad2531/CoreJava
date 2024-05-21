package org.example.interfaces;

public class Car implements Engine,Brake{
    @Override
    public void brake() {
        System.out.println("Brake method called");
    }

    @Override
    public void start() {
        System.out.println("Starting the car");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the car");
    }

    @Override
    public void acc() {
        System.out.println("Accelerating the car");
    }
}
