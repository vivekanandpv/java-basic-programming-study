package io.anviksha.demo;


public class Main {
    public static void main(String[] args) {
        //  Please check the notes in Vehicle.java

        Vehicle v = new Vehicle();
        FourWheeler fw = new FourWheeler();
        Car c = new Car();

        //  A subclass value can be assigned to the superclass type
        //  This is called polymorphism of objects

        FourWheeler fw2 = c;    //  Car is a FourWheeler (by subclassing)
        Vehicle v2 = fw;        //  FourWheeler is a Vehicle
        Vehicle v3 = c;         //  Car is a FourWheeler which is a Vehicle, hence Car is a Vehicle (indirectly)

        Object obj = c;         //  Can you trace?
    }
}