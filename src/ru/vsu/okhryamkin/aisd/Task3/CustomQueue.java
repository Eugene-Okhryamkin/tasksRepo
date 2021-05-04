package ru.vsu.okhryamkin.aisd.Task3;

public class CustomQueue<Type> {
    private Node head;
    private Node end;

    public void enqueue(Type[] data){

        Node node = new Node(data);
        if(this.end == null){
            this.head = node;
            this.end = this.head;
        }
        else {
            this.end.setNext(node);
            this.end = node;
        }
    }

    public void dequeue (){

        if (head == end){
            end = null;
        }

        head = this.head.getNext();
    }


    @Override
    public String toString() {
        return head.getData().toString();
    }

    public String deepToString() {

        StringBuilder res = new StringBuilder();
        res.append(head.getData());

        Node cur = head;
        while (null != (cur = cur.getNext())){
            res.append(" ");
            res.append(cur.getData());

        }
        return res.toString();
    }
}
