/**
 * TicTacToc logic
 * Created by johnsabilla on 7/19/2017.
 */
public class TicTacToe
{
    /**
     *   0  |  1  |  2
     * -----------------
     *   3  |  4  |  5
     * -----------------
     *   6  |  7  |  8
     */

    protected char[] board;
    protected char userMarker;
    protected char aiMarker;
    protected char winner;
    protected char currentMarker;

    /**
     * TicTacToe constructor
     * @param userMarker character chosen for user
     * @param aiMarker character chosen for opponent
     */
    public TicTacToe(char userMarker , char aiMarker ) {
        this.userMarker = userMarker;
        this.aiMarker = aiMarker;
        this.winner = '-';
        this.board = setBoard();
        this.currentMarker = userMarker;
    }

    /**
     * Initialize board with '-' character. That character means
     * that it is empty. Since this is a blank board. We can let
     * any instance of the game use it. Hence the static keyword
     * @return Our array of 9 chars TicTacToe board
     */
    public static char[] setBoard(){
        char[] board = new char[9];

        for(int x = 0; x < board.length; x++) {
            board[x] = '-';
        }

        return board;
    }

    /**
     * check if the spot selected by the player is valid.
     * @param spot integer position on the board
     * @return true if the spot is unoccupied, false otherwise
     */
    public boolean playTurn(int spot){
        boolean isValid = withinRange(spot) && !isSpotTaken(spot);

        if(isValid) {
            board[spot - 1] = currentMarker;
            currentMarker = (currentMarker == userMarker) ? aiMarker : userMarker;
        }
        return isValid;
    }

    /**
     * Check if our spot is in range of the playable area 0 - 8
     * @param number user selected spot
     * @return true if spot is within range, false otherwise
     */
    public boolean withinRange(int number){
        return (number > 0 && number <= board.length);
    }

    /**
     * Check if user selected spot is empty (-)
     * @param spot user selected spot
     * @return true if spot is available, false otherwise
     */
    public boolean isSpotTaken(int spot) {
        return (board[spot-1] != '-');
    }

    public  void printBoard() {
        System.out.println();
        for(int x = 0; x < board.length; x++) {
            if(x % 3 == 0) {
                System.out.println();
                System.out.println("-------------");
            }
            System.out.print(" | " + board[x]);
        }
    }

    public static void printIndexBoard(){
        System.out.println();
        for(int x = 0; x < 9; x++) {
            if(x % 3 == 0) {
                System.out.println();
                System.out.println("-------------");
            }
            System.out.print(" | " + (x+1));
        }
    }

    /**
     * check if there is a winning state on the current board.
     * @return true if there is a winner, false otherwise.
     */
    public boolean isThereAWinner() {
        boolean diagonalsAndMiddles = (rightDi() || leftDi() || middleRow() || secondCol()) && board[4] != '-';
        boolean topAndFirst = (topRow() || firstCol()) && board[0] != '-';
        boolean bottomAndThird = (bottomRow() || thirdCol()) && board[8] != '-';

        if( diagonalsAndMiddles) {
            this.winner = board[4];
        } else if(topAndFirst) {
            this.winner = board[0];
        } else if (bottomAndThird) {
            this.winner = board[8];
        }

        return (diagonalsAndMiddles || topAndFirst || bottomAndThird);
    }

    /**
     * Checks if there if the characters on the top row are the same.
     * @return true if all are same, false otherwise.
     */
    public boolean topRow(){
        return (board[0] == board[1] && board[1] == board[2]);
    }

    /**
     * Checks if there if the characters on the middle row are the same.
     * @return true if all are same, false otherwise.
     */
    public boolean middleRow(){
        return (board[3] == board[4] && board[4] == board[5]);
    }

    /**
     * Checks if there if the characters on the bottom row are the same.
     * @return true if all are same, false otherwise.
     */
    public boolean bottomRow(){
        return (board[6] == board[7] && board[7] == board[8]);
    }

    /**
     * Checks if there if the characters on the first column are the same.
     * @return true if all are same, false otherwise.
     */
    public boolean firstCol(){
        return (board[0] == board[3] && board[3] == board[6]);
    }

    /**
     * Checks if there if the characters on the second column are the same.
     * @return true if all are same, false otherwise.
     */
    public boolean secondCol(){
        return (board[1] == board[4] && board[4] == board[7]);
    }

    /**
     * Checks if there if the characters on the third column are the same.
     * @return true if all are same, false otherwise.
     */
    public boolean thirdCol(){
        return (board[2] == board[5] && board[5] == board[8]);
    }

    /**
     * Checks if there if the characters on the right diagonal are the same.
     * @return true if all are same, false otherwise.
     */
    public boolean rightDi(){
        return (board[0] == board[4] && board[4] == board[8]);
    }

    /**
     * Checks if there if the characters on the left diagonal are the same.
     * @return true if all are same, false otherwise.
     */
    public boolean leftDi(){
        return (board[2] == board[4] && board[4] == board[6]);
    }

    /**
     * Checks if the board is filled and if we have a draw.
     * @return true if the game is draw, false otherwise.
     */
    public boolean isBoardFilled(){
        for(int x = 0; x < board.length; x++) {
            if(board[x] == '-'){
                return false;
            }
        }
        return true;
    }


    /**
     * Check if we have a winner and display appropriate text.
     * @return Winner text or if there is a draw, or if the game isn't over yet.
     */
    public String gameOver(){
        boolean didSomeoneWin = isThereAWinner();

        if(didSomeoneWin) {
            return "\n\nWe have  winnder! The winner is " + this.winner + "'s.";
        } else if (isBoardFilled()) {
            return "Draw: Game Over!";
        } else {
            return "Not over!";
        }
    }
}
