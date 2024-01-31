package com.pal;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // swap numbers code
//        int temp = a;
//        a = b;
//        b = temp;
        swap(a, b);
        System.out.println(a + " " + b);

        String name = "spal";
        changename(name);
        System.out.println(name);
    }

    static void changename(String name) {
        name ="rahul";
    }



    static void swap (int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        
    }


}
