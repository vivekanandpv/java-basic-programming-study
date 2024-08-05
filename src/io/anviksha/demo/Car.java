package io.anviksha.demo;

public class Car extends FourWheeler {
    @Override
    public void drive() {
        System.out.println("Car overrides drive method");
        super.drive();
    }
}
