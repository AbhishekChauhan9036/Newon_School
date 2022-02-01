package com.company.dec14th;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int[] arr = {1, 231, 21, 3, 54, 6, 3, 22, 66};
//        System.out.println("Index is " + linearSearch(arr, 22));
//        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
//        System.out.println("Index is " + binarySearchRecursive(arr, 20, 0, arr.length - 1));

    }

    public static int linearSearch(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) return i;
        }
        return -1;
    }

    public static int binarySearchIterative(int[] arr, int x) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == x) return mid;
            else if (arr[mid] < x) l = mid + 1;
            else r = mid - 1;
        }
        return -1;
    }

    public static int binarySearchRecursive(int[] arr, int x,
                                            int l, int r) {
        if (l > r) return -1;
        int mid = (l + r) / 2;
        if (arr[mid] == x)
            return mid;
        else if (arr[mid] < x)
            return binarySearchRecursive(arr, x, mid + 1, r);
        else
            return binarySearchRecursive(arr, x, l, mid - 1);
    }


}
