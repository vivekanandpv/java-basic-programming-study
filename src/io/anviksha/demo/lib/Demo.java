package io.anviksha.demo.lib;

//  within the package no explicit import is required
class Demo {

    //  type's no-modifier trumps over the public of this method
    //  doStuff has effectively become no-modifier (package internal)
    public void doStuff() {
        Sample s = new Sample("token123", "Bengaluru", "john@gmail.com");

        //  protected members are visible within the package (even to non-subclasses)
        System.out.println(s.email);
    }
}
