package com.epamjavaweb.task4.task411;

//Даны натуральные числа а1 ,а2 ,..., аn . Указать те из них, у которых остаток от деления на М равен L (0 < L < М-1).

public class RemainDiv {
    public static void main(String[] args) {
        int m = (int) (Math.random() * 5) + 1;
        System.out.println("Дано число М = " + m);
        int[] arr = new int[]{2, 14, 1, 8, 12, 3, 6, 14, 11, 7, 9};
        System.out.println("Даны натуральные числа а1 ,а2 ,..., аn");
        for (int indArr : arr) {
            System.out.printf("[%d] ", indArr);
        }
        System.out.println();
        System.out.println("Числа, у которых остаток от деления на М равен L (0 < L < М-1) ");
        for (int j : arr) {
            if (((j % m) > 0) & ((j % m) < (m - 1))) {
                System.out.printf("[%d] ", j);
            }
        }
    }
}