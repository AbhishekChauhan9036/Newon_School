package com.company.dec2nd;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int[] arr = {1, 3, 5, 0, 2, 4};
//        print1DArray(inverseArray(arr));
//        Scanner s = new Scanner(System.in);
//        int row = s.nextInt();
//        int col = s.nextInt();
//        int[][] arr2d = new int[row][col];
//        System.out.println(arr2d.length);
//        System.out.println(arr2d[0].length);
//        for (int i = 0; i < arr2d.length; i++) {
//            for (int j = 0; j < arr2d[0].length; j++) {
//                arr2d[i][j] = s.nextInt();
//            }
//        }
        int[][] a = {{1, 2, 3},
                    {3, 1, 2},
                    {2, 2, 1}};

        int[][] b = {{1, 1},
                    {4, 3},
                    {1, 2}};
        int[][] arr2d = matrixMultiplication(a, b);
        print2DArray(arr2d);
    }

    public static int[] inverseArray(int[] arr) {
        int[] narr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            narr[arr[i]] = i;
        }
        return narr;
    }

    public static void print1DArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void print2DArray(int[][] arr2D) {
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[0].length; j++) {
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] matrixMultiplication(int[][] a, int[][] b) {
        if (a[0].length != b.length) {
            System.out.println("Invalid input");
            return null;
        }
        int[][] ans = new int[a.length][b[0].length];
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                int sum = 0;
                for (int k = 0; k < a[0].length; k++) {
                    sum += a[i][k] * b[k][j];
                }
                ans[i][j] = sum;
            }
        }
        return ans;
    }
}
