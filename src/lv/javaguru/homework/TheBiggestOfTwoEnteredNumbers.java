package lv.javaguru.homework;

import java.util.Scanner;

/*
Написать консольную программу, которая запрашивает у пользователя два целых числа и выводит на консоль наибольшее из них.
Если числа равны то вывести на консоль текст "A == B".
 */
public class TheBiggestOfTwoEnteredNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert number one, A:");
        int enteredNumberA = Integer.valueOf(scanner.nextLine());
        System.out.println("Please insert number two, B:");
        int enteredNumberB = Integer.valueOf(scanner.nextLine());
        if (enteredNumberA > enteredNumberB) {
            System.out.println("The biggest entered number is A: " + enteredNumberA);
        } else if (enteredNumberA == enteredNumberB){
            System.out.println("The entered numbers are equal. A==B!");
        } else {
            System.out.printf("The biggest entered number is B: " + enteredNumberB);
        }
    }
}
