package io.anviksha.demo;


public class Main {
    public static void main(String[] args) {
        //  logical operators are conjunction (&&), disjunction (||), and negation (!)
        //  These can be applied to only boolean operands
        //  Result is a boolean, of course

        //  In Java, there is no automatic boolean conversion

        //  && and || operators do use short-circuit evaluation
        //  https://en.wikipedia.org/wiki/Short-circuit_evaluation

        //  On the other hand, & and | do not use short-circuit evaluation

        boolean a = true && false;      //  =false
        boolean b = true || false;      //  =true
        boolean c = true && !false;     //  true; ! has higher precedence
        boolean d = !(true && false);   //  true; () changes the precedence
    }
}