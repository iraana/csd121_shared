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
    public char checkWinner() {
        //row
        for(int i=0; i<3; i++) {
            // checking for row win
            if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return board[i][0];
            }
            // checking for column win
            if (board[0][i] != ' ' && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                return board[0][i];
            }
            //diagonal: from top-left to bottom-right
            if (board[0][0]!=' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
                return board[0][0];
            }
            //diagonal: from top-right to bottom-left
            if (board[0][2]!=' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
                return board[0][2];
            }
        }
        return ' ';
    }
    //  - method to place the player symbol on the board(only of that position is not taken  so we have to add a check if the cell is free)
    public boolean placeMove(Position move, Player player) {
        int row = move.row();
        int col = move.col();

        if (board[row][col] != ' ') {
            return false;
        }
        return false;
    }
    //  - check if board is full, and we have no winner and its a draw
    public boolean isFull() {
        for (char[] row: board) {
            for (char cell : row) {
                if (cell == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
    // Draw conditions:
    // 1. The Board should be full - use isFull()
    // 2. There should not be any winner - checkWinner() == ''
    public boolean checkDraw() {
        return isFull() && checkWinner() == ' ';
        // 1. True && True -> True
        // 2. False && True -> False
    }
    //  - also here can create a method to print a board into console after each move
    public void printBoard() {
        System.out.println("Current State of Board");
        System.out.println("---------------------");
        for(int i=0; i<3; i++) {
            System.out.print("| ");
            for(int j=0; j<3; j++) {
                System.out.println(board[i][j] + " | ");
            }
            System.out.println("-------------------------");
        }
    }

    public char[][] getBoard() {
        return board;
    }

}

