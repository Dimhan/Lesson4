package com.epamjavaweb.task4.task412;

//Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых являются
//простыми числами.

public class SumSimpleDig {
    public static void main(String[] args) {
        double sumSimple = 0;
        int countDiv = 0;
        double[] arr = new double[]{2.2, 1, 5.2, -7.5, 8.7, 9.2, -11.11, 1.1, 14.44, -1.5, 17.8, 2.5, 5.5, -8.1};
        for (double arrI : arr) {
            System.out.printf("[%4.2f] ", arrI);
        }
        System.out.println();
        for (int i = 2; i < arr.length; i++) {
            if (i <= 10) {
                if ((i == 2) | (i == 3) | (i == 5) | (i == 7)) {
                    sumSimple += arr[i];
                }
            } else {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        countDiv++;
                    }
                }
                if (countDiv == 0) {
                    sumSimple += arr[i];
                }
            }
        }
        System.out.println("Итоговая сумма равна " + sumSimple);
    }
}
