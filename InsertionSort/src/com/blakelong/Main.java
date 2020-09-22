package com.blakelong;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {22, 4, -23, 15, 55, -6, 12};

        insertionSort(intArray);
        System.out.println(Arrays.toString(intArray));
    }

    public static void insertionSort(int[] array) {
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {
            int newElement = array[firstUnsortedIndex];

            int i;
            for (i = firstUnsortedIndex; i > 0 && array[i - 1] > newElement; i--) {
                array[i] = array[i - 1];
            }
            array[i] = newElement;
        }
    }
}
