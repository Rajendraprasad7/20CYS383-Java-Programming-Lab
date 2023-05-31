package com.ramaguru.amrita.cys.jpl.datastructures;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListExample {
    /**
     * The main method is the entry point of the program.
     * It demonstrates the usage of ArrayList to store and iterate over a collection of student roll numbers.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Make a collection
        ArrayList<Integer> u21cys = new ArrayList<Integer>();

        u21cys.add(26);
        u21cys.add(27);
        u21cys.add(28);
        u21cys.add(29);
        u21cys.add(30);

        u21cys.remove(4);

        // Get the iterator
        Iterator<Integer> it = u21cys.iterator();

        // Print the cars using the iterator
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
    }
}
