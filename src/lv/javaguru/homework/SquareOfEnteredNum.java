package lv.javaguru.homework;

import java.util.Scanner;

public class SquareOfEnteredNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number you want to square!");
        int enteredNum = Integer.valueOf(scanner.nextLine());
        System.out.println("Your entered number square is: " + enteredNum * enteredNum);
        scanner.close();
    }
}
