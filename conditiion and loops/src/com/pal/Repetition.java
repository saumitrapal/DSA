package com.pal;

import java.util.Scanner;

public class Repetition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print ("put your number: ");
        long n = in.nextLong();
        //int n = 34236333;

        int count = 0;
        while (n > 0) {
            long rem = n % 10;
            if (rem == 3 ) {
                count++;
            }
            n = n / 10;
        }

        System.out.print("your repetition number is: " +count);
    }
}
