package lv.javaguru.homework.gravitrips;

//field, check field, is game finished?

import java.util.Arrays;

public class Field {
    public static final int ROW = 5;
    public static final int COLUMNS = 7;

    //Mark[][] field = new Mark[ROW][COLUMNS];

    Mark[][] field = new Mark[][] {
            new Mark[]{Mark.X, Mark.X, Mark.X, Mark.X, Mark.X, Mark.X, Mark.X},
            new Mark[]{Mark.X, Mark.X, Mark.X, Mark.X, Mark.X, Mark.X, Mark.X},
            new Mark[]{Mark.X, Mark.X, Mark.X, Mark.X, Mark.X, Mark.X, Mark.X},
            new Mark[]{Mark.X, Mark.X, Mark.X, Mark.X, Mark.X, Mark.X, Mark.X},
            new Mark[]{Mark.X, Mark.X, Mark.X, Mark.X, Mark.X, Mark.X, Mark.X}
    };

    public Mark[][] getField() {
        return field;
    }

    public void printField() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void setField(Mark[][] field) {
        this.field = field;
    }
}