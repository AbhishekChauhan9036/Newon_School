package com.company.stack_and_queue;

import java.util.ArrayList;

public class Stack<T> {

    private ArrayList<T> data;

    public Stack() {
        this.data = new ArrayList<>();
    }

    public void push(T val) {
        data.add(val);
    }

    public T pop() {
        if (data.isEmpty()) {
            System.out.println("Stack is underflow.");
            return null;
        }
        return data.remove(data.size() - 1);
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public int size() {
        return data.size();
    }

    public T peek() {
        if (data.isEmpty()) {
            System.out.println("Stack is underflow.");
            return null;
        }
        return data.get(data.size() - 1);
    }
}
