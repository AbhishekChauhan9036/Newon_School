package com.company.priority_queue;

import java.util.ArrayList;

public class PriorityQueue {

    ArrayList<Integer> list;

    public PriorityQueue() {
        this.list = new ArrayList<>();
    }

    public void add(int x) {
        list.add(x);
        upHeapify(list.size() - 1);
    }

    public int remove() {
        int res = list.get(0);
        swap(0, list.size() - 1);
        list.remove(list.size() - 1);
        downHeapify(0);
        return res;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Underflow");
            return -1;
        }
        return list.get(0);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    private void upHeapify(int i) {
        if (i == 0) return;
        int pi = (i - 1) / 2;
        if (list.get(pi) > list.get(i)) {
            swap(i, pi);
            upHeapify(pi);
        }
    }

    private void swap(int i, int j) {
        int ith = list.get(i);
        int jth = list.get(j);
        list.set(i, jth);
        list.set(j, ith);
    }

    private void downHeapify(int i) {
        int minIndex = i;
        int li = 2 * i + 1;
        if (li < list.size() && list.get(li) < list.get(minIndex)) {
            minIndex = li;
        }
        int ri = 2 * i + 2;
        if (ri < list.size() && list.get(ri) < list.get(minIndex)) {
            minIndex = ri;
        }
        if (i != minIndex) {
            swap(i, minIndex);
            downHeapify(minIndex);
        }
    }
}
