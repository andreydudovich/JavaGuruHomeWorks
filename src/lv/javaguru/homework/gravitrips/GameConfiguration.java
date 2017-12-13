package lv.javaguru.homework.gravitrips;

public class GameConfiguration {

    public GameConfiguration() {
        System.out.println("Hello, my friend. To start game please specify game configuration!");
        System.out.println("Press 1 for game 'Human vs Computer'");
        System.out.println("Press 2 for game 'Computer vs Computer'");
        System.out.println("Press 3 for game 'Human vs Human'");
        System.out.println("Press 4 for game 'Computer vs Human'");
        System.out.print(">> ");
    }

    private static final int HUMAN_VS_COMPUTER = 1;
    private static final int COMPUTER_VS_COMPUTER = 2;
    private static final int HUMAN_VS_HUMAN = 3;
    private static final int COMPUTER_VS_HUMAN = 4;

    private InputOutput input = new InputOutput();

    public void gameRun() {
        switch (input.insertNumber()) {
            case HUMAN_VS_COMPUTER:
                System.out.println("Configuration: Human vs Computer");
                NewGame game1 = new NewGame(new HumanPlayer(), new ComputerPlayer());
                break;
            case COMPUTER_VS_COMPUTER:
                System.out.println("Configuration: Computer vs Computer");
                NewGame game2 = new NewGame(new ComputerPlayer(), new ComputerPlayer());
                break;
            case HUMAN_VS_HUMAN:
                System.out.println("Configuration: Human vs Human");
                NewGame game3 = new NewGame(new HumanPlayer(), new HumanPlayer());
                break;
            case COMPUTER_VS_HUMAN:
                System.out.println("Configuration: Computer vs Human");
                NewGame game4 = new NewGame(new ComputerPlayer(), new HumanPlayer());
                break;
            default:
                System.out.println("Wrong input. Please insert number from 1 to 4.");
                System.out.print(">> ");
                gameRun();
                break;
        }
    }
}
