package lv.javaguru.homework.Coderetrieve;

import java.util.Arrays;

public class Main {

    static int [][] field = new int [][] {
        new int[]{0, 0, 0, 1, 0},
        new int[]{0, 1, 0, 1, 0}
    };

    static void printMe() {
        for(int [] array:field){
            System.out.println(Arrays.toString( array ));
        }
        System.out.println();
    }

    static void doWaterDrop(int row, int col) {
        if (col == 0 && field[row][col] == 2) {
            field[row][col] = 0;
            return;
        }

        //need to improve if, to check that we are on button but still on field
        if (field.length == row+1) {
            return;
        }

        // bottom
        if (field[row +1][col] == 0){
            field[row+1][col] = 2;
            field[row][col] = 0;
            return;
        }

        if (field[row][col-1] == 0){
            field[row][col-1] = 2;
            field[row][col] = 0;
            return;
        }

        // right corner
        if (field[row].length <= col+1) {
            field[row][col] = 0;
            return;
        }
    }

    public static void main(String[] args) {
        field[0][0] = 2;
        field[0][2] = 2;
        field[0][1] = 2;
        printMe();
        doWaterDrop(0, 0);
        printMe();
        doWaterDrop(1, 0);
        printMe();
        doWaterDrop(0,2);
        printMe();
        doWaterDrop(1,2);
        printMe();
        doWaterDrop(0, 1);
        printMe();
        doWaterDrop(0,0);
        printMe();
        doWaterDrop(0,4);
        printMe();
        doWaterDrop(1,4);
        printMe();
    }


}
