package com.company.dec16_17th;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] a = {1, 5, 4, 6, 2, 3};
//        int[] b = {2, 4, 6, 8};
//        int[] c = mergeTwoSortedArray(a, b);
//        System.out.println(Arrays.toString(c));
//        System.out.println(Arrays.toString(
//                mergeSort(a, 0, a.length - 1)));
//        System.out.println("Partition index is " +
//                partitionIndex(a, 3, 0, a.length - 1));
        quickSort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }

    public static int[] mergeTwoSortedArray(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int ai = 0;
        int bi = 0;
        int k = 0;
        while (ai < a.length && bi < b.length) {
            if (a[ai] < b[bi]) {
                c[k] = a[ai];
                ai++;
                k++;
            } else {
                c[k] = b[bi];
                bi++;
                k++;
            }
        }
        while (ai < a.length) {
            c[k] = a[ai];
            ai++;
            k++;
        }
        while (bi < b.length) {
            c[k] = b[bi];
            bi++;
            k++;
        }
        return c;
    }

    //https://leetcode.com/problems/sort-an-array/
    public static int[] mergeSort(int[] arr, int l, int r) {
        if (l == r) {
            int[] c = new int[1];
            c[0] = arr[l];
            return c;
        }
        int mid = (l + r) / 2;
        int[] a = mergeSort(arr, l, mid);
        int[] b = mergeSort(arr, mid + 1, r);
        return mergeTwoSortedArray(a, b);
    }

    public static int partitionIndex(int[] arr, int pivot, int l, int r) {
        int i = l;
        int j = l;
        while (i <= r) {
            if (arr[i] <= pivot) {
                swap(arr, i, j);
                i++;
                j++;
            } else {
                i++;
            }
        }
        return j - 1;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void quickSort(int[] arr, int l, int r) {
        if (l >= r) return;
        int pivot = arr[r];
        int pi = partitionIndex(arr, pivot, l, r);
        quickSort(arr, l, pi - 1);
        quickSort(arr, pi + 1, r);
    }
}
