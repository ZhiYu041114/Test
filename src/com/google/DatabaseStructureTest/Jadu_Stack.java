package com.google.DatabaseStructureTest;
import java.util.EmptyStackException;
public class Jadu_Stack<T> {
    private static class Node<T>{
        private T data;
        private Node<T> next;

        public Node(T data){
            this.data = data;
        }
    }

    private Node<T> top;
    private int size;

    public void push(T data){
        Node<T> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
        size++;
    }
}
