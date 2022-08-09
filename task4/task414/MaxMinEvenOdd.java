package com.epamjavaweb.task4.task414;

//Дан одномерный массив A[N]. Найти:
//max( чётных элементов ) min(нечётных элементов)

public class MaxMinEvenOdd {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, 10, 8, 11, 3, 7, 44, 22, 7, 9};
        int maxArr, minArr, sumMaxMin;
        maxArr = arr[2];
        System.out.println("Элементы с чётными идексами");
        for (int i = 2; i < arr.length; i += 2) {
            System.out.printf("[%d] ", arr[i]);
            if (arr[i] > maxArr) {
                maxArr = arr[i];
            }
        }
        System.out.println();
        minArr = arr[1];
        System.out.println("Элементы с нечётными идексами");
        for (int j = 1; j < arr.length; j += 2) {
            System.out.printf("[%d] ", arr[j]);
            if (arr[j] < minArr) {
                minArr = arr[j];
            }
        }
        sumMaxMin = minArr + maxArr;
        System.out.println();
        System.out.println("Итоговая сумма равна " + sumMaxMin);
    }
}
