package io.anviksha.demo;


public class Main {
    public static void main(String[] args) {
        Car c = new Car();

        //  check how this gets dispatched through debugger
        c.drive();

        //  API is defined by the type, but implementation is provided by the value
        //  This is the runtime polymorphism, where the command (invocation of the method) is general
        //  but the execution is specific by the value
        //  Observe how these calls get dispatched

        Vehicle v1 = new Vehicle();
        v1.drive(); //  dispatched to Vehicle (Vehicle is the value)

        Vehicle v2 = new FourWheeler();
        v2.drive(); //  dispatched to FourWheeler

        Vehicle v3 = new Car();
        v3.drive(); //  dispatched to Car
    }
}