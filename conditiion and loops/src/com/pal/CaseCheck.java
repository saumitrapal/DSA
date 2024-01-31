package com.pal;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Print your word: ");
        char ch = in.next().trim().charAt(0);

        System.out.print("your letter will be: ");
        if (ch >= 'a' && ch <='z') {
            System.out.println("Lowercase");
        }
        else {
            System.out.println("Uppercase");
        }
        System.out.print("your latter is: " +ch);
        }
    }

