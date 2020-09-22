package com.blakelong;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {23, -5, 2, 65, -12, 34, 13};
        quickSort(intArray, 0, intArray.length);
        System.out.println(Arrays.toString(intArray));
    }

    public static void quickSort(int[] array, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int pivotIndex = partition(array, start, end);
        quickSort(array, start, pivotIndex);
        quickSort(array, pivotIndex + 1, end);
    }

    public static int partition(int[] array, int start, int end) {
        // this is using the first element as the pivot
        // either first index of array or any given subarray
        int pivot = array[start];
        int i = start;
        int j = end;
        while (i < j) {

            // empty loop body - just using it to continue decrementing j
            // until we find an element that is less that pivot or
            // j crosses i
            while (i < j && array[--j] >= pivot);
            if (i < j) {
                array[i] = array[j];
            }

            // empty loop body - just using it to continue incrementing j
            // until we find an element that is greater than pivot or
            // i crosses j
            while (i < j && array[++i] <= pivot);
            if (i < j) {
                array[j] = array[i];
            }
        }
        array[j] = pivot;
        return j;
    }
}
