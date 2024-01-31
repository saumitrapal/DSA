package com.pal;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your 3-digit number: ");
        int number = in.nextInt();

        while(number >= 0) {
            int rem1 = number % 100;
            if (rem1 != 0) {
             //   rem1++;
            }
            int rem2 = rem1 % 10;
            if (rem2 != 0) {
             //   rem2++;
            }
            float rem = rem1 + rem2 ;
            System.out.println(rem);
        }
    }
}
