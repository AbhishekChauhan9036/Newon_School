package com.company.array1D;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        int[] arr = {2, 3, 4, 5, 1};
//        int[] arr2 = {43, 12, 34};
        //        for (int i = 0; i < 5; i++) {
//            System.out.println(arr[i] + " is at " + i);
//        }

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the size of the array:");
//        int size = scanner.nextInt();
//        int[] userArray = new int[size];
//        for (int i = 0; i < size; i++) {
//            userArray[i] = scanner.nextInt();
//        }
//        printArray(userArray);
//        printMinMaxOfArray(userArray);
//        printSecondMinAndMax(userArray);
//        reverseArray(userArray, 0, userArray.length - 1);
//        int k = scanner.nextInt();
//        rotateKSteps2(userArray, k);
//        printArray(userArray);
//        int[] a = {1, 0, 0, 0};
//        int[] b = {1};
//        System.out.println(sumOfArray(a, b));
//        System.out.println(diffOfTwoArray(a, b));
        int[] arr = {1, 1, 1, 2, 2, 3, 3, 4, 4, 4, 4, 5};
        firstAndLastElementInAnArray(arr, 4);
    }

    public static void printMinMaxOfArray(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        System.out.println("Min is " + min);
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max is " + max);
    }

    public static void printSecondMinAndMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                smax = max;
                max = arr[i];
            } else if (arr[i] > smax) {
                smax = arr[i];
            }
        }
        System.out.println("Second max is " + smax);
        int min = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= min) {
                smin = min;
                min = arr[i];
            } else if (arr[i] < smin) {
                smin = arr[i];
            }
        }
        System.out.println("Second min is " + smin);
    }

    public static void rotateKSteps(int[] arr, int k) {
        k = k % arr.length;
        for (int i = 0; i < k; i++) {
            rightRotate(arr);
        }
    }

    public static void rotateKSteps2(int[] arr, int k) {
        k = k % arr.length;
        int nk = arr.length - k;
        reverseArray(arr, 0, nk - 1);
        reverseArray(arr, nk, arr.length - 1);
        reverseArray(arr, 0, arr.length - 1);
    }

    public static void rightRotate(int[] arr) {
        int temp = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
    }

    public static void reverseArray(int[] arr, int s, int e) {
        while (s <= e) {
            swap(arr, s, e);
            s++;
            e--;
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static String sumOfArray(int[] a, int[] b) {
        int as = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[as] != 0) {
                break;
            }
            as++;
        }

        int bs = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[bs] != 0) {
                break;
            }
            bs++;
        }
        int ai = a.length - 1;
        int bi = b.length - 1;
        String sum = "";
        int carry = 0;
        while (ai >= as && bi >= bs) {
            int currSum = a[ai] + b[bi] + carry;
            carry = currSum / 10;
            sum = (currSum % 10) + sum;
            ai--;
            bi--;
        }
        while (ai >= as) {
            int currSum = a[ai] + carry;
            carry = currSum / 10;
            sum = (currSum % 10) + sum;
            ai--;
        }
        while (bi >= bs) {
            int currSum = b[bi] + carry;
            carry = currSum / 10;
            sum = (currSum % 10) + sum;
            bi--;
        }
        if (carry != 0) sum = carry + sum;
        return sum;
    }

    public static String diffOfTwoArray(int[] a, int[] b) {
        int ai = a.length - 1;
        int bi = b.length - 1;
        int carry = 0;
        String diff = "";
        while (ai >= 0 && bi >= 0) {
            int currDiff = a[ai] - b[bi] + carry;
            carry = 0;
            if (currDiff < 0) {
                currDiff = currDiff + 10;
                carry = -1;
            }
            diff = currDiff + diff;
            ai--;
            bi--;
        }
        while (ai >= 0) {
            int currDiff = a[ai] + carry;
            carry = 0;
            if (currDiff < 0) {
                currDiff = currDiff + 10;
                carry = -1;
            }
            diff = currDiff + diff;
            ai--;
        }
        return diff;
    }

    public static void firstAndLastElementInAnArray(int[] a, int x) {
        boolean numberEncountered = false;
        int li = -1;
        int fi = -1;
        for (int i = 0; i < a.length; i++) {
            if (numberEncountered == false && a[i] == x) {
                numberEncountered = true;
                fi = li = i;
            } else if (numberEncountered == true && a[i] == x) {
                li++;
            } else if (numberEncountered == true && a[i] != x) {
                break;
            }
        }
        System.out.println("First index is " + fi);
        System.out.println("Last index is " + li);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " is at " + i);
        }
    }
}
