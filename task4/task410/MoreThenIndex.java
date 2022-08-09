package com.epamjavaweb.task4.task410;

//Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.

public class MoreThenIndex {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 1, 8, 10, 3, 6, 14, 11, 7, 9};
        System.out.println("Даны целые числа а1 ,а2 ,..., аn ");
        for (int printArr : arr) {
            System.out.printf("[%d] ", printArr);
        }
        System.out.println();
        System.out.println("Итоговый результат при условии ai > i");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > i) {
                System.out.printf("[%d] ", arr[i]);
            }
        }
    }
}
