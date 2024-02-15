package com.google.DatabaseStructureTest;
import java.util.NoSuchElementException;

public class Jadu_Queue<T>{
    private static class Node<T>{
        private  T data;
        private Node<T> next;

        public Node(T data){
            this.data = data;
        }
    }

    private Node<T> first;
    private Node<T> last;
    private int size;
}
