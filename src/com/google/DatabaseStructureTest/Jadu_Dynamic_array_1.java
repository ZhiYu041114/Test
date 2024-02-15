package com.google.DatabaseStructureTest;

import java.util.Arrays;
public class Jadu_Dynamic_array_1<T> {
    private Object[] data;
    private int capacity;

    public Jadu_Dynamic_array_1() {
        data = new Object[10];
        capacity = 10;
    }

    // add an element to the end of the array
    public void add(T element) {
        ensureCapacity(capacity + 1);
        data[capacity++] = element;
    }

    // insert an element at a specified index
    public void insert(T element, int index) {
        if (index < 0 || index >= capacity) {
            throw new IndexOutOfBoundsException();
        }
        ensureCapacity(capacity + 1);
        System.arraycopy(data, index, data, index + 1, capacity - index);
        data[index] = element;
        capacity++;
    }

    // get the element at a specified index
    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index < 0 || index > capacity) {
            throw new IndexOutOfBoundsException();
        }
        return (T) data[index];
    }

    // set the element at a specified index
    public void set(int index,T element){
        if (index < 0 || index > capacity){
            throw new IndexOutOfBoundsException();
        }

        data[index] = element;
    }

    // remove an element at a specified index
    @SuppressWarnings("unchecked")
    public T remove (int index){
        if (index < 0 || index > capacity){
            throw new IndexOutOfBoundsException();
        }
        T element = (T) data[index];
        System.arraycopy(data,index+1,data,index, capacity -index);
        capacity--;

        return element;
    }

    private void ensureCapacity(int minCapacity){
        int oldCapacity = data.length;
        if(minCapacity > oldCapacity){
            int newCapacity = oldCapacity * 2;
            if(newCapacity < minCapacity){
                newCapacity = minCapacity;
            }
            data = Arrays.copyOf(data,newCapacity);
        }
    }
}