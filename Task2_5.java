package Lesson2;

import java.util.Arrays;

public class Task2_5 {

    public static void main(String[] args) {

        int[] array = {30, 10, 274, 6, 8, 200};
        int max = 0;
        int min = array[1];

        System.out.println(Arrays.toString(array));

        for (int j : array) {

            if (j > max) {
                max = j;
            } else if (j < min) {
                min = j;
            }

        }
        System.out.println("Максимальное число в массиве = " + max);
        System.out.println("Минимальное число в массиве = " + min);
    }
}
