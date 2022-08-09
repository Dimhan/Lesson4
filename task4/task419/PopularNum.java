package com.epamjavaweb.task4.task419;

//В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких чисел
//несколько, то определить наименьшее из них.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PopularNum {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, 10, 4, 11, 3, 7, 44, 22, 9, 5};
        System.out.println("Source array");
        for (int arrI : arr) {
            System.out.printf("[%d] ", arrI);
        }
        System.out.println();
        List<Integer> arrList = new ArrayList<>();
        Arrays.sort(arr);
        System.out.println("Sorted array");
        for (int arrJ : arr) {
            System.out.printf("[%d] ", arrJ);
        }
        System.out.println();
        int simalarI = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                simalarI++;
            } else if (simalarI > 1) {
                arrList.add(arr[i]);
                simalarI = 1;
            }
        }
        if (arrList.size() != 0) {
            int min = arrList.get(0);
            System.out.println("The frequent numbers");
            for (Integer arrListI : arrList) {
                System.out.printf("[%d] ", arrListI);
                if (arrListI < min) {
                    min = arrListI;
                }
            }
            System.out.println();
            System.out.println("Minimum of frequent numbers");
            System.out.println("min = " + min);
        } else {
            System.out.println("There are no similar numbers");
        }
    }
}
