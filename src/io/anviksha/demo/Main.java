package io.anviksha.demo;


public class Main {
    public static void main(String[] args) {
        //  https://en.wikipedia.org/wiki/Bitwise_operation

        int b = 15; //  binary: 1111

        int c = b >> 1; //  right shift one bit: 1111 => 111

        int d = b << 1; //  left shift one bit: 1111 => 11110 = 30

        int e = 10 & 7;  //  1010 (and) 0111 => 0010 = 2

        int f = 10 | 5; //  1010 (or) 0101 => 1111 = 15

        int g = 15 ^ 10;    //  1111 (xor) 1010 => 0101 = 5

        //  recall that the int is a signed type, which follows 2's complement
        //  Intuitively, you think (complement) 1010 ->  0101 = 5
        //  but sign bit is also inverted!
        //  hence the full 32 bit value is: 11111111111111111111111111110101 = -11
        int h = ~10;    //  = -11

        //  also available are >>=, <<=, &=, |=, ^=
    }
}