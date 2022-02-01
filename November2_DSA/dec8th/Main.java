package com.company.dec8th;

public class Main {
    public static void main(String[] args) {
//        me(5);
        printIncDec(5);
//        printIncDec(5);
//        int n=10;//1000
//        temp(n);
//        System.out.println(n);
//        int a = 1;
//        int b = 2;
//        temp(a, b);
//        System.out.println(a + "  after swap " + b);
    }

    //1002
    public static void temp(int a, int b) {
        System.out.println(a + " " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }

    //https://practice.geeksforgeeks.org/problems/exit-point-in-a-matrix0905/1#
    public static int[] exitPointOf2DArray(int[][] mat) {
        int i = 0;
        int j = 0;
        int dir = 0;
        while (i >= 0 && i < mat.length && j >= 0 && j < mat[0].length) {
            int currDir = (dir + mat[i][j]) % 4;
            if (currDir != dir) {
                dir = currDir;
                mat[i][j] = 0;
            }
            if (dir == 0) j++;
            else if (dir == 1) i++;
            else if (dir == 2) j--;
            else if (dir == 3) i--;
        }
        if (dir == 0) j--;
        else if (dir == 1) i--;
        else if (dir == 2) j++;
        else if (dir == 3) i++;
        return new int[]{i, j};
    }

    public static void me(int n) {
        if (n == 0) return;
        System.out.println("Krish");
        me(n - 1);
    }

    public static void printDecreasingNumber(int n) {
        if (n == 0) return;
        System.out.println(n);
        printDecreasingNumber(n - 1);
    }

    public static void printIncreasingNumber(int n) {
        if (n == 0) return;
        printIncreasingNumber(n - 1);
        System.out.println(n);
    }

    public static void printIncDec(int n) {
        if (n == 0) return;
        System.out.println(n + " pre order");
        printIncDec(n-1);
        System.out.println(n + " post order");
    }
}
