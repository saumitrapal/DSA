package com.pal;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("put your number: ");
        int n = in.nextInt();
        int p = 0;
        int i = 1;


        for (int count = 2; count <= n; count++) {
            int temp = i;
            i = i + p;
            p = temp;
        }
            System.out.print("your fibonacci number: " +i);

    }
}
