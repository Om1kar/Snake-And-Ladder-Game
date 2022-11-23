package SnakeAndLadder;

/**
 * Snake Ladder Game By Java
 */
public class SnakeAndLadder {
    /**
     * @param -UC2 The Player rolls the die
     *             to get a number.
     */
    public static void main(String[] args) {
        System.out.println("Welcome To Snake And Ladder Game");
        int playerPosition = 0;
        System.out.println("player at Position=" + playerPosition);

        int rollDice = (int) Math.floor(Math.random() * 10) % 6 + 1;
        System.out.println("After Dice Rolls players Position=" + rollDice);
    }

}
