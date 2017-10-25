package lv.javaguru.homework;
/*
Угадайка отгадывает

1. Пользователь загадывает число от 1 до 100.
2. Программа выводит число. Пользователь отвечает, было ли это число больше,меньше или равно загаданному.
3. Если число не отгадано, переход к шагу 2.

Возможны 2 реализации:
1. Программа стремится сделать минимальное число ходов.
2. Программа делает случайные ходы.
В любом случае предполагаем, что пользователь не обманывает программу, т.е. если пользователь на число 50 ответил, что загаданное число больше, то программа не должна называть числа меньше 51.
 */

import java.util.Random;
import java.util.Scanner;

public class GuessGameHardMinSteps {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("User please guess a number between 1 and 100. Enter it: ");
        int guessNumber = Integer.valueOf(scanner.nextLine());
        int leftBorder = 1;
        int rightBorder = 101; //Так как если будет 100, то мой "умный алгоритм будет выдавать 99 99 99 в конце из-за деления на 2."
        int computerGuessNumber = (rightBorder - leftBorder + 1) / 2; //smart value :D
        String userAnswer = ""; //оооочень не нравится, как сделать лучше?
        if (guessNumber >= 1 && guessNumber <= 100) {
            computerGuessNumber(computerGuessNumber);
            userAnswer = scanner.nextLine();
        } else {
            wrongGuessNumberInserted(guessNumber);
        }
        while ((guessNumber >= 1 && guessNumber <= 100) && guessNumber != computerGuessNumber) {
            if (userAnswer.equals("More")) {
                leftBorder = computerGuessNumber;
                computerGuessNumber = smartAlgoritmToGetGuessNumber(rightBorder, leftBorder);
            } else if (userAnswer.equals("Less")) {
                rightBorder = computerGuessNumber;
                computerGuessNumber = smartAlgoritmToGetGuessNumber(rightBorder, leftBorder);
            }
            computerGuessNumber(computerGuessNumber);
            userAnswer = scanner.nextLine();
        }
        if (userAnswer.equals("Equal")) {
            winningOutput(computerGuessNumber);
        }
    }

    public static int smartAlgoritmToGetGuessNumber(int rightBorder, int leftBorder) {
        int rangeMiddle = (rightBorder - leftBorder) / 2;
        int computerGuessNumber = leftBorder + rangeMiddle;
        return computerGuessNumber;
    }
    public static void computerGuessNumber(int computerGuessNumber) {
        System.out.println("Computer thinks it is number: " + computerGuessNumber);
        System.out.print("Is your number Less, More or Equal: ");
    }
    public static void winningOutput(int computerGuessNumber) {
        System.out.println("Game ends. Computer WINs! Guess number is correct: " + computerGuessNumber);
    }
    public static void wrongGuessNumberInserted(int guessNumber) {
        System.out.println("User please don't cheat! Enter number between 1 and 100! The number " + guessNumber + " is wrong.");
    }
}
