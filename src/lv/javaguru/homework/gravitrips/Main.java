package lv.javaguru.homework.gravitrips;

//Class for run game

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        //game.run();
        game.field.printField();
        game.field.fillFieldByEmptyValues();
        game.field.printField();
        game.field.test();
        game.field.printField();
        boolean wonHorizontal = game.field.wonHorizontal(0, Mark.O);
        System.out.println("Won horizontal: " + wonHorizontal);
        boolean wonVertical = game.field.wonVertical(1, Mark.X);
        System.out.println("Won vertical: " + wonVertical);
    }
}
