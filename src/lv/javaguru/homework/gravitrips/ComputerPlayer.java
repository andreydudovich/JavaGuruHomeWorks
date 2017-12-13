package lv.javaguru.homework.gravitrips;

import java.util.Random;

public class ComputerPlayer extends Player {
    @Override
    public int selectColumn() {
        Random random = new Random();
        return random.nextInt(7);
    }
}