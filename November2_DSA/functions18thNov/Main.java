package com.company.functions18thNov;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
//        patternRightAngleNumbers(n);
//        System.out.println(factorial(n));
        fibonacciSeries(n);
    }

    public static void patternRightAngleNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static long factorial(int n) {
        if (n < 0) {
            System.out.println("Invalid input");
            return -1;
        }
        long result = 1;
//        while (n != 0) {
//            result = result * n;
//            n--;
//        }
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static int fibonacciSeries(int n) {
        if (n < 0) {
            System.out.println("Invalid input");
            return -1;
        } else if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        int a = 0;

        int b = 1;
        int c = 0;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i <= n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        return c;
    }
}
