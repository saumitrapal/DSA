package com.pal;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class ArraysListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Syntax :
        ArrayList<Integer> list = new ArrayList<>(5);
/*
        list.add(67);
        list.add(234);
        list.add(654);
        list.add(43);
        list.add(654);
        list.add(8765);

        list.set(0, 99);

        list.remove(2);

        System.out.println(list);
        */


        for (int i = 0; i < 5; i++) {
             list.add(in.nextInt());
         }
        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));   // pass index here, list[index]
        }
 //         System.out.println(list);
    }
}
