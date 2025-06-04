package lab3.game;

import java.util.Arrays;

public class Board {
    // TODO: encapsulate the representation of the tictactoe board and provide instance methods to access and update it

    private final char[][] board;

    //Constructs an empty 3x3 board.
    public Board() {
        board = new char[3][3];
        for (char[] row : board) {
            Arrays.fill(row, ' ');
        }
    }

    // TODO:
    //  - what methods do we need?
    //  - check row, column, diagonals for a win?
    //  - method to place the player symbol on the board(only of that position is not taken  so we have to add a check if the cell is free)
    //  - check if board is full, and we have no winner and its a draw
    //  - also here can create a method to print a board into console after each move

}


