package homework;

import java.util.Scanner;

public class Discriminant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("In order to find Discriminant I want from you 3 numbers: a, b and c.");
        System.out.println("Please insert a.");
        int aDisc = Integer.valueOf(scanner.nextLine());
        System.out.println("Please insert b.");
        int bDisc = Integer.valueOf(scanner.nextLine());
        System.out.println("Please insert c.");
        int cDisc = Integer.valueOf(scanner.nextLine());
        System.out.println("Your Discriminant is: " + (bDisc*bDisc - 4*aDisc*cDisc));
        scanner.close();
    }
}