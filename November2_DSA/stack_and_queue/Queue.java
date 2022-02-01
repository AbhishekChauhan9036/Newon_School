package com.company.stack_and_queue;

import java.util.ArrayList;

public class Queue<T> {

    private ArrayList<T> data;

    public Queue() {
        this.data = new ArrayList<>();
    }

    public void add(T val) {
        data.add(val);
    }

    public T remove() {
        if (data.isEmpty()) {
            System.out.println("Queue is underflow.");
            return null;
        }
        return data.remove(0);
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public int size() {
        return data.size();
    }

    public T peek() {
        if (data.isEmpty()) {
            System.out.println("Queue is underflow.");
            return null;
        }
        return data.get(0);
    }
}
