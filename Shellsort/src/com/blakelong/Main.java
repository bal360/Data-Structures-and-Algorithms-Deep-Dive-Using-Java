package com.blakelong;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {2, -34, 54, 3, 15, -23, 5};

        shellSort(intArray);
        System.out.println(Arrays.toString(intArray));
    }

    public static void shellSort(int[] array) {
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < array.length; i++) {
                int newElement = array[i];
                int j = i;
                while (j >= gap && array[j - gap] > newElement) {
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = newElement;
            }
        }
    }
}
