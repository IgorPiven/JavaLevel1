package Lesson2;

import java.util.Arrays;


public class Task2_7 {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        int step = 2;

        System.out.println(Arrays.toString(array));

        moveArray(array, step);

        System.out.println(Arrays.toString(array));
    }

    private static int[] moveArray(int[] a, int x) {

        int n = Math.abs(x);
        int tempValue = 0;

        if (x > 0) x = a.length - 1;
        else x = 0;

        for (int i = 1; i <= n; i++) {

            for (int j = 0; j < a.length - 1; j++) {
                tempValue = a[Math.abs(x - j)];
                a[Math.abs(x - j)] = a[Math.abs(x - (j + 1))];
                a[Math.abs(x - (j + 1))] = tempValue;

            }

        }

        return a;
    }
}

