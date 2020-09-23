package com.blakelong;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] intArray = {4372, 2341, 5435, 7544, 2821, 4124 };

        System.out.println(Arrays.toString(radixSort(intArray, 10, 4)));
    }

    // Sarah had the method with no return value but I just wanted to quickly use toString
    // and not loop to print values
    public static int[] radixSort(int[] input, int radix, int width) {
        for (int i = 0; i < width; i++) {
            radixSingleSort(input, i, radix);
        }
        return input;
    }

    public static void radixSingleSort(int[] input, int position, int radix) {
        int numtItems = input.length;
        int[] counterArray = new int[radix];

        for (int value : input) {
            counterArray[getDigit(position, value, radix)]++;
        }
        // adjust the count array
        for (int j = 1; j < radix; j++) {
            counterArray[j] += counterArray[j - 1];
        }

        int[] tempArray = new int[numtItems];
        for (int tempIndex = numtItems - 1; tempIndex >= 0; tempIndex--) {
            tempArray[--counterArray[getDigit(position, input[tempIndex], radix)]] = input[tempIndex];
        }

        for (int tempIndex = 0; tempIndex < numtItems; tempIndex++) {
            input[tempIndex] = tempArray[tempIndex];
        }
    }

    public static int getDigit(int position, int value, int radix) {
        return value / (int) Math.pow(radix, position) % radix;
    }
}
