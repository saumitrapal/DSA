package com.pal;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
 //       fun();
   //     multiple(2, 3, 34);
   //       demo();
    }

    static void demo (int ...v) {
        System.out.println(Arrays.toString(v));
    }
    static void demo (String ...v) {
        System.out.println(Arrays.toString(v));
    }
    static void demo (int a, int b, String ...v) {

    }

    static void multiple(int a, int b, int ...v) {

    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
