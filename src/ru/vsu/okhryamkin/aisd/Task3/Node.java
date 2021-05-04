package ru.vsu.okhryamkin.aisd.Task3;

public class Node<Type> {
    private Node next;
    private Type data;

    Node(Type[] i){
        for(int j = 0; j < i.length; j++) {
            data = i[j];
        }
    }

    public Type getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
