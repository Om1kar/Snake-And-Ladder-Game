package SnakeAndLadder;

/**
 * Snake Ladder Game By Java
 */
public class SnakeAndLadder {
    /**
     * @param -UC6-Report the number of times the dice was
     * played to win the game and also the position after every die role
     */
    public static final int NO_PLAY = 1;
    public static final int SNAKE = 2;
    public static final int LADDER = 3;

    public static void main(String[] args) {
        System.out.println("-----------------------------------");
        System.out.println("Welcome To Snake And Ladder Game");
        System.out.println("------------------------------------");

        int playerPosition = 0;
        int diceRolls = 0;//to count no of times dice rolls
        System.out.println("player at Position =" + playerPosition);

        while (playerPosition != 100) {
            playerPosition++;

            int rollDice = (int) Math.floor(Math.random() * 10) % 6 + 1;//to get number
            System.out.println("After Dice Rolls player gets =" + rollDice);
            diceRolls++;

            int options = (int) Math.floor(Math.random() * 10) % 3 + 1;
            System.out.println("player checks for options =" + options);

            switch (options) {
                case NO_PLAY:
                    System.out.println("players position =" + playerPosition);
                    System.out.println("-----------------------------------------------");
                    break;
                case SNAKE:
                    playerPosition = playerPosition - rollDice;
                    if (playerPosition >= 0) {
                        System.out.println("Players Current Position= " + playerPosition);
                        System.out.println("-----------------------------------------------");

                    } else {
                        playerPosition = 0;
                        System.out.println("players Current Position =" + playerPosition);
                        System.out.println("-------------------------------------------------");
                    }
                    break;
                case LADDER:
                    playerPosition = playerPosition + (rollDice * 2);
                    System.out.println("Player got Ladder");
                    System.out.println("Player's Position " + playerPosition);
                    System.out.println("---------------------------------------------------------");
                    break;

                default:
                    System.out.println("Player Wants to Quit The Game");
            }
        }
        System.out.println("Player Roll a Dice "+diceRolls+" Times");
        if (playerPosition >= 100) {
            System.out.println("======================================================");
            System.out.println("                PLAYER WON THE GAME                   ");
            System.out.println("======================================================");
            System.out.println();
        }
    }

}

