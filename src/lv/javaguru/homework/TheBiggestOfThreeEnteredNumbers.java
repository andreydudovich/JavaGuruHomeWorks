package lv.javaguru.homework;

import java.util.Scanner;

/*
Написать консольную программу, которая запрашивает у пользователя три целых числа и выводит на консоль наибольшее из них.
Если все числа равны то вывести на консоль текст "A == B == С".
 */
public class TheBiggestOfThreeEnteredNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert number one, A:");
        int enteredNumberA = Integer.valueOf(scanner.nextLine());
        System.out.println("Please insert number two, B:");
        int enteredNumberB = Integer.valueOf(scanner.nextLine());
        System.out.println("Please insert number three, C:");
        int enteredNumberC = Integer.valueOf(scanner.nextLine());

        if (enteredNumberA > enteredNumberB) {
            if (enteredNumberA > enteredNumberC) {
                System.out.println("The biggest value is A: " + enteredNumberA);
            } else {
                System.out.println("The biggest value is C: " + enteredNumberC);
            }
        }
        if (enteredNumberB > enteredNumberA) {
            if (enteredNumberB > enteredNumberC) {
                System.out.println("The biggest value is B: " + enteredNumberB);
            } else {
                System.out.println("The biggest value is C: " + enteredNumberC);
            }
        }
        if (enteredNumberA == enteredNumberB && enteredNumberB == enteredNumberC){
            System.out.println("All numbers are equal. A == B == C");
        }
    }
}

