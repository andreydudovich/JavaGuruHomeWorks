package homework;

import java.util.Scanner;

public class SecondLessonHomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = 0; //Starting point
        System.out.println("Please answer how many numbers you will insert?");
        int insertedNumbers = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < insertedNumbers; i++) {
            if (insertedNumbers > 0) {
                System.out.println("Insert next number!");
                int variable = Integer.valueOf(scanner.nextLine());
                if (variable > start) {
                    start = variable;
                }
            }
        }
        if (insertedNumbers < 1) {
            System.out.println("Don't be lazy. Please insert at least one number!");
        } else {
            System.out.println("The max inserted number is: " + start);
        }
    }
}
