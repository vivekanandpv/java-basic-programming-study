package io.anviksha.demo;

//  themes that lead to class design are often on a spectrum of generalization and specialization
//  this way, the generalized theme can be reused to create more specialized theme
//  Vehicle > FourWheeler > Car
//  In this design, Vehicle is the most general theme
//  In Java, all classes implicitly inherit/extend from Object class
//  this extension need to be explicitly written
//  When you extend a general theme, that general theme is called the superclass, and yours is called subclass
//  This process of extension is called inheritance or subclassing or extension
//  This is done in by providing extends clause in the class definition
//  public class Vehicle extends Object would have been explicit
//  Please note that Java doesn't support multiple inheritance like C++ or Python
//  This way, all classes in Java trace their origin to Object
//  https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html
public class Vehicle {
}
