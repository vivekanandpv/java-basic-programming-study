//  PIC rule: package, imports, class
//  import order doesn't matter
package io.anviksha.demo;   //  packages must follow the underlying directory structure



//  Please refer to the demonstration visuals in resources directory

//  Java source file can contain only types (class, interface, enum, annotation, record)
//  Only one public type is allowed per file
//  If the file contains a public type, the name of the file must match the public type

//  Types in Java are conventionally written in PascalCase
//  Types represent themes (noun-centric) of the things that they model (e.g., BankAccount, CreditCard, FourWheeler, etc.)
public class Main {

    //  main method is the entry point of the program
    //  It should be declared public static void main(String[])
    //  String[] can also be written as String...
    //  args can be renamed
    public static void main(String[] args) {
        //  local variables are defined within a method
        //  that includes method parameters as well

        //  local variable declaration follows: type name = value; format
        //  value is optional, but uninitialized variable usage is not allowed in Java

        //  Use int by default for integers
        int x;  //  ok, but cannot be used unless initialized
        int y = 3;  //  declaration and initialization; preferred approach

        x = 9;  //  deferred initialization; generally not recommended, unless you have a specific use-case

        //  beware of precision vs scale with IEEE-754 floating-point numbers
        //  Usage of floats is generally discouraged
        //  floats need f or F suffix for literal values

        float a = 3.1415926535F;  //  precision of 8 digits

        //  Use double by default, d or D is the suffix rarely used
        double b = 3.14159265358979323846;  //  precision of 15 digits

        //  _ can be used as the digit separator
        //  _ is not allowed in the beginning or end or around the decimal point or before the suffix
        int c = 1_000_000_000;
        double d = 3.141_592_653_5;
        int e = 1_________00;   //  ok, but don't abuse

        //  longs have l or L suffix
        long m = 9988_776_655L;   //  L is preferred

        //  additional learning trail on primitives:
        //  https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
    }
}