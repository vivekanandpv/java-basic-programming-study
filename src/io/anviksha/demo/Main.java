package io.anviksha.demo;


public class Main {
    public static void main(String[] args) {
        //  +, -, *, /, % work as in mathematics and have the same precedence of the operators
        //  know the difference between expressions and statements
        //  https://docs.oracle.com/javase/tutorial/java/nutsandbolts/expressions.html

        int x = 9/5;    //  integer division!

        double y = 9/5.0;   //  real division (at least one operand is a double)

        double m = 1.4454 % 0.323;  //  works

        //  beware of result offshooting the target type
        byte b = 126;
        //  byte c = b + 2; //  error, 128 is out of range for byte

        //  () can be used to change the precedence
        int v = (2 + 3) * 8;    //  40
        int w = 2 + 3 * 8;  //  26; recall BODMAS rule!
    }
}