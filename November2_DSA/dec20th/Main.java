package com.company.dec20th;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();
//        a.add(1);
//        a.add(2);
//        a.add(3);
//        a.add(4);
//        a.add(5);
//        System.out.println("data at index 1 is " + a.get(1));
//        a.remove(1);
        for (int i = 0; i < 10; i++) {
            if (i % 3 == 0) a.add(2);
            else if (i % 4 == 0) a.add(1);
            else a.add(0);
        }
        System.out.println(a);
        sort012(a);
        System.out.println(a);
    }

    //    https://practice.geeksforgeeks.org/problems/binary-array-sorting-1587115620/1
    public static void sort01(ArrayList<Integer> list) {
        int i = 0;
        int j = 0;
        while (i < list.size()) {
            if (list.get(i) == 1) i++;
            else {
                int temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
                i++;
                j++;
            }
        }
    }

    public static void sort012(ArrayList<Integer> list) {
        int i = 0;
        int j = 0;
        int k = list.size() - 1;
        while (i <= k) {
            if (list.get(i) == 0) {
                int temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
                i++;
                j++;
            } else if (list.get(i) == 1) {
                i++;
            } else {
                int temp = list.get(i);
                list.set(i, list.get(k));
                list.set(k, temp);
                k--;
            }
        }
    }
}
