package lv.javaguru.homework;

/*
Запросите у пользователя целое число:
- если оно меньше 0 - вывести сообщение: Число отрицательное
- если число равно 0 - вывести сообщение: Число равно 0
- если число больше 0 - вывести сообщение: Число положительное
 */

import java.util.Scanner;

public class MoreOrLessOrEqual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert integer number:");
        int enteredNumber = Integer.valueOf(scanner.nextLine());
        if (enteredNumber < 0) {
            System.out.println("The entered number is negative!");
        } else if (enteredNumber == 0){
            System.out.println("The entered number is zero!");
        } else {
            System.out.printf("The number is positive!");
        }
        scanner.close();
    }
}
