package io.anviksha.demo;

public class Main {
    public static void main(String[] args) {
        //  arrays are fixed size, ordered, indexable, contiguously allocated collections of similar elements
        //  array type can be primitive or user-defined
        //  refer to: https://stackoverflow.com/a/17559021/3969961

        //  idiomatic approach
        int[] ar1;

        //  C-style declaration; not recommended
        int ar2[];

        ar1 = new int[5];   //  array of 5 elements; all initialized to 0 (or equivalent)

        ar2 = new int[] {4, 3, 5, 0};   //  regular initializer with elements; size is not allowed in this case

        //  direct initializer approach; doesn't work to produce the standalone value of arrays,
        //  such as passing the array arguments in place in a method call
        int[] ar3 = {4, 3, 2, 1};

        //  arrays are indexable; index starts with 0
        //  array element access outside the bound throws a runtime exception
        System.out.println(ar1[0]);

        //  arrays elements can be mutated by indexes
        //  array element access outside the bound throws a runtime exception
        ar1[0] = 23;



        //  arrays have (readonly) length property
        System.out.println(ar1.length);

        //  arrays are objects behind the scene
        //  https://docs.oracle.com/javase/specs/jls/se8/html/jls-10.html
        ar2 = null;

        //  arrays can be used with for-each loop
        for (int i : ar3) {
            System.out.println(i);
        }
    }
}