package com.mycompany.csc229_lab10;

class Node {

    public int data;
    public Node next;
    public Node previous;

    public Node(int initialData) {
        data = initialData;
        next = null;
        previous = null;
    }
}

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    int size;

    public DoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void append(Node newNode) {
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
        size++;
    }

    public void prepend(Node newNode) {
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
        }
        size++;
    }

    public void printList() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public void printRevList() {
        Node node = tail;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.previous;
        }
        System.out.println();
    }

    public void insertAfter(Node currentNode, Node newNode) {
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else if (currentNode == tail) {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        } else {
            Node successor = currentNode.next;
            newNode.next = successor;
            newNode.previous = currentNode;
            currentNode.next = newNode;
            successor.previous = newNode;
        }
        size++;
    }

    public void remove(Node currentNode) {
        Node successor = currentNode.next;
        Node predecessor = currentNode.previous;

        if (successor != null) {
            successor.previous = predecessor;
        }

        if (predecessor != null) {
            predecessor.next = successor;
        }

        if (currentNode == head) {
            head = successor;
        }

        if (currentNode == tail) {
            tail = predecessor;
        }

        if (head != null) {
            size--;
        }
    }

    public int size() {
        return size;
    }

    public int[] toArray() {
        int[] arr = new int[size];
        Node currNode = head;
        int inc = 0;

        while (currNode != null) {
            arr[inc++] = currNode.data;
            currNode = currNode.next;
        }
        return arr;
    }

    public int indexOf(int x) {
        Node currNode = head;
        int inc = 0;

        while (currNode != null) {
            if (currNode.data == x) {
                return inc;
            }
            inc++;
            currNode = currNode.next;
        }
        return -1;
    }

    public int sumLast(int m) {
        int sum = 0;
        Node currNode = tail;

        for (int i = 0; i < m; i++) {
            sum += currNode.data;
            currNode = currNode.previous;
        }
        return sum;
    }

}
