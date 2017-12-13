package lv.javaguru.homework.gravitrips;

import java.util.Scanner;

public abstract class Player {

    static int playerCounter = 1;

    public Player() {
        Scanner scanner = new Scanner(System.in);
        if (playerCounter == 1) {
            System.out.println("Enter 1st player name.");
            playerCounter++;
        } else {
            System.out.println("Enter 2nd player name.");
        }
        System.out.print(">> ");
        setPlayerName(scanner.nextLine());
    }

    private String playerName;
    private Mark mark;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Mark getMark() {
        return mark;
    }

    public void setMark(Mark mark) {
        this.mark = mark;
    }

    public abstract int selectColumn();
}
