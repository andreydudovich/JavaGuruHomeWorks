package lv.javaguru.homework;

import java.util.Scanner;

public class FixErrorFromExercise3point4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        System.out.print("Enter third number: ");
        int thirdNumber = scanner.nextInt();

        if((firstNumber == secondNumber) && (secondNumber == thirdNumber)) {
            System.out.println("All numbers are equals!");
        } else if((firstNumber > secondNumber) && (firstNumber > thirdNumber)) {
            System.out.println("The first number is the greatest!");
        } else if((secondNumber > firstNumber) && (secondNumber > thirdNumber)) {
            System.out.println("The second number is the greatest!");
        } else if((secondNumber == firstNumber) && (secondNumber > thirdNumber)) {
            System.out.println("The second and first numbers are the greatest!");
        } else if((firstNumber == thirdNumber) && (firstNumber > secondNumber)) {
            System.out.println("The first and third numbers are the greatest!");
        } else if((secondNumber == thirdNumber) && (secondNumber > firstNumber)) {
            System.out.println("The second and third numbers are the greatest!");
        } else {
            System.out.println("The third number is the greatest!");
        }
    }
}
