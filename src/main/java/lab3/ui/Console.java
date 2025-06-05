package lab3.ui;
import java.util.Scanner;
public class Console {

    // Static Scanner object "sc" to take inputs
    public static Scanner sc = new Scanner(System.in);
    // TODO: create a CLASS method to display a tictactoe board
    public static void printBoard(char[][] board) {
        System.out.println("---------------------");
        for(int i=0; i<3; i++) {
            System.out.print("| ");
            for(int j=0; j<3; j++) {
                System.out.println(board[i][j] + " | ");
            }
            System.out.println("-------------------------");
        }
    }
    // TODO: create a CLASS method to get the next move from a player
    public static int[] getNextMove(char player) {
        System.out.println("Player " + player + ", please enter your move (0,1,2): ");
        int row=-1, col=-1; // initializing row and col with defaul values.

        // looping using while
        while (true) {
            // try block: for exception handling
            try {
                row = sc.nextInt(); // taking user input for row
                col = sc.nextInt(); // taking user input for col

                // checking for upper and lower limits, MAX:3
                if (row >= 0 && row < 3 && col >= 0 && col < 3) {
                    break;
                }
                // in-case of error
                else {
                    System.out.println("Invalid input. Available options are: 0, 1 and 2.");
                }
            }
            catch(Exception e) {
                System.out.println(e.getMessage()); // printing stack-trace.
            }
        }
        return new int[] {row, col}; // return row and col values to occupy space on the board.
    }
}
