package com.velware.sorting.algorithms;

public class BubbleSort {

    private static int[] bubbleSort(int[] input){
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < input.length - 1; i++) {
                if (input[i] > input[i + 1]) {
                    int temp = input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = temp;
                    swapped = true;
                }
            }
        }while(swapped);
       return input;
    }

    private static void printArray(int[] input){
        for (int i : input) {
            System.out.print(i+" ");
        }
    }

    public static void main(String args[]){

        int[] input = new int[] {5,1,4,2,8};
        System.out.println("input");
        printArray(input);
        System.out.println();
        int[] output = bubbleSort(input);
        System.out.println("output");
        printArray(output);
        System.out.println();

        int[] input2 = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("input2");
        printArray(input2);
        System.out.println();
        int[] output2 = bubbleSort(input2);
        System.out.println("output2");
        printArray(output2);
        System.out.println();

    }


}
