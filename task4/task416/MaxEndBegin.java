package com.epamjavaweb.task4.task416;

//Даны действительные числа A1, A2,...,A2n. Найти max(A1+A2n,A2+A2n-1,...,An+An+1).

public class MaxEndBegin {
    public static void main(String[] args) {

        double[] arr = new double[]{2.2, 1, 5.2, -7.5, 8.7, 9.2, -11.11, 1.1, 14.44, -1.5, 17.8, 2.5, 5.5, -8.1};
        System.out.println("The initial sequence");
        for (double arrI : arr) {
            System.out.printf("[%4.2f] ", arrI);
        }
        System.out.println();
        System.out.println("The sequence after addition");
        for (int i = 0; i <= arr.length / 2 - 1; i++) {
            arr[i] = arr[i] + arr[arr.length - i - 1];
            System.out.printf("[%4.2f] ", arr[i]);
        }
        System.out.println();
        System.out.println("max(A1+A2n,A2+A2n-1,...,An+An+1)");
        double maxSum = arr[0];
        for (int j = 0; j <= arr.length / 2 - 1; j++) {
            if (maxSum < arr[j]) {
                maxSum = arr[j];
            }
        }
        System.out.println(maxSum);
    }
}
