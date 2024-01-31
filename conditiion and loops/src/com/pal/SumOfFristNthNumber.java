package com.pal;

import java.util.Scanner;

public class SumOfFristNthNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("put your number N is: ");
        int N = in.nextInt();

        int sum = (N*N + N)/2;

        while (sum > 0) {
            if (N >= 0) {
                System.out.print("your "+ in.nextInt() +"th sum is: " +sum);
            }
            else {
                System.out.print("not possible");
             //   break;
            }
            sum++;
        }
    }
}
