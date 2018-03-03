package com.velware.sorting.algorithms;

public class InsertionSort {

    private static int[] insertionSort(int[] input) {
        for (int i = 0; i < input.length; ++i) {
            int key = input[i];
            int j = i-1;
            while (j >= 0 && input[j] > key) {
                input[j + 1] = input[j];
                j--;
            }
            input[j + 1] = key;
        }
        return input;
    }

    private static void printArray(int[] input) {
        for (int i : input) {
            System.out.print(i + " ");
        }
    }

    public static void main(String args[]) {
        int[] input = new int[]{5, 1, 4, 2, 8};
        System.out.println("input");
        printArray(input);
        System.out.println();
        int[] output = insertionSort(input);
        System.out.println("output");
        printArray(output);
        System.out.println();

        int[] input2 = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("input2");
        printArray(input2);
        System.out.println();
        int[] output2 = insertionSort(input2);
        System.out.println("output2");
        printArray(output2);
        System.out.println();
    }

}
