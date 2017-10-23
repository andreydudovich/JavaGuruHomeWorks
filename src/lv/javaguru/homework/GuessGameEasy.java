package lv.javaguru.homework;
/*
Загадайка - загадывает

1. Программа загадывает число от 1 до 100 случайным образом.
2. Пользователь вводит число. Программа отвечает, было ли это число больше,меньше или равно загаданному.
3. Если число не отгадано, переход к шагу 2.
 */

import java.util.Random;
import java.util.Scanner;

public class GuessGameEasy {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int guessNumber = random.nextInt(100) + 1; //Программа загадывает число от 1 до 100 случайным образом.
        System.out.println("The computer makes a guess number. Try to find out it.");
        System.out.print("Enter guess number: ");
        int playerEnteredNumber = Integer.valueOf(scanner.nextLine());
        while (guessNumber != playerEnteredNumber){
            if (guessNumber > playerEnteredNumber){
                System.out.print("Guess number is greater! Try again: ");
                playerEnteredNumber = Integer.valueOf(scanner.nextLine());
            } else if (guessNumber < playerEnteredNumber){
                System.out.print("Guess number is smaller! Try again: ");
                playerEnteredNumber = Integer.valueOf(scanner.nextLine());
            }
        }
        if (guessNumber == playerEnteredNumber) {
            System.out.println("You WIN! Guess number is correct: " + playerEnteredNumber);
        }
    }

}
