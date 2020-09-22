package com.blakelong;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {34, -22, 12, 55, 8, -2, 3};

        selectionSort(intArray);
        System.out.println(Arrays.toString(intArray));
    }

    public static void selectionSort(int[] array) {

        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (array[i] > array[largest]) {
                    largest = i;
                }
            }
            int temp = array[lastUnsortedIndex];
            array[lastUnsortedIndex] = array[largest];
            array[largest] = temp;
        }
    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }

        if (array[i] < array[j]) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
