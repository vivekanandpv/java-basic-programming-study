package io.anviksha.demo;

public class Main {
    public static void main(String[] args) {
        //  Strings are immutable. You cannot change a string object in place.
        //  All these methods return new strings, which can be used to "replace" the old string
        //  The old string will then get garbage collected

        //  case conversion
        String s1 = "Hello".toUpperCase();
        String s2 = "Hello".toLowerCase();

        //  indexing
        char c = "Hello".charAt(2); //  get character at index
        int i = "Hello".indexOf('l');   //  first index from start
        int j = "Hello".lastIndexOf('l');   //  last index from start
        int k = "Hello".indexOf('x');   //  -1 if not found

        //  substring
        String ss1 = "Hello".substring(2);  //  [2, end]
        String ss2 = "Hello".substring(1, 3);   //  [1, 3)

        //  splitting
        String[] parts = "green;blue;red".split(";");   //  split by regex or separator

        //  contains
        boolean contains = "Hello".contains("ll");

        //  regex match
        boolean matches = "ABCD1234".matches("^[A-Z]{4}[0-9]{4}$");

        //  stripping
        String s3 = "     Hello World!   ".strip();
        String s4 = "     Hello World!   ".stripLeading();
        String s5 = "     Hello World!   ".stripTrailing();

        //  though += is overloaded for strings, it is not efficient given strings are immutable
        //  hence, StringBuilder and StringBuffer are useful
        //  StringBuffer has the same API as StringBuilder
        //  StringBuffer has synchronized methods, suited for multithreaded programming
        //  StringBuilder has non synchronized methods

        StringBuilder sbuilder = new StringBuilder();
        sbuilder.append("Hi");
        sbuilder.append(" ");
        sbuilder.append("there!");
        sbuilder.append(" ");

        String finalString = sbuilder.toString();
    }
}