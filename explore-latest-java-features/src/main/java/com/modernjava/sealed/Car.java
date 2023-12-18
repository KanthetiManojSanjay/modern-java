package com.modernjava.sealed;

public sealed class Car extends Vehicle implements SmartMediaPlayer permits FlyingCar {


    // final - ensures no other classes can extended this car class
    // sealed - ensures inheritance is allowed but controlled for classes that defined after permits keyword
    // non-sealed - any class can extend this subClass car. This disables the controlled behavior

    @Override
    public String drive() {
        return "CAR";
    }

    @Override
    public void connectPhone() {
        System.out.println("Phone connected");
    }
}
