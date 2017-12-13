package lv.javaguru.homework.gravitrips;

public class HumanPlayer extends Player {

    InputOutput input = new InputOutput();

    @Override
    public int selectColumn() {
        System.out.println(getPlayerName() + "'s turn. Mark is: " + getMark());
        System.out.println("Enter number from 1 to 7");
        System.out.print(">> ");
        int insertedNumber = input.insertNumber();
        if (insertedNumber <= 7 && insertedNumber >= 0) {
            return insertedNumber - 1;
        } else {
            System.out.println("Number " + insertedNumber + " is wrong.");
            System.out.println();
            return selectColumn();
        }
    }
}
