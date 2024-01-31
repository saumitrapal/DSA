package com.pal;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("your number is: ");
        int num = in.nextInt();

        int ans = 0;

       while (num > 0) {
           int rem = num % 10;
           num /= 10;
           ans = ans * 10 + rem;
       }
        System.out.print("your reverse answer is: " +ans);


    }
}
