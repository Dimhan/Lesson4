package com.epamjavaweb.task4.task409;

//Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.

public class ChangeMinMax {
    public static void main(String[] args) {
        double[] arr = new double[]{2.2, 1, 5.2, -7.5, 8.7, 9.2, -11.11, 0, 14.44, -1.5, 17.8};
        double min, max, temp;
        System.out.println("Даны действительные числа ");
        for (double i : arr) {
            System.out.printf("[%4.2f] ", i);
        }
        System.out.println();
        min = arr[0];
        max = min;
        int iMax = 0, iMin = 0;
        for (int j = 1; j < arr.length; j++) {
            if (max < arr[j]) {
                max = arr[j];
                iMax = j;
            }
            if (min > arr[j]) {
                min = arr[j];
                iMin = j;
            }
        }
        temp = arr[iMin];
        arr[iMin] = arr[iMax];
        arr[iMax] = temp;
        System.out.println("Итоговый результат");
        for (double res : arr) {
            System.out.printf("[%4.2f] ", res);
        }
    }
}



