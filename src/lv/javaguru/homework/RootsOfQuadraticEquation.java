package lv.javaguru.homework;
/*Для вычисления корней: программа должна запросить у пользователя три числа: a, b, c.
    Если D >= 0 то вычислить корни и вывести их на консоль,
    а если D < 0 то вывести на консоль "корней на множестве действительных чисел нет".
     */

import java.util.Scanner;

public class RootsOfQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("In order to find roots of Quadratic Equation please insert 3 numbers: a, b and c.");
        System.out.println("Please insert a.");
        int aDisc = Integer.valueOf(scanner.nextLine());
        System.out.println("Please insert b.");
        int bDisc = Integer.valueOf(scanner.nextLine());
        System.out.println("Please insert c.");
        int cDisc = Integer.valueOf(scanner.nextLine());
        int Discriminant = bDisc * bDisc - 4 * aDisc * cDisc;
        if (Discriminant >= 0) {
            double x1 = (-bDisc + Math.sqrt(Discriminant)) / (2 * aDisc);
            double x2 = (-bDisc - Math.sqrt(Discriminant)) / (2 * aDisc);
            System.out.println("1st Root x1 is: " + x1);
            System.out.println("2nd Root x2 is: " + x2);
        } else {
            System.out.println("There is no real roots for this Quadratic Equation. Sorry :(");
        }
        scanner.close();
    }
}
