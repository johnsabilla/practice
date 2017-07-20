import java.util.Scanner;

/**
 * Simple TicTacToe game
 * Created by johnsabilla on 7/19/2017.
 */
public class TicTacToeApp
{
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean doYouWantToPlay = true;

        while(doYouWantToPlay) {

            System.out.println("Welcome to Tic Tac Toe! You are about to go against the master of TicTacToe! \n " +
                    "Are you ready?! \n" +
                    "Pic a character you want to be and which character I will be");
            System.out.println();
            System.out.println("Enter a single character that will represent you on the board:");
            char playerToken = scanner.next().charAt(0);
            System.out.println("Enter a single character that will represent your opponent");
            char opponentToken = scanner.next().charAt(0);

            TicTacToe game = new TicTacToe(playerToken, opponentToken);
            AI ai = new AI();
            System.out.println("\n Now we can start the game. To play, enter a number and your token shall be put " +
                    "in its place.\n" +
                    "The numbers go from 1-9, left to right. We shall see who will win this round.");
            TicTacToe.printIndexBoard();

            System.out.println();
            while(game.gameOver().equals("Not over!")){

                if(game.currentMarker == game.userMarker) {
                    System.out.println("\n\nIt's your turn. Claim a spot");
                    int spot = scanner.nextInt();

                    while(!game.playTurn(spot)) {
                        System.out.println("\n\nTry again. " + spot + "is invalid. This spot is already taken" +
                                " or it is out of range");
                    }
                    System.out.println("You picked" + spot + "!");
                } else {
                    System.out.println("It is my turn.");
                    int aiSpot = ai.pickSpot(game);
                    game.playTurn(aiSpot);
                    System.out.println("I picked " + aiSpot + "!\n\n");

                }
                game.printBoard();
            }

            System.out.println(game.gameOver());
            System.out.println();
            System.out.println("\nDo you want to play again (Y/n)?");
            char response = scanner.next().charAt(0);
            doYouWantToPlay = (response == 'Y') ? true : false;

        }
    }

}
