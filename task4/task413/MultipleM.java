package com.epamjavaweb.task4.task413;

//Определить количество элементов последовательности натуральных чисел, кратных числу М и заключенных в
//промежутке от L до N.

import java.util.Random;

public class MultipleM {
    public static void main(String[] args) {
        int count = 0;
        Random randomX = new Random();
        int m = randomX.nextInt(50, 200);
        int l = randomX.nextInt(20, 30);
        int n = randomX.nextInt(30, 100);
        System.out.printf("Заданы числа M = %d, L = %d, N = %d\n", m, l, n);
        for (int i = l; i <= n; i++) {
            if (m % i == 0) {
                count++;
            }
        }
        System.out.printf("Количество натуральных чисел кратных М = %d будет равно %d", m, count);
    }
}
