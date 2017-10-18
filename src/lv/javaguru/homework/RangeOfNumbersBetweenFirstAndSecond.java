package lv.javaguru.homework;
/*
Написать консольную программу, которая запрашивает у пользователя два числа.

Если первое число меньше второго то при помощи цикла for
вывести на консоль числа от первого до второго.
 */

import java.util.Scanner;

public class RangeOfNumbersBetweenFirstAndSecond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert your 1st number: ");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.print("Please insert your 2nd number: ");
        int secondNumber = Integer.valueOf(scanner.nextLine());
        if (firstNumber < secondNumber) {
            for (int i = firstNumber + 1; i < secondNumber; i++) {
                System.out.println("Number between 1st and 2nd: " + i);
            }
        } else {
            System.out.println("Sorry, but your 1st number is greater than 2nd.");
        }
    }
}
