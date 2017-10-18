package lv.javaguru.homework;

import java.util.Scanner;

/*
Написать консольную программу, которая запрашивает у пользователя три целых числа и выводит на консоль наибольшее из них.
Если все числа равны то вывести на консоль текст "A == B == С".
 */
public class TheBiggestOfThreeEnteredNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert number one, A:");
        int enteredNumberA = Integer.valueOf(scanner.nextLine());
        System.out.print("Please insert number two, B:");
        int enteredNumberB = Integer.valueOf(scanner.nextLine());
        System.out.print("Please insert number three, C:");
        int enteredNumberC = Integer.valueOf(scanner.nextLine());

        if((enteredNumberA == enteredNumberB) && (enteredNumberB == enteredNumberC)) {
            System.out.println("All numbers are equals. A == B == C!");
        } else if((enteredNumberA > enteredNumberB) && (enteredNumberA > enteredNumberC)) {
            System.out.println("The biggest value is A: " + enteredNumberA);
        } else if((enteredNumberB > enteredNumberA) && (enteredNumberB > enteredNumberC)) {
            System.out.println("The biggest value is B: " + enteredNumberB);
        } else if((enteredNumberB == enteredNumberA) && (enteredNumberB > enteredNumberC)) {
            System.out.println("The biggest values are B: " + enteredNumberB + " and A:" + enteredNumberC);
        } else if((enteredNumberA == enteredNumberC) && (enteredNumberA > enteredNumberB)) {
            System.out.println("The biggest values are A: " + enteredNumberA + " and C:" + enteredNumberC);
        } else if((enteredNumberB == enteredNumberC) && (enteredNumberB > enteredNumberA)) {
            System.out.println("The biggest values are B: " + enteredNumberB + " and C:" + enteredNumberC);
        } else {
            System.out.println("The biggest value is C: " + enteredNumberC);
        }

        scanner.close();
    }
}

