package com.company.stack_and_queue;

public class Main {
    public static void main(String[] args) {
//        useStack();
//        useQueue();
        System.out.println("balancedParenthesis() = " + balancedParenthesis("(a+b))"));
    }

    public static void useStack() {
        com.company.stack_and_queue.Stack<Integer> stack = new Stack<>();
        System.out.println("stack.size() = " + stack.size());
        stack.push(12);
        stack.push(322);
        stack.push(33);
        stack.push(14);
        stack.push(56);
        stack.push(6956);
        System.out.println("stack.size() = " + stack.size());
        System.out.println("stack.peek() = " + stack.peek());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
    }

    public static void useQueue() {
        Queue<Integer> queue = new Queue<>();
        System.out.println("queue.size() = " + queue.size());
        queue.add(1);
        queue.add(21);
        queue.add(15);
        queue.add(112);
        queue.add(71);
        System.out.println("queue.peek() = " + queue.peek());
        System.out.println("queue.size() = " + queue.size());
        System.out.println("queue.remove() = " + queue.remove());
        System.out.println("queue.remove() = " + queue.remove());
        System.out.println("queue.remove() = " + queue.remove());
        System.out.println("queue.remove() = " + queue.remove());
        System.out.println("queue.remove() = " + queue.remove());
        System.out.println("queue.remove() = " + queue.remove());
    }

    public static boolean balancedParenthesis(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) return false;
                else if (stack.peek() == '(' && c == ')') {
                    stack.pop();
                } else if (stack.peek() == '[' && c == ']') {
                    stack.pop();
                } else if (stack.peek() == '{' && c == '}') {
                    stack.pop();
                } else return false;
            }
        }
        return stack.isEmpty();
    }

// https://practice.geeksforgeeks.org/problems/next-larger-element-1587115620/1

    public static long[] nextLargerElement(long[] arr) {
        long[] res = new long[arr.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            long c = arr[i];
            if (stack.isEmpty() || arr[stack.peek()] > c) {
                stack.push(i);
            } else {
                while (!stack.isEmpty() && arr[stack.peek()] < c) {
                    res[stack.pop()] = c;
                }
                stack.push(i);
            }
        }
        while (!stack.isEmpty()) {
            res[stack.pop()] = -1;
        }
        return res;
    }

    //    https://practice.geeksforgeeks.org/problems/stock-span-problem-1587115621/1
//    Next greater element on Left Side.
    public static int[] calculateSpan(int[] arr) {
        int[] res = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            int c = arr[i];
            while (!stack.isEmpty() && arr[stack.peek()] <= c) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                res[i] = i + 1;
            } else {
                res[i] = i - stack.peek();
            }
            stack.push(i);
        }
        return res;
    }
}
