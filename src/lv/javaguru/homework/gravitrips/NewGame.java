package lv.javaguru.homework.gravitrips;

public class NewGame {

    private Field field;
    private Player player1;
    private Player player2;
    private Player currentPlayer;

    public NewGame(Player inPlayer1, Player inPlayer2) {
        player1 = inPlayer1;
        player1.setMark(Mark.X);
        player2 = inPlayer2;
        player2.setMark(Mark.O);
        field = new Field();
        welcomePlayers();
        startGame();
    }

    public void welcomePlayers() {
        System.out.println("Welcome " + player1.getPlayerName());
        System.out.println("Welcome " + player2.getPlayerName());
        System.out.println("Game starts!");
        System.out.println();
        field.fillFieldByEmptyValues();
        field.printField();
    }

    public void startGame() {
        switchPlayers();
        while (isWinner(currentPlayer.getMark()) && field.draw()) {
            int selectColumn = 0;
            int freeField = 0;
            boolean invalidMove = false;
            switchPlayers();
            while (!invalidMove) {
                selectColumn = currentPlayer.selectColumn();
                freeField = field.getFirstEmptyField(selectColumn);
                invalidMove = field.isColumnFull(freeField);
            }
            field.setField(selectColumn, freeField, currentPlayer.getMark());
            field.printField();
        }
    }

    public void switchPlayers() {
        if (currentPlayer == player2) {
            currentPlayer = player1;
        } else {
            currentPlayer = player2;
        }
    }

    public boolean isWinner(Mark mark) {
        if (field.wonHorizontal(mark) || field.wonkVertical(mark)) {
            System.out.println("Today win - " + currentPlayer.getPlayerName() + "! Congratulation.");
            return false;
        }
        return true;
    }
}
