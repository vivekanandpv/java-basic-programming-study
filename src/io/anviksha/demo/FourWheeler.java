package io.anviksha.demo;

public class FourWheeler extends Vehicle {
    //  only methods can be overridden
    //  subclasses override superclass methods to provide more specific implementations
    //  Java has virtual by default approach to overriding
    //  subclass cannot change the declaration of the method (name, parameter list, return type)
    //  accessibility can be relaxed, but cannot be restricted

    //  @Override is an annotation. As such, it is optional, but a best practice nonetheless
    @Override
    public void drive() {
        //  logic...
        System.out.println("FourWheeler overrides drive method");

        //  in case superclass' implementation needs to be called
        //  this happens in some design patterns' implementations
        super.drive();
    }
}
