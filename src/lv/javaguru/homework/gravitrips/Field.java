package lv.javaguru.homework.gravitrips;

//field, check field, is game finished?

import java.util.Arrays;

public class Field {
    public static final int ROW = 6;
    public static final int COLUMNS = 7;

     Mark[][] field = new Mark[ROW][COLUMNS];

    public void test() {

        field[0][1] = Mark.X;
        field[1][1] = Mark.X;
        field[2][1] = Mark.X;
        field[3][1] = Mark.X;
    }


    public boolean isPlayerWon(int row){

        return true;

    }

    public boolean wonHorizontal(int row, Mark mark) {
        int count = 0;
        for (int column = 0; column < COLUMNS; column++) {
            if (field[row][column] == mark) {
                count++;
            } else {
                count = 0;
            }
            if (count == 4) {
                return true;
            }
        }
        return false;
    }

    public boolean wonVertical(int column, Mark mark) {
        int count = 0;
        for (int row = 0; row < ROW; row++) {
            if (field[row][column] == mark) {
                count++;
            } else {
                count = 0;
            }
            if (count == 4) {
                return true;
            }
        }
        return false;
    }

    public void printField() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void fillFieldByEmptyValues() {

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = Mark.EMPTY;
            }
        }
    }

    public Mark[][] getField() {
        return field;
    }

    public void setField(Mark[][] field) {
        this.field = field;
    }
}