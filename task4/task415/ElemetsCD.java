package com.epamjavaweb.task4.task415;

//Дана последовательность действительных чисел n A1 , A2,.., An . Указать те ее элементы, которые принадлежат отрезку
//[с, d].

import java.util.ArrayList;
import java.util.List;

public class ElemetsCD {
    public static void main(String[] args) {
        double[] arr = new double[]{2.2, 1, 5.2, -7.5, 8.7, 9.2, -11.11, 1.1, 14.44, -1.5, 17.8, 2.5, 5.5, -8.1};
        double c = Math.random() * 7 - 5;
        double d = Math.random() * 10 + 5;
        System.out.printf("Задан отрезок [%4.2f, %4.2f]\n", c, d);
        System.out.println("Дана последовательность чисел");
        for (double arrI : arr) {
            System.out.printf("[%4.2f] ", arrI);
        }
        System.out.println();
        List<Double> listCD = new ArrayList<>();
        for (double arrJ : arr) {
            if (arrJ > c & arrJ < d) {
                listCD.add(arrJ);
            }
        }
        System.out.printf("Элементы, принадлежащие отрезку [%4.2f, %4.2f]\n", c, d);
        for (Double listI : listCD) {
            System.out.printf("[%4.2f] ", listI);
        }
    }
}
