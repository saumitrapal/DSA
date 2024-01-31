package com.pal;

import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {123, 4124, 3525, 87, 46362, 64322357};
 //       Scanner in = new Scanner(System.in);
 //       System.out.println("Enter your num: ");
 //       int num = in.nextInt();
//        int target = 123;
//        System.out.println(minimum(arr, target,0, 5));
        System.out.println(findmin(arr));

    }
    // assume arr.length != 0
    // return the minimum value in the array
    static int findmin(int[] arr) {
            int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}




















 /*   static int minimum (int[] arr,int target, int start, int end) {
        if (start == end) {
            return -1;
        }
        for (int index = start; index <= end; index++) {
            int element = arr[index];
            if(element == target) {
                return index;
            }
        }
        return -1;
    }

  */

