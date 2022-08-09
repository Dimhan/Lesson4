package com.epamjavaweb.task4.task404;

//Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет ли она возрастающей.

public class IncremOrDecrem {
    public static void main(String[] args) {
        double[] arrChain = new double[]{2.2, 4.1, 5.2, 7.5, 8.7, 9.2, 11.11, 12.4, 14.44, 15.5, 17.8};
        int incrDecr = 1;
        for (double arrI : arrChain) {
            System.out.printf("[%4.1f] ", arrI);
        }
        for (int i = 0; i < arrChain.length - 1; i++) {
            if (arrChain[i] < arrChain[i + 1]) {
                incrDecr++;
            }
        }
        System.out.println();

        if (incrDecr == arrChain.length) {
            System.out.println("Последовательность возрастающая");
        } else {
            System.out.println("Последовательность не возрастающая");
        }
    }
}
