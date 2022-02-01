package com.company.priority_queue;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {

    }

    //https://leetcode.com/problems/kth-largest-element-in-an-array/
    public static int findKthLargest(int[] nums, int k) {
        java.util.PriorityQueue<Integer> pq = new java.util.PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < nums.length; i++) {
            pq.add(nums[i]);
        }
        int res = 0;
        while (k > 0) {
            res = pq.remove();
            k--;
        }
        return res;
    }

    public static void runPriorityQueue() {
        PriorityQueue priorityQueue = new PriorityQueue();
        priorityQueue.add(12);
        priorityQueue.add(25);
        priorityQueue.add(82);
        priorityQueue.add(2);
        priorityQueue.add(1);
        priorityQueue.add(0);

        while (!priorityQueue.isEmpty()) {
            System.out.println("priorityQueue.remove() = " + priorityQueue.remove());
        }
    }
}
