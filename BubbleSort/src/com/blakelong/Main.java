package com.blakelong;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {23, -5, 3, 9, -22, 12, 1, 9};
        bubbleSort(intArray);
        System.out.println(Arrays.toString(intArray));
    }


    // stable sort - maintains relative order of duplicate values - Time Complexity of 0(n^2)
    public static void bubbleSort(int[] array) {
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
