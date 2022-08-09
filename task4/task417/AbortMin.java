package com.epamjavaweb.task4.task417;

//Дана последовательность целых чисел A1, A2,...,An. Образовать новую последовательность, выбросив из исходной
//те члены, которые равны min(A1, A2,...,An).

public class AbortMin {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, 10, 8, 11, 3, 7, 44, 22, 7, 9};
        int min = arr[0];
        System.out.println("The initial sequence");
        for (int arrI : arr) {
            System.out.printf("[%d] ", arrI);
            if (min > arrI) {
                min = arrI;
            }
        }
        System.out.println();
        System.out.println("The minimum element is min = " + min);
        System.out.println("The final sequence");
        for (int arrJ : arr) {
            if (arrJ != min) {
                System.out.printf("[%d] ", arrJ);
            }
        }

    }
}
