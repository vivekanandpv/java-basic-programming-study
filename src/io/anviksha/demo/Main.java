package io.anviksha.demo;

class Sample {
    private int year = 2024;

    //  nested classes are used in some advanced situations such as:
    //  1. logically grouping the classes that are only used in one place
    //  2. when a class needs to know the private implementation of the other
    //  3. nesting small classes within top-level classes places the code
    //  closer to where it is used

    //  serialization of inner classes is strongly discouraged
    //  as there may be difference in the bytecode emitted by different compiler implementations

    //  this nested class is a member of the Sample class
    //  this is called a static nested class
    //  static nested classes cannot refer to instance members defined in the outer class
    //  In effect, the static nested class is behaviourally an independent class
    //  that has been nested in another top-level class for packaging convenience
    //  even though the class is static, the members can be instance members
    //  static refers to the availability of the class
    public static class Demo {
        private final String message;

        public Demo(String message) {
            this.message = message;
        }

        public int foo() {
            return 123;
        }

        public void bar() {
            System.out.println(message);
        }
    }

    //  this too is a member of the Sample class called inner class
    //  an inner class is always associated with an instance of the outer class
    //  to create an instance of the Playground,
    //  first the instance of Sample needs to be created
    public class Playground {
        //  fields of the inner class do shadow the fields of the outer class
        private final int score;

        public Playground(int score) {
            this.score = score;
        }

        public void foo() {
            System.out.println(year);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        //  static nested class instantiation
        Sample.Demo d = new Sample.Demo("Hello, world!");
        int v = d.foo();
        d.bar();

        //  inner class instantiation
        Sample s = new Sample();
        Sample.Playground p = s.new Playground(122);
        p.foo();
    }
}