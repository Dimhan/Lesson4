package com.epamjavaweb.task4.task408;

//Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
//положительных и нулевых элементов.

public class CountPosNegZero {
    public static void main(String[] args) {
        double[] arr = new double[]{2.2, 0, 5.2, -7.5, 8.7, 9.2, -11.11, 0, 14.44, -15.5, 17.8};
        int countPos = 0, countNeg = 0, countZero = 0;
        System.out.println("Исходный массив действительных чисел");
        for (double i : arr) {
            System.out.printf("[%4.2f] ", i);
            if (i > 0) {
                countPos++;
            }
            if (i < 0) {
                countNeg++;
            }
            if (i == 0) {
                countZero++;
            }
        }
        System.out.println();
        System.out.printf("Больше 0 -> %d\nМеньше 0 -> %d\nРавно 0 -> %d\n", countPos, countNeg, countZero);
    }
}
