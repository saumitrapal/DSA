package com.pal;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

        System.out.print("a: ");
      int a = input.nextInt();
        System.out.print("b: ");
      int b = input.nextInt();
        System.out.print("c: ");
      int c = input.nextInt();


      // Q: find the largest of the 3 numbers
       int max = a;
       if (b > max) {
           max = b;
       }
       if (c > max) {
           max = c;
       }
        System.out.print("the max value is " +max);
    }
}
