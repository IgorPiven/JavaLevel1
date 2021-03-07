package Lesson3;

import java.util.Random;
import java.util.Scanner;

public class Task3_1 {

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    static int RANDOM_RANGE = 9;

    public static void main(String[] args) {

        int quantityAttempt = 3;

        do {
            int randomValue = random.nextInt(RANDOM_RANGE);

            if (!gamePlay(quantityAttempt, randomValue))
                System.out.println("К сожалению, попытки закончились. Было загадано число " + randomValue);
            else System.out.println("Верно! Действительно было загадано число " + randomValue);

            System.out.print("Поиграем еще раз (1 - да / 0 - нет)? -> ");

        } while (scanner.next().equals("1"));

        scanner.close();
    }


    public static boolean gamePlay(int quantityAttempt, int randomValue) {

        boolean gameStatus, userAnswerType;
        int userAnswer;
        int notNumberCheck = RANDOM_RANGE + 1;

        do {

            do {
                System.out.println("Введите число от 0 до " + RANDOM_RANGE);
                System.out.print("У вас попыток " + quantityAttempt + " -> ");

                if (scanner.hasNextInt()) {
                    userAnswer = scanner.nextInt();
                } else {
                    userAnswer = notNumberCheck;
                    scanner.next();
                }

                if (userAnswer < 0 || userAnswer > RANDOM_RANGE) {
                    System.out.println("Введено число не в диапазоне от 0 до " + RANDOM_RANGE + ". Попробуйте еще раз");
                    userAnswerType = false;
                } else {
                    userAnswerType = true;
                }

            } while (!userAnswerType);


            if (userAnswer < randomValue) {
                System.out.println("Нет, неверно. Загаданное число больше, чем " + userAnswer);
            } else if (userAnswer > randomValue) {
                System.out.println("Нет, неверно. Загаданное число меньше, чем " + userAnswer);
            } else {
                gameStatus = true;
                break;
            }
            quantityAttempt--;
            gameStatus = false;

        } while (quantityAttempt > 0);

        return gameStatus;
    }
}