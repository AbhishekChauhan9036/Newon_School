package com.company.dec9th;

public class Main {
    public static void main(String[] args) {
//        System.out.println(factorial(6));
//        System.out.println(powOptimize(5, 12));
        toh(2, 'A', 'C', 'B');
    }

    public static int factorial(int n) {
        if (n == 1) return 1;
        int remaining = factorial(n - 1);
        return remaining * n;
    }

    public static int pow(int x, int n) {
        if (n == 0) return 1;
        if (n == 1) return x;
        int remaining = pow(x, n - 1);
        return x * remaining;
    }

    public static int powOptimize(int x, int n) {
        if (n == 0) return 1;
        if (n == 1) return x;
        int divN = n / 2;
        int remaining = powOptimize(x, divN);
        if (n % 2 == 1) {
            return remaining * remaining * x;
        } else {
            return remaining * remaining;
        }
    }

    public static void toh(int n, char s, char d, char h) {
        if (n == 0) return;
        toh(n - 1, s, h, d);
        System.out.println(n + ":" + s + "->" + d);
        toh(n - 1, h, d, s);
    }
}
