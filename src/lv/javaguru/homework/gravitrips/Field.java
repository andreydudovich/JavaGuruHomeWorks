package lv.javaguru.homework.gravitrips;

public class Field {
    private static final int ROW = 6;
    private static final int COLUMNS = 7;

    private Mark[][] field = new Mark[COLUMNS][ROW];

    public boolean wonHorizontal(Mark mark) {
        int count = 0;
        for (int row = 0; row < ROW; row++) {
            for (int col = 0; col < COLUMNS; col++) {
                if (field[col][row] == mark) {
                    count++;
                } else {
                    count = 0;
                }
                if (count == 4) {
                    return true;
                }
            }

        }
        return false;
    }

    public boolean wonkVertical(Mark mark) {
        int count = 0;
        for (int col = 0; col < COLUMNS; col++) {
            for (int row = 0; row < ROW; row++) {
                if (field[col][row] == mark) {
                    count++;
                } else {
                    count = 0;
                }
                if (count == 4) {
                    return true;
                }
            }
        }
        return false;
    }

    public void printField() {
        System.out.println(1 + " " + 2 + " " + 3 + " " + 4 + " " + 5 + " " + 6 + " " + 7);
        for (int row = 0; row < ROW; row++) {
            for (int col = 0; col < COLUMNS; col++) {
                System.out.print(field[col][row] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void fillFieldByEmptyValues() {

        for (int row = 0; row < ROW; row++) {
            for (int col = 0; col < COLUMNS; col++) {
                field[col][row] = Mark.EMPTY;
            }
        }
    }

    public void setField(int move, int emptyField, Mark mark) {
        field[move][emptyField] = mark;
    }

    public Mark getField(int col, int row) {
        return field[col][row];
    }

    public int getFirstEmptyField(int move) {
        int row = 5;
        while ((row >= 0) && (field[move][row] != (Mark.EMPTY))) {
            row--;
        }
        return row;
    }

    public boolean isColumnFull(int slot) {

        if (slot < 0) {
            System.out.println("Column is full");
        }
        return (slot >= 0);
    }

    public boolean draw() {
        boolean draw = false;
        int i = 0;
        while (!draw && i < COLUMNS) {
            if (field[i][0].equals(Mark.EMPTY)) {
                draw = true;
            }
            i++;
        }
        if (!draw) {
            System.out.println("Draw. Play new game if you want.");
        }
        return draw;
    }
}