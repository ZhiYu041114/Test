package com.google.DatabaseStructureTest;

import java.util.AbstractList;
import java.util.List;

public class Jadu_Dynamic_array_2<T> extends AbstractList<T> implements List<T> {
    private T[] data;
    private int size;

    public Jadu_Dynamic_array_2() {
        data = (T[]) new Object[10];
        size = 0;
    }

    public Jadu_Dynamic_array_2(int initialCapacity) {
        data = (T[]) new Object[initialCapacity];
        size = 0;
    }

    @Override
    public T get(int index) {
        return data[index];
    }

    @Override
    public T set(int index, T element) {
        T oldElement = data[index];
        data[index] = element;
        return oldElement;
    }

    @Override
    public void add(int index, T element) {
        ensureCapacity();
        for (int i = size; i > index; i--) {
           data[i] = data[i-1];
        }
        data[index] = element;
        size++;
    }

    @Override
    public T remove(int index){
        T element = data[index];
        for (int i = index; i<size-1;i++){
            data[i] = data[i+1];
        }
        size--;

        return element;
    }

    @Override
    public int size(){
        return size;
    }

    private void ensureCapacity(){
        if(size == data.length){
            T[] newData = (T[]) new Object[data.length * 2];
            System.arraycopy(data,0,newData,0,data.length);
            data = newData;

     }
    }
}