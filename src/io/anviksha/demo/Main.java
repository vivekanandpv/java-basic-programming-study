package io.anviksha.demo;


public class Main {
    public static void main(String[] args) {
        Car c = new Car();

        //  inherited from Vehicle (Vehicle to FourWheeler to Car)
        //  check how this gets dispatched to the Vehicle class through debugger
        c.drive();
        //  c.foo();    // error; private members are not accessible
    }
}