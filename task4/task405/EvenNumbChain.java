package com.epamjavaweb.task4.task405;

//Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив из четных чисел этой последовательности.
//Если таких чисел нет, то вывести сообщение об этом факте.

import java.util.ArrayList;
import java.util.List;

public class EvenNumbChain {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, 0, 8, 0, 3, 7, 44, 0, 7, 9};
        List<Integer> listEvenNum = new ArrayList<>();
        System.out.println("Исходная последовательность натуральных чисел");
        for (int j : arr) {
            System.out.printf("[%d] ", j);
            if (((j % 2) == 0) && (j != 0)) {
                listEvenNum.add(j);
            }
        }
        System.out.println();
        if (listEvenNum.size() == 0) {
            System.out.println("В иходной последовательности нет четных чисел");
        } else {
            System.out.println("Массив чётных чисел");
            int[] arrEvenNum = new int[listEvenNum.size()];
            for (int i = 0; i < arrEvenNum.length; i++) {
                arrEvenNum[i] = listEvenNum.get(i);
                System.out.printf("[%d] ", arrEvenNum[i]);
            }
        }
    }
}
