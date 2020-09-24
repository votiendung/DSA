package TrienKhaiQueuelkVong;

import java.util.ArrayList;

public class Queue {
    private Node front;
    private Node rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public void enQueue(int data) {
        Node temp = new Node(data);
        if (this.front == null) {
            this.front = this.rear = temp;
        }else {
            this.rear.link = temp;
            this.rear = temp;
            temp.link = this.front;
        }


    }

    public Node deQueue() {
        Node temp = this.front;
        if (this.front == null) {
            return null;
        } else if (this.front == this.rear) {
            this.front = this.rear = null;
        } else {
            this.front = this.front.link;
            this.rear.link = this.front;
        }
        return temp;
    }


    public static void displayQueue(Queue q) {
        Node temp = q.front;
        System.out.println("cac phan tu trong hang doi lien ket vong la: ");
        do  {
            System.out.printf("%d ", temp.data);
            temp = temp .link;
        }
        while (temp != q.front);
        System.out.println("rong roi ah");

    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.front = q.rear = null;
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(5);

//        q.enQueue(6);
//        q.enQueue(34);
//        q.enQueue(68);

        displayQueue(q);
//
        System.out.println("phan tu da xoa: " + q.deQueue().data);
        System.out.println("phan tu da xoa: " + q.deQueue().data);
//
//        displayQueue(q);
//
//        q.enQueue(9);
//        q.enQueue(20);
//        displayQueue(q);
    }


}
