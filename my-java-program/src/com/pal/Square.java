package com.pal;

import java.util.Scanner;

public class Square {
    public static  void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        System.out.print("Input your number: ");   // input number , your can square of this
        float num = inputs.nextFloat();

        float square = (num * num);
        System.out.print("Square of your given number: " +square);


    }
}
