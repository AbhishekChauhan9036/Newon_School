package com.company.loops17thNov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
//        int i = 1;
//        while (i <= 10) {
//            System.out.println(n + " x " + i + " = " + n * i);
//            i++;
//        }
//        do {
//            System.out.println(n + " x " + i + " = " + n * i);
//            i++;
//        } while (i <= 10);
//        for(i=1;i<=10;i++){
//            System.out.println(n + " x " + i + " = " + n * i);
//        }
//        patternX(n);
        System.out.println(mirror(9, '('));
    }

    public static void patternX(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("X ");
            }
            if (i != n - 1) System.out.println();
        }
    }


    public static int mirror(int r, char mirror) {
        double rd = r * 1.0;
        if (mirror == ')') {
            return (int) Math.floor(rd / 2.0);
        } else {
            return (int) Math.floor(-rd / 2.0);
        }
    }
}
