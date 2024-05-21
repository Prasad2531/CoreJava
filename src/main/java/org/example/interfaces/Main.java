package org.example.interfaces;

public class Main {
    public static void main(String[] args) {
        //              Engine          Brake
        //                 |              |     <-- Multiple Inheritance
        //                 ----- Car ------
        //
        Car car = new Car();
        car.start();
        car.acc();
        car.brake();
        car.stop();
    }
}
