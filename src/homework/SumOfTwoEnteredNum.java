package homework;

import java.util.Scanner;

public class SumOfTwoEnteredNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number!");
        int firstEnteredNum = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter 2nd number!");
        int secondEnteredNum = Integer.valueOf(scanner.nextLine());
        System.out.println(firstEnteredNum + secondEnteredNum);
        scanner.close();
    }
}
