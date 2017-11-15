package lv.javaguru.homework.gravitrips;

//field, check field, is game finished?

public class Field {
    private Mark[][] field = new Mark[5][7];

    public Mark[][] getField() {
        return field;
    }

    public void setField(Mark[][] field) {
        this.field = field;
    }
}