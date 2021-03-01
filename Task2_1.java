package Lesson2;

import java.util.Arrays;

public class Task2_1 {

    public static void main(String[] args) {

        int[] array = {0, 0, 0, 0, 0, 0, 0, 1};

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) array[i] = 1;
            else array[i] = 0;
        }

        System.out.println(Arrays.toString(array));
    }
}
