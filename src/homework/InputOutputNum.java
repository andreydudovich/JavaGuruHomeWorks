package homework;

import java.util.Scanner;

public class InputOutputNum {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number!");
        int enteredNum = Integer.valueOf(scanner.nextLine());
        System.out.println("You have entered: " + enteredNum);
        scanner.close();
    }
}
