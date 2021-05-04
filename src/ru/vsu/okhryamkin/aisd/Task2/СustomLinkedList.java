package ru.vsu.okhryamkin.aisd.Task2;

import java.util.Comparator;

public class СustomLinkedList<Type> {
    public Node head = null;
    public Node tail = null;

    public void addNode(Type data) {

        Node newNode = new Node(data);

        if(head == null) {

            head = newNode;
            tail = newNode;
        }
        else {

            tail.setNext(newNode);

            tail = newNode;
        }
    }

//    public Type getMaxValue() {
//        Node node = head;
//        int max = 0;
//
//        while(node != null) {
//            if(node.data > max) {
//                max = node.data;
//            }
//            node = node.next;
//        }
//
//        return max;
//    }

    public Type getMaxValue(Comparator<? super Type> comparator) {
        Node<Type> node = head;
        Type max = (Type) head.getData();

        while(node.getNext() != null) {
            Type candidate = node.getData();
            if(comparator.compare(candidate, max) > 0) {
                max = candidate;
            }
            System.out.println("test");
            node = node.getNext();
        }

        return max;
    }

    public void display() {

        Node current = head;

        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while(current != null) {
            //Prints each node by incrementing pointer
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
}