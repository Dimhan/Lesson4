package com.epamjavaweb.task4.task407;

//Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим числом.
//Подсчитать количество замен.

public class ChangeZ {
    public static void main(String[] args) {
        double[] arrChain = new double[]{2.2, 4.1, 5.2, -7.5, 8.7, 9.2, -11.11, 12.4, 14.44, -15.5, 17.8};
        double anyZ = Math.random() * 10 - 5;
        int countChange = 0;
        System.out.println("Заменить члены последовательности большие Z на это число Z = " + anyZ);
        System.out.println("Исходная последовательность действительных чисел");
        for (int j = 0; j < arrChain.length; j++) {
            System.out.printf("[%4.2f] ", arrChain[j]);
            if (arrChain[j] > anyZ) {
                arrChain[j] = anyZ;
                countChange++;
            }
        }
        System.out.println();
        System.out.println("Новая последовательность");
        for (double i : arrChain) {
            System.out.printf("[%4.2f] ", i);
        }
        System.out.println();
        System.out.println("Количество замен " + countChange);
    }
}
