package com.pal;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        System.out.print("Put your year: ");
        int year = in.nextInt();

        while (year > 0) {
            int num = year % 4;
            if (num == 0) {
                System.out.print(" Your year is Leapyear: " +in.nextInt());
            } else if (num != 0)  {
                System.out.print("Your year is not Learyear: " +in.nextInt());
               break;
            }
                year++;
        }



















      /*  for (int year = 2024;  year >= 0; year++) {
            int num = year % 4;
            if (num == 0) {
                System.out.println("Leapyear");
            } else if (year >= 3000) {
                break;
            }
            else {
                System.out.println("your year is not leapyear");
            }
            System.out.println(year);
        } */


    }
}
