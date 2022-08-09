package com.epamjavaweb.task4.task420;

//Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй элемент
//(освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.

public class CompressionArr {
    public static void main(String[] args) {

        int[] arr = new int[]{3, 4, 10, 4, 11, 3, 7, 44, 22, 9, 5};

        System.out.println("The source array");
        for (int arrI : arr) {
            System.out.printf("[%d] ", arrI);
        }
        System.out.println();

        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
        }

        int halfArr;
        if (arr.length % 2 == 0) {
            halfArr = arr.length / 2;
        } else {
            halfArr = arr.length / 2 + 1;
        }

        for (int k = halfArr; k < arr.length; k++) {
            arr[k] = 0;
        }

        System.out.println("The final array");
        for (int arrJ : arr) {
            System.out.printf("[%d] ", arrJ);
        }

    }
}
