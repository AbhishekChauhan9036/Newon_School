package com.company.dec13th;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        printStairPath(4, "");
        Scanner s = new Scanner(System.in);
        int row = s.nextInt();
        int col = s.nextInt();
        printMazePath(0, 0, row - 1, col - 1, "");
    }

    public static void printStairPath(int n, String res) {
        if (n == 0) {
            System.out.println(res);
            return;
        }
        if (n - 1 >= 0) {
            printStairPath(n - 1, res + "1");
        }
        if (n - 2 >= 0) {
            printStairPath(n - 2, res + "2");
        }
        if (n - 3 >= 0) {
            printStairPath(n - 3, res + "3");
        }
    }

    public static void printMazePath(int sr, int sc, int dr, int dc, String res) {
        if (sr == dr && sc == dc) {
            System.out.println(res);
            return;
        }
        if (sc + 1 <= dc) {
            printMazePath(sr, sc + 1, dr, dc, res + "H");
        }
        if (sr + 1 <= dr) {
            printMazePath(sr + 1, sc, dr, dc, res + "V");
        }
    }
}
