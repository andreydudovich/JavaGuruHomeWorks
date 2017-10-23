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
        int computerGuessNumber = random.nextInt(100) + 1; //Программа пытается угадать число от 1 до 100 случайным образом.
        //String userAnswer;

        if ((guessNumber < 1 || guessNumber > 100) && guessNumber !=computerGuessNumber) {
            System.out.println("User please don't cheat! Enter number between 1 and 100!");
        } else {
            System.out.println("Computer thinks it is number: " + computerGuessNumber);
            System.out.print("Is your number Less or More: ");
            String userAnswer = scanner.nextLine();
            while (guessNumber != computerGuessNumber) {
                if (userAnswer.equals("Less")) {
                    System.out.println("Then maybe guess number is: " + computerGuessNumber);
                    System.out.print("Is your number Less or More? ");
                    userAnswer = scanner.nextLine();
                    computerGuessNumber--; //Глупо, я знаю. Андрей, если ты это читаешь, то я еще напишу отдельный метод для этого, более умный. Запушил, так как писал на рабочем компе, а доступ надо дома.
                } else if (userAnswer.equals("More")) {
                    System.out.println("Then maybe guess number is: " + computerGuessNumber);
                    System.out.print("Is your number Less or More? ");
                    userAnswer = scanner.nextLine();
                    computerGuessNumber++; //Глупо, я знаю. Андрей, если ты это читаешь, то я еще напишу отдельный метод для этого, более умный. Запушил, так как писал на рабочем компе, а доступ надо дома.
                } else {
                    System.out.print("You made an error. Please insert Less or More: ");
                    userAnswer = scanner.nextLine();
                }
            }
        }
        if (guessNumber == computerGuessNumber) {
            System.out.println("Computer thinks it is number: " + computerGuessNumber);
            System.out.println("Game ends. Computer WINs! Guess number is correct: " + computerGuessNumber);
        }
    }
}
