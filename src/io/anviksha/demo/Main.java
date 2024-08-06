package io.anviksha.demo;

//  Main is in different package, hence the explicit import is required
//  packages have physical directory hierarchy, but for imports they are distinct
//  types declared in parent package have to be imported in child package and vice-versa
import io.anviksha.demo.lib.Sample;

//  types within java.lang need no explicit import
//  the order of import statements does not matter
//  wildcard imports from packages is allowed (though, no encouraged by some)
//  static members can be imported from a type

//  Demo has no modifier (package private)
//  hence, even with explicit import it is not accessible outside the package
//  import io.anviksha.demo.lib.Demo;

//  refer to java-access-modifiers.png in resources directory

public class Main {
    public static void main(String[] args) {
        Sample s = new Sample("token2", "Chennai", "mark@gmail.com");

        //  error; protected members are not accessible outside the package to non-subclasses
        //  System.out.println(s.email);

        //  error; Demo is no-modifier (package private)
        //  Demo d  = new Demo();
    }
}

class Scaffold extends Sample {
    public Scaffold(String token, String city, String email) {
        super(token, city, email);
    }

    //  protected member is visible to subclasses across the packages
    public Scaffold(String token) {
        super(token);
    }
}

