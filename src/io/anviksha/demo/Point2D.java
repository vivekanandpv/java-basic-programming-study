package io.anviksha.demo;

public class Point2D {
    private double x;
    private double y;

    //  if the multiple overloads are dispatchable, the most proximal type is chosen
    //  this rule equally applies to method overloading
    //  defining such overloads is not a good practice however
    //  generally, method and constructor overloading should be done only for the most pressing cases
    //  Please refer:
    //  https://www.yegor256.com/2023/08/01/method-overloading.html
    //  https://softwareengineering.stackexchange.com/questions/135313/when-is-method-overloading-appropriate
    //  https://stackoverflow.com/a/38539515/3969961
    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point2D(int x, int y) {
        this((double) x, (double) y);   //  now Point2D(double, double) is proximal
    }

    public Point2D() {
        //  0 is proximal to Point2D(int, int)
        //  0.0 is proximal to Point2D(double, double)
        this(0, 0);
    }


}
