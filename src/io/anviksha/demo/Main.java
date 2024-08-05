package io.anviksha.demo;


public class Main {
    public static void main(String[] args) {
        //  relational operators are used for comparison
        //  they produce boolean results

        //  == and != for reference types checks for object reference equality,
        //  not the content equality
        //  In case of String, there is interning to be careful of
        //  In such cases .equals(...) is to be used

        boolean a = 7 > 6;      //  true
        boolean b = 7 == 8;     //  false
        boolean c = 7 < 9;      //  true
        boolean d = 7 >= 10;    //  false
        boolean e = 7 <= 90;    //  true
        boolean f = 7 != 9;     //  true
    }
}