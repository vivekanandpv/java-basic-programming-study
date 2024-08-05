package io.anviksha.demo;


public class Main {
    public static void main(String[] args) {
        int i = 0;

        //  debug step by step to understand

        //  post-increment/decrement operators return and operate later
        int j = i++;    //  j = 0, i = 1
        int k = i--;    //  k = 1, i = 0

        //  pre-increment/decrement operators operate and return later
        int p = 0;
        int q = ++p;    //  q = 1, p = 1
        int r = --p;    //  r = 0, p = 0
    }
}