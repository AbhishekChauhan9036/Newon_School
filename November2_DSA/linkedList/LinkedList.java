package com.company.linkedList;

import java.util.HashMap;

public class LinkedList {
    Node head;
    Node tail;
    int size;

    public LinkedList() {
        this.size = 0;
    }

    class Node {
        int data;
        Node random;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node(int data) {
            this.data = data;
        }
    }

    public void addLast(int data) {
        Node node = new Node(data, null);
        if (this.tail == null) {
            this.tail = this.head = node;
        } else {
            this.tail.next = node;
            this.tail = node;
        }
        this.size++;
    }

    public void print() {
        Node node = this.head;
        while (node != null) {
            System.out.print(node.data + ", ");
            node = node.next;
        }
        System.out.println();
    }

    public Node getAt(int idx) {
        if (idx < 0 || idx >= this.size) {
            System.out.println("Invalid input");
            return null;
        }
        int i = 0;
        Node n = this.head;
        while (i < idx) {
            i++;
            n = n.next;
        }
        return n;
    }

    public Node removeLast() {
        if (this.size == 0) {
            System.out.println("Invalid operation");
            return null;
        }
        Node node = getAt(this.size - 2);
        Node res = this.tail;
        node.next = null;
        this.tail = node;
        this.size--;
        return res;
    }

    public void addFirst(int data) {
        Node node = new Node(data, null);
        if (this.head == null) {
            this.head = this.tail = node;
        } else {
            node.next = this.head;
            this.head = node;
            this.size++;
        }
    }

    public Node removeFirst() {
        if (this.size == 0) {
            System.out.println("Invalid operation");
            return null;
        }
        Node res = this.head;
        this.size--;
        this.head = this.head.next;
        res.next = null;
        return res;
    }

    public void addAt(int idx, int data) {
        if (idx < 0 || idx > this.size) {
            System.out.println("Invalid operation");
        } else if (idx == 0) addFirst(data);
        else if (idx == this.size) addLast(data);
        else {
            Node prevNode = getAt(idx - 1);
            Node node = new Node(data, null);
            node.next = prevNode.next;
            prevNode.next = node;
            this.size++;
        }
    }

    public Node removeAt(int idx) {
        if (this.size == 0) {
            System.out.println("Invalid operation.");
            return null;
        } else if (idx < 0 || idx >= this.size) {
            System.out.println("Invalid index");
            return null;
        } else if (idx == 0) return removeFirst();
        else if (idx == this.size - 1) return removeLast();
        Node prev = getAt(idx - 1);
        Node res = prev.next;
        prev.next = prev.next.next;
        res.next = null;
        this.size--;
        return res;
    }

    public Node getFirstMid() {
        Node s = this.head;
        Node f = this.head;
        while (f.next != null && f.next.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
    }

    public Node getSecondMid() {
        Node s = this.head;
        Node f = this.head;
        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
    }

    public void reversalWithData() {
        int i = 0;
        int j = this.size - 1;
        while (i < j) {
            Node iNode = getAt(i);
            Node jNode = getAt(j);
            int temp = iNode.data;
            iNode.data = jNode.data;
            jNode.data = temp;
            i++;
            j--;
        }
    }

    public void reversalWithPointers() {
        Node c = this.head;
        Node p = null;
        while (c.next != null) {
            Node n = c.next;
            c.next = p;
            p = c;
            c = n;
        }
        c.next = p;
        this.head = c;
    }

    //https://leetcode.com/problems/copy-list-with-random-pointer/
    public Node copyRandomList(Node head) {
        Node n = head;
        Node newLL = new Node(-1);
        Node res = newLL;
        while (n != null) {
            Node node = new Node(n.data);
            newLL.next = node;
            newLL = newLL.next;
            n = n.next;
        }
        res = res.next;
        n = head;
        newLL = res;
        HashMap<Node, Node> map = new HashMap<>();
        while (n != null) {
            map.put(n, newLL);
            n = n.next;
            newLL = newLL.next;
        }
        n = head;
        while (n != null) {
            if (n.random != null) {
                Node oldNode = n;
                Node newNode = map.get(oldNode);
                newNode.random = map.get(oldNode.random);
            }
            n = n.next;
        }
        return res;
    }

    //    https://my.newtonschool.co/playground/code/5nejygaji7qq/
    public static Node intersection(Node head1, Node head2) {
        int h1Size = getSize(head1);
        int h2Size = getSize(head2);
        int abs = Math.abs(h1Size - h2Size);
        if (h1Size > h2Size) {
            for (int i = 0; i < abs; i++) {
                head1 = head1.next;
            }
        } else {
            for (int i = 0; i < abs; i++) {
                head2 = head2.next;
            }
        }

        while (head1 != head2) {
            head1 = head1.next;
            head2 = head2.next;
        }
        return head2;
    }

    public static int getSize(Node node) {
        int i = 0;
        while (node != null) {
            i++;
            node = node.next;
        }
        return i;
    }
}
