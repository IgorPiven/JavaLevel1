package Lesson3;


import java.util.Random;
import java.util.Scanner;


public class Task3_2 {

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static int CLUE_WORD_LENGTH = 15; // total length a word with "#" symbol when a clue is being shown

    public static void main(String[] args) {

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};

        String puzzleWord, userWord, gameResult;
        int arrayElement;
        int wordsLeft = words.length;

        System.out.println("Игра началась! Всего слов - " + wordsLeft);

        do {

            do {
                arrayElement = random.nextInt(words.length);
            } while (words[arrayElement] == null);

            puzzleWord = words[arrayElement];
            System.out.println(puzzleWord);

            do {
                System.out.print("Введите слово -> ");
                userWord = scanner.next();
                System.out.println("Вы ввели слово: " + userWord);

                gameResult = checkWord(puzzleWord, userWord);
                System.out.println(gameResult);

            } while (!puzzleWord.equals(gameResult));

            words[arrayElement] = null;
            wordsLeft--;

            if (wordsLeft == 0) {
                System.out.println("Все слова отгаданы. Игра окончена");
                break;
            }

            System.out.println("Осталось слов: " + wordsLeft);
            System.out.println("Поиграем еще? (1 - да / 0 - нет)");

        } while (scanner.next().equals("1"));

        System.out.println("Спасибо за игру!");
        scanner.close();
    }


    public static String checkWord(String puzzleWord, String userWord) {
        String clueWord = "";
        int wordLength;

        if (puzzleWord.length() > userWord.length()) wordLength = userWord.length();
        else wordLength = puzzleWord.length();

        if (puzzleWord.equals(userWord)) {
            System.out.println("Верно! Было загадано слово: ");
            clueWord = userWord;

        } else {
            for (int i = 0; i < wordLength; i++) {
                if (puzzleWord.charAt(i) == userWord.charAt(i)) {
                    clueWord = clueWord + puzzleWord.charAt(i);

                } else {
                    clueWord = clueWord + "#";
                }
            }
                int step = CLUE_WORD_LENGTH - clueWord.length();

                for (int i = 0; i < step; i++)
                    clueWord = clueWord + "#";

                System.out.println("Неверно. Подсказка:");
            }

            return clueWord;
        }


    }

