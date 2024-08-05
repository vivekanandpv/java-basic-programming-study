package io.anviksha.demo;

class Sample {
    //  by default, the execution happens in object/instance context
    //  this is also called non-static context
    //  by using static qualifier, members can be declared in static context,
    //  which is the type context. static members cannot access instance context members,
    //  but instance context members can access static members nevertheless
    //  static members are accessed directly on the type (though in Java, static members
    //  of a class can also be accessed on an object reference, such practice is not recommended)

    private String city;
    private static String country;  //  static field

    static {
        //  static initializer block
        //  used to initialize static members
        //  cannot take parameters
        //  check the initialization order given below
        country = "India";
    }

    //  initialization order in Java
    //  static fields
    //  static initializer block
    //  instance fields
    //  constructor

    //  In Java, static final combination is used to create a constant
    //  https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Math.html#PI
    //  constants are written in all caps with _ to separate words
    public static final double PI = 3.1415926535;

    public void foo() {
        //  instance member
        //  static members are accessible from this context
        bar();
    }

    //  static methods are not inherited
    //  hence they cannot be overridden (static methods are final by design)

    //  constructors cannot be made static
    //  Java doesn't have the concept of static class as C#
    //  However, this could be achieved through Java 8 interfaces

    //  static methods can also be overloaded like normal methods
    //  same rules of overloading apply
    public static void bar() {
        System.out.println("static bar method");
        System.out.println(country);    //  ok; static members are accessible
        //  System.out.println(city);   //  error; cannot access non-static members
    }
}

public class Main {
    public static void main(String[] args) {
        //  static members are accessed on type
        Sample.bar();
        System.out.println(Sample.PI);

        Sample s = new Sample();
        s.bar();    //  allowed; but not recommended
    }
}

