package ru.vsu.okhryamkin.aisd.Task2;

public class Node<Type> {
    private Type data;
    private Node next;

    public Node(Type data) {
        this.data = data;
        this.next = null;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node value) {
        this.next = value;
    }

    public Type getData() {
        return data;
    }

}