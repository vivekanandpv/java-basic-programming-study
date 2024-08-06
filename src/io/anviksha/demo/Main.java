package io.anviksha.demo;

//  interfaces are used to enforce the APIs on classes
//  an interface cannot declare fields, even if it does, they are static final (constants)
//  traditionally interface members are abstract methods
//  interfaces saw significant upgrade in Java 8
//  here, we talk of only the traditional interfaces


interface A {
    void f();   //  abstract is implicit
}

interface B {
    void g();
}

//  an interface can extend multiple interfaces
interface C extends A, B {
    //  C already has f() from A and g() from B
    void h();
}

//  a class can implement multiple interfaces
class M implements A, B {

    @Override
    public void f() {

    }

    @Override
    public void g() {

    }
}

class N implements A {

    @Override
    public void f() {

    }
}


public class Main {
    public static void main(String[] args) {
        //  interface is a type, but it cannot be used as value
        //  new A() is not allowed
        A a = new M();
        B b = new M();

        A a2 = new N(); //  polymorphism; for A, there are multiple implementers: M and N

        //  a special note on Anonymous inner class (AIC)
        //  https://docs.oracle.com/javase/tutorial/java/javaOO/anonymousclasses.html
        //  new implementation class is created by the compiler in this use
        //  many Java developers do not encourage this approach
        //  https://stackoverflow.com/questions/2284396/java-anonymous-or-not-inner-classes-is-it-good-to-use-them
        A a3 = new A() {
            @Override
            public void f() {

            }
        };
    }
}