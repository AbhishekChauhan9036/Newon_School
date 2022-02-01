package com.company.priority_queue;

import java.util.Collections;
import java.util.PriorityQueue;

class MedianFinder {

    private PriorityQueue<Integer> left;
    private PriorityQueue<Integer> right;

    public MedianFinder() {
        this.left = new PriorityQueue<>(Collections.reverseOrder());
        this.right = new PriorityQueue<>();
    }

    public void addNum(int num) {
        left.add(num);
        if (left.size() > right.size()) right.add(left.remove());
        if (!left.isEmpty() && left.peek() > right.peek()) swap();
    }

    private void swap() {
        int lpeek = left.peek();
        int rpeek = right.peek();
        left.remove();
        right.remove();
        left.add(rpeek);
        right.add(lpeek);
    }

    public double findMedian() {
        if (left.size() != right.size()) return right.peek();
        return (double) (left.peek() + right.peek()) / 2;
    }
}