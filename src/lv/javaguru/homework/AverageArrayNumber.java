package lv.javaguru.homework;

import java.util.Random;

public class AverageArrayNumber {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int arrayAverage = getAverageValueOfRandomArray(arr);
        System.out.println("Average value of array is " + arrayAverage);
        System.out.println("There are a list of values that are bigger than average: ");
        for (int i = 0; i < 10; i++) {
            if (arr[i] > arrayAverage) {
                System.out.println(arr[i]);
            }

        }
    }
    public static int getAverageValueOfRandomArray(int[] arr) {
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            arr[i] = rand.nextInt(10);
        }
        int sumOfArray = 0;
        for (int i = 0; i < 10; i++) {
            sumOfArray = sumOfArray + arr[i];
        }
        int arrayAverage = sumOfArray / 10;
        return arrayAverage;
    }
}

