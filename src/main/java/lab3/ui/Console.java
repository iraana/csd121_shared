package lab3.ui;
import lab3.game.*;

import java.util.Scanner;
public class Console {

    // Static Scanner object "sc" to take inputs
    public static Scanner sc = new Scanner(System.in);

    // TODO: create a CLASS method to display a tictactoe board
    public static void printBoard(char[][] board) {
        System.out.println("---------------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println(); // Move to the next row
            System.out.println("---------------------");
        }
    }

    public static void initializeGame(){
        int playerChoice;
        Player player = null;
        Board board = new Board();
        Scanner sc = new Scanner(System.in);

        System.out.println("Tic Tac Toe Time!");
        System.out.println("1 for X, 2 for O!  ");
        playerChoice = sc.nextInt();

        if (playerChoice == 1) {
            player = Player.X;
        }
        else if (playerChoice == 2) {
            player = Player.O;
        }
        else{
            System.out.println("Invalid Input!");
            initializeGame();
        }

        assert player != null;
        System.out.println("Starting player: " + player.getSymbol());

        printBoard(board.getBoard());
        getNextMove(player.getSymbol());

    }

    // TODO: create a CLASS method to get the next move from a player
    public static void getNextMove(char player) {
        Column col = null;
        Row row = null;
        Board board = new Board();
        Position position = new Position(row, col);

        System.out.println("Let's get your move, choose the column your playing. Between 0, 1 and 2");
        int columnChoice = sc.nextInt();
        col = Column.userInputForColumn(columnChoice);

        System.out.println("Let's get your move, choose the row your playing. Between 0, 1 and 2");
        int rowChoice = sc.nextInt();
        row = Row.userInputForRow(rowChoice);


        if (board.placeMove(position, player)) {
            char winner = board.checkWinner();
            if (winner == currentPlayer.getSymbol()) {
                board.printBoard();
                console.showWinner(currentPlayer);
                    }
            else if (board.checkDraw()) {
                board.printBoard();
                console.showDraw();
                }
            currentPlayer = currentPlayer.next();

    }



}


