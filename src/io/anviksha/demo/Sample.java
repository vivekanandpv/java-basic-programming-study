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

    //  varargs (variadic arguments) are added in Java 5
    //  only one varargs at the end per method is allowed
    //  varargs is an array inside (user will not pass it as an array,
    //  but the runtime will weave it as such)
    //  varargs can also be called with an explicit array at the call site

    //  Please refer:
    //  https://docs.oracle.com/javase/8/docs/technotes/guides/language/varargs.html
    //  https://stackoverflow.com/questions/766559/when-do-you-use-varargs-in-java
    public void foo(String... args) {
        System.out.println(args.length);    //  args is an array
    }

    //  varargs and array parameter are equivalents for overloading
    //  hence, the following overload is not allowed
    //  public void foo(String[] args) {
    //      System.out.println(args.length);    //  args is an array
    //  }

    //  overloads can have different return types
    //  method signatures are as following:
    //  printContent(int)
    //  printContent(String)
    //  printContent(int, String)

    //  duplicate implementation is not allowed
    //  overloads cannot differ only by parameter name or return type
}
