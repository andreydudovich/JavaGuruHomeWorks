package lv.javaguru.homework.gravitrips;

//enum for our fields

enum  Mark {
    X("X"), O("O"), EMPTY("_");

    private String value;


    Mark (String value){
        this.value = value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString(){
        return this.value;
    }
}
