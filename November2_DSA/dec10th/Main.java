package com.company.dec10th;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        String input = s.next();
//        isPalindrome2(input);
//        System.out.println((int) 'b');
//        toggleCase("neWtoN SchOol^kI");
        printSubSeqRec("abc", "");
    }

    public static void isPalindromeRev(String s) {
        String temp = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            temp += s.charAt(i);
        }
        if (temp.equals(s)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }

    public static void isPalindrome2(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                System.out.println("0");
                return;
            }
            i++;
            j--;
        }
        System.out.println("1");
    }

    public static void toggleCase(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                res += (char) (s.charAt(i) + 'a' - 'A');
            } else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                res += (char) (s.charAt(i) + 'A' - 'a');
            } else {
                res += s.charAt(i);
            }
        }
        System.out.println(res);
    }

    public static void printSubSeqRec(String s, String res) {
        if (s.length() == 0) {
            System.out.println(res);
            return;
        }
        char curr = s.charAt(0);
        //Accepting the curr character
        printSubSeqRec(s.substring(1), res + curr);
        //Rejecting the curr character.
        printSubSeqRec(s.substring(1), res);
    }
}
