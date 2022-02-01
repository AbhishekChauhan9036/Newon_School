package com.company.dec21st;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 1, 2, 3,3,3,3,3};
//        System.out.println(getMazePath(0, 0, 2, 2));
        System.out.println(highestFrequency(arr));
    }

    public static ArrayList<String> getMazePath(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList<String> res = new ArrayList<>();
            res.add("");
            return res;
        }
        ArrayList<String> res = new ArrayList<>();
        if (sc + 1 <= dc) {
            ArrayList<String> currList = getMazePath(sr, sc + 1, dr, dc);
            for (int i = 0; i < currList.size(); i++) {
                res.add("R" + currList.get(i));
            }
        }
        if (sr + 1 <= dr) {
            ArrayList<String> currList = getMazePath(sr + 1, sc, dr, dc);
            for (int i = 0; i < currList.size(); i++) {
                res.add("D" + currList.get(i));
            }
        }
        return res;
    }

    public static int highestFrequency(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsKey(arr[i])) {
                hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
            } else {
                hashMap.put(arr[i], 1);
            }
        }
        int maxKey = arr[0];
        for (Integer key : hashMap.keySet()) {
            int maxKeyValue = hashMap.get(maxKey);
            int tempValue = hashMap.get(key);
            if (maxKeyValue < tempValue) {
                maxKey = key;
            }
        }
        return maxKey;
    }
}
