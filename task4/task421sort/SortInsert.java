package com.epamjavaweb.task4.task421sort;

//Sorting with inserts

public class SortInsert {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 6, 2, 5, 8, 1, 10, 7, 11};
        int temp;
        int j;
        System.out.println("The source array");
        for (int arrI : arr) {
            System.out.printf("[%d] ", arrI);
        }
        System.out.println();
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            j = i;
            while (j > 0 && arr[j - 1] > temp) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
        System.out.println("The sorted array");
        for (int arrJ : arr) {
            System.out.printf("[%d] ", arrJ);
        }
    }
}
