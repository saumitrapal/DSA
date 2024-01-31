package com.pal;

import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {
 //       fun(66);
 //       fun("spal");
  //     int ans = sum(4, 5, 5);
   //     System.out.println(ans);

        array ();

    }
        static int sum ( int a, int b){
           return a + b;
        }
    static int sum ( int a, int b, int c) {
        return a + b + c;
    }
        static void fun (String name){
            System.out.println("3rd one");
            System.out.println(name);
        }

        static int array (int...v) {
            System.out.println(Arrays.toString(v));
        }


    }

