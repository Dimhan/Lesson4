package com.epamjavaweb.task4.task406;

//Дана последовательность чисел а1 ,а2 ,..., ап. Указать наименьшую длину числовой оси, содержащую все эти числа.

import java.util.Arrays;

public class Range {
    public static void main(String[] args) {
        int[] arr = new int[]{-2, 4, 1, 8, 10, 3, 6, 14, 11, 7, 9};
        int lenghtArr = 0;
        System.out.println("Дана числовая последоыательность");
        for (int i : arr) {
            System.out.printf("[%d] ", i);
        }
        System.out.println();
        Arrays.sort(arr);
        System.out.print("Длина числовой оси," +
                " содержащей всю последовательность -> ");
        if ((arr[0] < 0 & arr[arr.length - 1] < 0) | (arr[0] > 0 & arr[arr.length - 1] > 0)) {
            System.out.println(Math.abs(arr[arr.length - 1]) - Math.abs(arr[0]));
        } else {
            System.out.println(arr[arr.length - 1] - arr[0]);
        }
    }
}
