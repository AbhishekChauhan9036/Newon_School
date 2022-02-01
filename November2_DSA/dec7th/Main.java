package com.company.dec7th;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int row = s.nextInt();
//        int col = s.nextInt();
        int[][] matrix = new int[row][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                matrix[i][j] = s.nextInt();
            }
        }
//        int res = maxSumCol(matrix);
//        System.out.println(res);
        diagonalSum(matrix);
    }

    public static int maxSumCol(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat[0].length; i++) {
            int currSum = 0;
            for (int j = 0; j < mat.length; j++) {
                currSum += mat[j][i];
            }
            if (currSum > sum) {
                sum = currSum;
            }
        }
        return sum;
    }

    public static void diagonalSum(int[][] mat) {
        int i = 0;
        int j = 0;
        int pd = 0;
        int sd = 0;
        while (i < mat.length && j < mat[0].length) {
            pd += mat[i][j];
            i++;
            j++;
        }
        i = 0;
        j = mat[0].length - 1;
        while (i < mat.length && j >= 0) {
            sd += mat[i][j];
            i++;
            j--;
        }
        System.out.print(pd + " " + sd);
    }

//https://leetcode.com/problems/matrix-diagonal-sum/
    public static void matrixDiagonalSum(int[][] mat) {
        int i = 0;
        int j = 0;
        int pd = 0;
        int sd = 0;
        while (i < mat.length && j < mat[0].length) {
            pd += mat[i][j];
            i++;
            j++;
        }
        i = 0;
        j = mat[0].length - 1;
        while (i < mat.length && j >= 0) {
            sd += mat[i][j];
            i++;
            j--;
        }
        int sum = pd + sd;
        if (mat.length % 2 == 1) {
            sum -= mat[mat.length / 2][mat.length / 2];
        }
        System.out.print(sum);
    }

}
