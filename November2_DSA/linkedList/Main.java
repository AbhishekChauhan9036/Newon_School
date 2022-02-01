package com.company.linkedList;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
//        int[] a = {1, 4, 2, 3, 5};
//        int[] b = {7, 6, 1, 3, 2};
//        printCommonElements(a, b);
        LinkedList ll = new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
//        ll.print();
//        System.out.println(ll.head.data);
//        System.out.println(ll.tail.data);
//        System.out.println(ll.size);
//        LinkedList.Node node = ll.getAt(3);
//        if (node != null) System.out.println(node.data);
//        System.out.println(ll.removeLast().data);
//        System.out.println(ll.removeLast().data);
//        System.out.println(ll.removeLast().data);
        ll.addFirst(0);
        ll.addFirst(-1);
        ll.addFirst(-2);
//        ll.print();
//        ll.removeFirst();
//        ll.removeFirst();
//        ll.print();
        ll.addAt(3, 5);
//        ll.print();
        ll.removeAt(3);
//        ll.print();
        ll.removeAt(0);
//        ll.removeAt(0);
        ll.print();
//        ll.reversalWithData();
        ll.reversalWithPointers();
        ll.print();
    }

    public static void printCommonElements(int[] a, int[] b) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            hashSet.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            if (hashSet.contains(b[i])) System.out.println(b[i]);
        }
    }
}
