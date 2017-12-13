package lv.javaguru.homework.gravitrips;

import java.util.Scanner;

public class InputOutput {
    private Scanner scanner = new Scanner(System.in);
    private int inputNumber;

    public int insertNumber() {
        inputNumber = scanner.nextInt();
        return inputNumber;
    }
}
