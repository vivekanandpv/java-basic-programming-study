package io.anviksha.demo;

public class Point2D {
    private double x;
    private double y;

    //  mindless overloading can produce call resolution ambiguities at the call sites
    //  such things do occur when your overloads start to differ by compatible and automatically convertible types
    public Point2D(double x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point2D(int x, double y) {
        this.x = x;
        this.y = y;
    }

    public void distanceTo(double x, int y) {

    }

    public void distanceTo(int x, double y) {

    }
}
