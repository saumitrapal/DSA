package com.pal;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        System.out.print("please enter temp in C: ");
        float tempC = inputs.nextFloat();

        float tempF = (tempC * 9/5) + 32;
        System.out.print("convert F: "  +tempF);
    }
}
