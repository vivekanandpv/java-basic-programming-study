package io.anviksha.demo;

public class Point2D {
    private double x;
    private double y;

    //  like methods, constructors can be overloaded too
    //  same rules apply
    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
        //  this() refers to the relevant overload of the constructor
        //  this technique is called constructor chaining
        //  used to avoid repeating the code

        this(0, 0); //  pointless in this context, but still explicit
    }


}
