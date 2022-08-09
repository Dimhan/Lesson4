package com.epamjavaweb.task4.task403;
/*
   Дана последовательность целых чисел а1, а2,..., аn . Выяснить, какое число встречается раньше - положительное или
отрицательное.

 */

public class NegOrPos {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, -10, 4, 11, -3, 7, 44, 22, 9, -5};
        System.out.println("The source array");
        for (int arrI : arr) {
            System.out.printf("[%d]  ", arrI);
        }
        System.out.println();
        System.out.println("Negative or positive");
        for (int arrJ : arr) {
            if (arrJ < 0) {
                System.out.print("[ - ]");
            } else {
                System.out.print("[ + ]");
            }
        }
        System.out.println();

        if (arr[0] > 0) {
            System.out.println("A positive number is found earlier");
        } else {
            System.out.println("A negative number is found earlier");
        }
    }
}
