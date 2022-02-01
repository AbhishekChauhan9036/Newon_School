package com.company.dec6th;

public class Main {
    public static void main(String[] args) {

    }

    public static int[] spiral(int[][] mat) {
        int[] res = new int[mat.length * mat[0].length];
        int i = 0;
        int left = 0;
        int right = mat[0].length - 1;
        int top = 0;
        int bottom = mat.length - 1;
        while (i < res.length) {
            for (int j = left; j <= right && i < res.length; j++) {
                res[i] = mat[top][j];
                i++;
            }
            top++;
            for (int j = top; j <= bottom && i < res.length; j++) {
                res[i] = mat[j][right];
                i++;
            }
            right--;
            for (int j = right; j >= left && i < res.length; j--) {
                res[i] = mat[bottom][j];
                i++;
            }
            bottom--;
            for (int j = bottom; j >= top && i < res.length; j--) {
                res[i] = mat[j][left];
                i++;
            }
            left++;
        }
        return res;
    }

}
