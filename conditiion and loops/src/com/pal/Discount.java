package com.pal;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Put your number X: "); /* X% off*/
        float X = in.nextFloat();
        System.out.print("Put your number Y: ");  /*out of Y */
        float Y = in.nextFloat();

        float Z = (X / 100) * Y;


        while (Z >= 0) {
            if (X >= 0 || Y >= 0) {
                System.out.println("Your product discount is: " +Z);
            }
                float P = Y - Z;
                System.out.print("your product actual cost is: " +P);
                break;
        }
    }
}
