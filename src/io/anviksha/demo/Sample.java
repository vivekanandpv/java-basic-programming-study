package io.anviksha.demo;

public class Sample {
    //  method signature is the name and parameter type list
    //  parameter names and return type is not part of the method signature

    //  method overloading is to provide multiple implementations of
    //  the same method for different parameter type list
    //  these implementations should have distinct parameter type lists

    //  the decision of call dispatch is made at the compile time
    //  hence it is called static polymorphism
    public void printContent(int x) {

    }

    public void printContent(String x) {

    }

    public void printContent(int x, String y) {

    }

    //  overloads can have different return types
    //  method signatures are as following:
    //  printContent(int)
    //  printContent(String)
    //  printContent(int, String)

    //  duplicate implementation is not allowed
    //  overloads cannot differ only by parameter name or return type
}
