package io.anviksha.demo;


public class Main {
    public static void main(String[] args) {
        //  check the constructor call dispatches through debugger
        Point2D p = new Point2D();
        Point2D p2 = new Point2D(2.3, -8);
    }
}