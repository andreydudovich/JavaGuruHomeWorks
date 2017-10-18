package lv.javaguru.homework;

import java.util.Random;

/*
Написать консольную программу, которая генерит 3 случайных числа в диапазоне от 0 до 100,
выводит их на консоль и подсчитывает их сумму.
 */

public class SumOfThreeRandNum {
    public static void main(String[] args) {
        Random random = new Random();
        int randNumOne = random.nextInt(100);
        int randNumTwo = random.nextInt(100);
        int randNumThree = random.nextInt(100);
        System.out.println("1st rand number: " + randNumOne);
        System.out.println("2nd rand number: " + randNumTwo);
        System.out.println("3rd rand number: " + randNumThree);
        System.out.println("The sum of three random numbers is: " + (randNumOne+randNumTwo+randNumThree));
        }
    }
