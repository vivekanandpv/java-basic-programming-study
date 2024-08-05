package io.anviksha.demo;


public class Main {
    public static void main(String[] args) {
        //  If the target data type is equal or wider than the source data type,
        //  then the conversion happens mostly automatically
        //  Also, for the automatic conversion/explicit cast to work, the types should be compatible

        //  byte a = (byte) true;   //  doesn't work as the types are incompatible
        long x = 9_000_000_000L;
        float y = x;    //  target type is narrower, but the conversion is allowed: see https://en.wikipedia.org/wiki/IEEE_754-1985#Range_and_precision

        int n = 100;
        double d = n;   //  wider target type

        //  char e = 'E';
        //  short s = e;    //  signed vs unsigned!

        //  If the target type is narrower, an explicit cast is required
        //  casting is not a silver-bullet, both the types need to be compatible

        double p = 1.998;
        int q = (int) p;    //  truncation!
    }
}