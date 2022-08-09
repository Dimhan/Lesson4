package com.epamjavaweb.task4.task402;

//В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов.

import java.util.ArrayList;
import java.util.List;

public class NumberOfZero {
    public static void main(String[] args) {
        int[] arrZero = new int[]{2, 4, 0, 8, 0, 3, 6, 44, 0, 7, 9};
        List<Integer> listZero = new ArrayList<>();
        System.out.println("Последовательность с нулевыми элементами");
        for (int i = 0; i < arrZero.length; i++) {
            System.out.printf("[%d]", arrZero[i]);
            if (arrZero[i] == 0) {
                listZero.add(i);
            }
        }
        System.out.println();
        int[] arrZeroIndex = new int[listZero.size()];
        System.out.println("Найденные идексы нулевых элементов");
        for (int j = 0; j < listZero.size(); j++) {
            arrZeroIndex[j] = listZero.get(j);
            System.out.printf("[%d]", arrZeroIndex[j]); // output zero index array
        }
    }
}
