package io.anviksha.demo;


public class Main {
    public static void main(String[] args) {
        //  use for loop for definite iteration (when you know how many iterations beforehand)

        //  i, j, k are usual loop counters
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello for loop!");
        }

        //  while and do-while loops for indefinite iterations (loops of conditional exit)
        int j = 0;
        while (j < 5) {
            System.out.println("Hello while loop!");
            ++j;
        }

        //  do-while runs at least once, even if the condition is false
        //  https://softwareengineering.stackexchange.com/questions/268145/are-there-real-life-usage-and-applications-for-do-while-loops
        int k = 0;
        do {
            System.out.println("Hello do-while loop!");
        } while(k > 0);
    }
}