package com.pal;

import java.util.Scanner;

public class CgpaCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);   // user input;
        System.out.print("Input your sub1 number in percentage: ");
        float sub1 = in.nextFloat();
        System.out.print("Input your sub2 number in percentage: ");
        float sub2 = in.nextFloat();
        System.out.print("Input your sub3 number in percentage: ");
        float sub3 = in.nextFloat();

        float total = (sub1 + sub2 + sub3)/3;   // calculation of cgpa;
        float cgpa = total/10;                  // cgpa is calculated out 10;

        System.out.println("your CGPA is: " +cgpa);

        // optional
        /*
        if (sub1 <= 100 || sub2 <= 100 || sub3 <= 100) {
            System.out.println("your CGPA is: " +cgpa);
        }
        else {
            System.out.println("your cgpa is not calculated");
        }
        */






       /*
        int math = 98;
        int phy = 99;
        int bee = 96;

        int total = (math + phy + bee)/3;
        int cgpa = total / 10;


        System.out.println(cgpa);

        */

    }
}
