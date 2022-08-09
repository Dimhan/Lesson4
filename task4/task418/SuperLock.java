package com.epamjavaweb.task4.task418;
/*
Секретный замок для сейфа состоит из 10 расположенных в рад ячеек, в которые надо вставить
игральные кубики. Но дверь открывается только в том случае, когда в любых трех соседних ячейках сумма точек на
передних гранях кубиков равна 10. (Игральный кубик имеет на каждой грани от 1 до 6 точек). Напишите программу,
которая разгадывает код замка при условии, что два кубика уже вставлены в ячейки.
 */


public class SuperLock {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 6, 3, 5, 3, 1, 3, 2, 5};
        int cube1 = 2, cube2 = 3;
        boolean unlock = false;
        int sumCubes = 0;
        int sumCubesMid = 0;
        while (!unlock) {
            unlock = true;
            for (int i = 0; i < arr.length; i++) {
                if (i != cube1 & i != cube2) {
                    arr[i] = (int) (Math.random() * 6 + 1);
                }
                System.out.printf("[%d] ", arr[i]);
            }
            System.out.println();
            if ((cube1 == 0 | (cube1 > 0 & cube2 < 9)) & (cube2 - cube1 == 1)) {
                sumCubes = arr[cube1] + arr[cube2] + arr[cube2 + 1];
                System.out.printf("[%d] [%d] [%d]\n", arr[cube1], arr[cube2], arr[cube2 + 1]);
            } else if (cube2 - cube1 == 2) {
                sumCubes = arr[cube1] + arr[cube1 + 1] + arr[cube2];
                System.out.printf("[%d] [%d] [%d]\n", arr[cube1], arr[cube1 + 1], arr[cube2]);
            }
            if ((cube2 == 9 | (cube1 > 0 & cube2 < 9)) & (cube2 - cube1 == 1)) {
                sumCubesMid = arr[cube1 - 1] + arr[cube1] + arr[cube2];
                System.out.printf("[%d] [%d] [%d]\n", arr[cube1 - 1], arr[cube1], arr[cube2]);
            }

            if (sumCubes == 10 | sumCubesMid == 10) {
                System.out.println("The lock code is unraveled");
            } else {
                System.out.println("We must throw cubes again");
                unlock = false;
            }
        }
    }
}
