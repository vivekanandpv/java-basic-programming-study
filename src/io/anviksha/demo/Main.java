package io.anviksha.demo;


public class Main {
    public static void main(String[] args) {
        int x = 5;
        int y = 4;

        //  if is a statement, else is a clause
        //  only boolean expression is allowed
        //  block, even for single statement is recommended
        if (x > y) {
            System.out.println("Hello!");
        } else {
            System.out.println("Good bye!");
        }

        //  else if is a nested if within else clause:

        //  else {
        //      if (cond) {
        //
        //      }
        //  }

        if (x > 5) {
            System.out.println("Option 1");
        } else if (x == 5) {
            System.out.println("Option 2");
        } else {
            System.out.println("Option 3");
        }

        //  switch for multi-option evaluation
        //  JDK 7 feature
        switch (x) {
            //  the fall-through will happen if break (or return) is not used
            //  beware of using return, as it returns from the current method
            //  exhaustive case coverage is not mandatory
            //  default case is optional

            case 5:
                System.out.println("x = 5");
                break;
            case 4:
                System.out.println("x = 4");
                break;
            case 3:
                System.out.println("x = 3");
                break;
            case 2:
                System.out.println("x = 2");
                break;
            case 1:
                System.out.println("x = 1");
                break;
            default:
                System.out.println("Invalid x!");
                break;
        }

        //  switch expression is a Java 17 feature
        //  for pattern matching: https://docs.oracle.com/en/java/javase/17/language/pattern-matching-switch-expressions-and-statements.html

        String output = switch (x) {
            //  this is an expression, not a statement
            //  cases should be exhaustive, or should have default
            //  all cases should return the same type
            case 5 -> "x = 5";
            case 4 -> "x = 4";
            case 3 -> "x = 3";
            default -> "Invalid x";
        };
    }
}