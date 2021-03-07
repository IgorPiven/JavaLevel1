package Lesson2;


public class Task2_6 {

    public static void main(String[] args) {

        int[] array = {2, 2, 2, 1, 3, 1, 10, 1};

        System.out.println(checkBalance(array));
    }

    public static boolean checkBalance(int[] array) {

        int arrayLength = array.length - 1;
        int valLeft = array[0];
        int valRight = array[arrayLength];

        valLeft = valLeft + array[1];
        valRight = valRight + array[arrayLength - 1];

        for (int i = 2; i < arrayLength; i++) {

            if (valLeft == valRight) {
                return true;

            } else if (valLeft < valRight) {
                valLeft = valLeft + array[i];

            } else {
                valRight = valRight + array[arrayLength - i];
            }

        }
        return false;
    }

}









