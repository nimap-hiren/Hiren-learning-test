package com.javatechie.querydsl.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseKElementsQueue {

    static void reverseKElements(Queue<Integer> queue, int k) {
        if (queue.isEmpty() || k > queue.size() || k <= 0) {
            return;
        }
        reverse(queue, k);
        for (int i = 0; i < queue.size() - k; i++) {
            queue.add(queue.remove());
        }
    }

    static void reverse(Queue<Integer> queue, int k) {
        if (k == 1) {
            queue.add(queue.remove());
            return;
        }
        int front = queue.remove();
        reverse(queue, k - 1);
        queue.add(front);
    }

    static void printQueue(Queue<Integer> queue) {
        while (!queue.isEmpty()) {
            System.out.print(queue.remove() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        int k = 3;

        reverseKElements(queue, k);

        printQueue(queue);
    }
}
