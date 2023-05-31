package com.ramaguru.amrita.cys.jpl.datastructures;

public class ArrayExample {
    /**
     * The main method is the entry point of the program.
     * It creates an array of roll numbers and prints each roll number using a for loop.
     *
     * @param args command line arguments
     */
    public static void main(String args[]) {
        Integer rollNumber[] = new Integer[3];

        rollNumber[0] = 21;
        rollNumber[1] = 22;
        rollNumber[2] = 23;

        for (int i = 0; i < rollNumber.length; i++) {
            System.out.println(rollNumber[i]);
        }
    }
}
