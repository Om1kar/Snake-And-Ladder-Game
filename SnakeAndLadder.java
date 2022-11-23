package SnakeAndLadder;

/**
 * Snake Ladder Game By Java
 */
public class SnakeAndLadder {
    /**
     * @param -UC3 The Player then checks for options
     * no play ,ladder and snake.
     */
    public static final int NO_PLAY = 1;
    public static final int Snake = 2;
    public static final int Ladder = 3;

    public static void main(String[] args) {
        System.out.println("-----------------------------------");
        System.out.println("Welcome To Snake And Ladder Game");
        System.out.println("------------------------------------");
        int playerPosition = 0;
        System.out.println("player at Position =" + playerPosition);

        int rollDice = (int) Math.floor(Math.random() * 10) % 6 + 1;
        System.out.println("After Dice Rolls players Position =" + rollDice);

        int options = (int) Math.floor(Math.random() * 10) % 3 + 1;
        System.out.println("player checks for options =" + options);

        switch (options) {
            case NO_PLAY:
                System.out.println("players position =" + rollDice);
                break;
            case Snake:
                playerPosition = playerPosition - rollDice;
                System.out.println("Player Got Snake and need to go back by "+playerPosition+ " Steps");
                break;
            case Ladder:
                playerPosition = playerPosition + (rollDice * 2);
                System.out.println("Player got Ladder");
                System.out.println("New position after getting Ladder = "+playerPosition);
                break;
            default:
                System.out.println("Player Wants to Quit The Game");
        }
    }

}
