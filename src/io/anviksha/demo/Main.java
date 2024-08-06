package io.anviksha.demo;


public class Main {
    public static void main(String[] args) {
        Sample s = new Sample();

        //  check the following call dispatches through debugger
        s.printContent(12);
        s.printContent("Hello");
        s.printContent(2, "Joy!");
        s.foo("one", "two", "three");   //  varargs
        s.foo(new String[] {"one", "two", "three"});    //  also possible
    }
}