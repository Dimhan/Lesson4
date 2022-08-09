package com.epamjavaweb.task4.task401;

//В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

public class SumArrA {
    public static void main(String[] args) {
        int summ = 0;
        int[] arrA = new int[10];
        int k = (int) (Math.random() * 200);
        System.out.println("Задано число К = " + k);
        for (int i = 0; i < arrA.length; i++) {
            arrA[i] = (i + 1) * 10 + ((int) (Math.random() * 10));
            System.out.printf("[%d]", arrA[i]);
            if ((k % arrA[i]) == 0) {
                summ += arrA[i];
            }
        }
        System.out.println();
        System.out.println("Итого, сумма равна " + summ);
    }
}
