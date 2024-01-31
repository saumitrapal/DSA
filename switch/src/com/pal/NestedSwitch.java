package com.pal;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int empID = in.nextInt();
        String department = in.next();

        switch (empID) {
            case 1 :
                System.out.println("kunal");
                break;

            case 2 :
                System.out.println("rahul");
                break;

            case 3 :
                System.out.println("Emp number 3");
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                    break;

                    case "Management":
                        System.out.println("Management Department");
                        break;

                    default :
                        System.out.println("No department enter");
                }
                break;
            default:
                System.out.println("Enter correct EmpID");

        }    }
}
