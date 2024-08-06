package io.anviksha.demo;

//  when components are separate, yet are combined to make a compositional entity
//  the association relation is born.

//  one class uses the other class/es as fields

//  Engine and Transmission are component classes
class Engine {
    public void start() {
        //  logic
    }

    public void stop() {
        //  logic
    }
}

class Transmission {

}

//  Car is composed on Engine and Transmission
class Car {
    //  this association creates dependencies

    //  if the Engine or Transmission can be used independently of Car
    //  then the relation is called aggregation
    //  if not, the relation is called composition
    //  Aggregation is relatively looser than composition
    private Engine engine;  //  Car has an Engine
    private Transmission transmission;  //  Car has a transmission

    //  dependencies are inverted, preferably in constructor
    //  this is to relinquish the control over dependency's life cycle
    //  also called Inversion of Control (IoC). nowadays known as Dependency Inversion (DI)
    public Car(Engine engine, Transmission transmission) {
        this.engine = engine;
        this.transmission = transmission;
    }

    private void start() {
        //  this is called delegation
        engine.start();
    }

    private void stop() {
        engine.stop();
    }
}

public class Main {
    public static void main(String[] args) {

    }
}

