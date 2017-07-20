import java.util.ArrayList;
import java.util.Random;

/**
 * Simple AI class
 * Created by johnsabilla on 7/19/2017.
 */
public class AI {

    /**
     * Picks a random spot on the board that is unoccupied.
     * @param game game object, active instance of the game
     * @return spot selected by the AI.
     */
    public int pickSpot(TicTacToe game) {
        ArrayList<Integer> choices = new ArrayList<>();

        for(int x = 0; x < 9; x++) {
            if(game.board[x] == '-') {
                choices.add(x + 1);
            }
        }

        Random rand = new Random();
        int choice = choices.get(Math.abs(rand.nextInt() % choices.size()));
        return choice;
    }
}
