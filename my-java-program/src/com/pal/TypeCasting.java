package com.pal;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
 //     Scanner input = new Scanner(System.in);
  //    float num = input.nextFloat();
 //       System.out.println(num);
        //type casting
//        int num = (int)(75.45f);
//        System.out.println(num);

        // automatic type promotion in expression
//        int a = 257;
//        byte b = (byte)(a); //257 % 256

 //       System.out.println(b);


 //       byte a = 40;
 //       byte b = 50;
 //       byte c = 100;
 //       int d = (a * b) / c;

 //       System.out.println(d);

//        int number = 'A';
 //       System.out.println("number");

            byte b = 42;
            char c ='a';
            short s = 1024;
            int i = 500000;
            float f = 5.67f;
            double d = 0.1234;
            double result = (f * b) + (i / c) - (d * s);
//              float + int - double = double
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
            System.out.println(result);


    }
}
