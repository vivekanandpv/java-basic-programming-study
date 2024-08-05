package io.anviksha.demo;


public class Main {
    public static void main(String[] args) {

    }
}

class Vehicle {
    //  final fields should be initialized in place or in constructor
    //  only one assignment is allowed, subsequent assignments are errors
    //  setters cannot be declared, obviously
    private final String registrationNumber;

    public Vehicle(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    //  a final method cannot be overridden
    public final void drive() {
        System.out.println("Vehicle drives...");
    }
}

//  a final class cannot be subclassed
final class FourWheeler extends Vehicle {

    public FourWheeler(String registrationNumber) {
        super(registrationNumber);
    }
}

//  error, cannot subclass final FourWheeler
//class Car extends FourWheeler {
//
//}