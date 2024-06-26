package com.javatechie.querydsl.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.append(10);
        list.append(20);
        list.append(30);
        list.printList();

        list.prepend(5);
        list.printList();

        list.deleteWithValue(20);
        list.printList();

        System.out.println(list.find(10));
        System.out.println(list.find(20));
    }
}