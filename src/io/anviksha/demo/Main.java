package io.anviksha.demo;


public class Main {
    public static void main(String[] args) {
        //  continue to skip iteration
        //  break to exit the loop

        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                continue;   //  skip iteration
            }
            System.out.printf("Hello for loop! %d\n", i);
        }

        int j = 0;

        while (j < 10) {
            if (j == 6) {
                break;  //  exit the loop
            }
            System.out.printf("Hello while loop! %d\n", j);

            ++j;
        }
    }
}