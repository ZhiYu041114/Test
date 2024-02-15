package com.google.DatabaseStructureTest;

public class Jadu_LinkedList<T> {
    private Node<T> head;
    private int size;

    public Jadu_LinkedList(){
        head = null;
        size = 0;
    }

    // Inner class
    private static class Node<T>{
        private T data;
        private Node<T> next;

        public Node(T data){
            this.data = data;
            this.next = null;
        }
    }

    public int size(){
        return size;
    }
}
