package io.anviksha.demo;


public class Main {
    //  Before the constructor of a class is executed, it's superclass constructor is called
    //  If the superclass has a parameterized constructor, then the subclass must pass the argument through super() call

    public static void main(String[] args) {
        Car c = new Car("KA01AS9087");  //  trace the construction process

        System.out.println(c.getRegistrationNumber());
    }
}