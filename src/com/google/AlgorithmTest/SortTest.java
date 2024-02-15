package com.google.AlgorithmTest;

public class SortTest {
    public static void main(String[] args) {
        int[] array = {2,34,2,1,16,46,3,63,6};
        int size = array.length;
        insertion_sort(array,size);
        for (int element:array){
            System.out.print(element+" ");
        }
    }
    public static void bubble_sort(int[] array, int size) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    public static void selection_sort(int[] array, int size){
        for (int i = 0; i < size - 1; i++) {
            int min_index = i;

            for (int j = i+1; j < size; j++) {
                if (array[j] < array[min_index]){
                    min_index = j;
                }
            }

            int temp = array[min_index];
            array[min_index] = array[i];
            array[i] = temp;
        }
    }
    public static void insertion_sort(int[] array, int size){
        for (int i = 0; i <size; i++) {
            int key = array[i];
            int j =i -1 ;

            while(j >= 0 && array[i] > key){
                array[j+1] = array[j];
                j--;
            }

            array[j+1] = key;
        }
    }

}