package Lesson2;

public class Task2_4 {

    public static void main(String[] args) {

        int arraySize = 5;
        int[][] matrixArray = new int[arraySize][arraySize];

        for (int i = 0; i < matrixArray.length; i++) {
            for (int j = 0; j < matrixArray.length; j++) {

                if (i == j || j == matrixArray.length - (i + 1)) {
                    matrixArray[i][j] = 1;
                } else {
                    matrixArray[i][j] = 0;
                }

                System.out.print(matrixArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
