package com.pal;

import java.util.Arrays;

public class SearchIn2DArrays {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
  //      int target = 10;
 //       int[] ans = searchin2D(arr, target); // format of return value {row, col}
 //       System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }
    static int[] searchin2D(int[][] arr, int target) {
         for (int row = 0;  row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }

        }
        return new int[]{-1, -1};
    }

    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints :  arr) {
            for (int element : ints) {
                if(element > max) {
                    max = element;
                }

            }
        }
        return max;
    }

}
