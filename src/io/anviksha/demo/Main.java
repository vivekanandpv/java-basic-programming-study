package io.anviksha.demo;

//  abstract classes are used as type, but they cannot be used as values
//  these are used to provide infrastructure to the subclasses
//  like regular classes, they can have fields and constructors
//  abstract class must be subclassed, hence abstract final isn't allowed
//  abstract classes may or may not have any abstract members
//  abstract methods can only be declared in an abstract class
//  only methods can be abstract
//  such methods cannot have implementation (body)
//  when a class extends an abstract class, it must implement all the abstract methods
//  of the superclass, unless the subclass is also an abstract class
//  a class cannot extend multiple abstract classes
//  abstract class can also implement interfaces, in which they may or may not provide the implementation
//  refer to Jva Collection API for the use of abstract classes and interfaces
//  In JDK, the Abstract prefix is used for abstract classes

abstract class Vehicle {
    //  fields cannot be abstract
    private final String registrationNumber;

    //  constructors cannot be abstract
    public Vehicle(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    //  abstract methods cannot have any implementation (body)
    public abstract void drive();

    //  abstract classes can have non-abstract methods
    public void honk() { }

    //  abstract classes can have final methods
    public final void start() { }
}

class Car extends Vehicle {

    public Car(String registrationNumber) {
        super(registrationNumber);
    }

    @Override
    public void drive() {

    }
}


public class Main {
    public static void main(String[] args) {
        //  Vehicle can only be used as type
        //  value has to be any concrete subclass of Vehicle, such as Car
        Vehicle v = new Car("KA01AS9876");  //  polymorphism
        v.drive();
    }
}