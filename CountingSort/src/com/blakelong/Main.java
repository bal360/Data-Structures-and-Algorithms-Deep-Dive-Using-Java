package com.blakelong;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] intArray = { 3, 5, 2, 7, 4, 5, 9, 10, 5, 6 };
        countingSort(intArray,1, 10);
        System.out.println(Arrays.toString(intArray));

    }

    public static void countingSort(int[] array, int min, int max) {
        int[] countArray = new int[(max - min) + 1];

        for (int i = 0; i < array.length; i++) {
            countArray[array[i] - min]++;
            System.out.println(Arrays.toString(countArray));
        }

        int j = 0;
        for (int i = min; i <= max; i++) {
            while (countArray[i - min] > 0) {
                array[j++] = i;
                countArray[i - min]--;
            }
        }


    }
}
