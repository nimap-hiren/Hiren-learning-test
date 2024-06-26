package com.javatechie.querydsl.Queue;

public class StaticQueueinjava {

    public static void main(String[] args)
    {
        Queue q = new Queue(4);

        q.queueDisplay();

        q.queueEnqueue(20);
        q.queueEnqueue(30);
        q.queueEnqueue(40);
        q.queueEnqueue(50);

        q.queueDisplay();

        q.queueEnqueue(60);

        q.queueDisplay();

        q.queueDequeue();
        q.queueDequeue();
        System.out.printf(
                "\n\nafter two node deletion\n\n");

        q.queueDisplay();

        q.queueFront();
    }
}
