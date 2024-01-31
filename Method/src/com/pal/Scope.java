package com.pal;

import com.sun.security.jgss.GSSUtil;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        {
//            int a =78; // already initialised outside the block in the same method , hence you cannot
               a = 100;  // ressign the origin ref variable to some ohter value
            System.out.println(a);
              int c = 99;
            // value initialised in this block, will remain in block
        }
//        System.out.println(c);   // cannot use outside the block

        // scoping in for loops
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
        }
    }
    static void random(int marks) {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
