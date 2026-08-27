import java.util.Scanner;

public class TicTacToe {
    private static final char PLAYER_X = 'X';
    private static final char PLAYER_O = 'O';
    
    private char[][] board;
    private char currentPlayer;

    public TicTacToe() {
        board = new char[3][3];
        currentPlayer = PLAYER_X;
        initializeBoard();
    }

    // Pre-fill the board with position numbers '1' through '9'
    public void initializeBoard() {
        char position = '1';
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = position++;
            }
        }
    }

    public void printBoard() {
        System.out.println("\n-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    // A move is valid if the input is 1-9 and the spot hasn't been taken by X or O
    public boolean placeMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }

        int row = (position - 1) / 3;
        int col = (position - 1) % 3;

        if (board[row][col] != PLAYER_X && board[row][col] != PLAYER_O) {
            board[row][col] = currentPlayer;
            return true;
        }

        return false;
    }

    public boolean checkWin() {
        for (int i = 0; i < 3; i++) {
            // Check Rows & Columns
            if ((board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) ||
                (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer)) {
                return true;
            }
        }
        // Check Diagonals
        if ((board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) ||
            (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer)) {
            return true;
        }
        return false;
    }

    // Board is full if no numeric positions remain
    public boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] != PLAYER_X && board[i][j] != PLAYER_O) {
                    return false;
                }
            }
        }
        return true;
    }

    public void changePlayer() {
        currentPlayer = (currentPlayer == PLAYER_X) ? PLAYER_O : PLAYER_X;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TicTacToe game = new TicTacToe();
        boolean gameRunning = true;

        System.out.println("=========================================");
        System.out.println("       AI LAB 1: TIC TAC TOE GAME        ");
        System.out.println("=========================================");

        while (gameRunning) {
            game.printBoard();
            System.out.println("Player " + game.currentPlayer + "'s turn.");
            System.out.print("Enter position (1-9): ");

            if (scanner.hasNextInt()) {
                int position = scanner.nextInt();

                if (game.placeMove(position)) {
                    if (game.checkWin()) {
                        game.printBoard();
                        System.out.println("Congratulations! Player " + game.currentPlayer + " wins!");
                        gameRunning = false;
                    } else if (game.isBoardFull()) {
                        game.printBoard();
                        System.out.println("It's a draw! Board is full.");
                        gameRunning = false;
                    } else {
                        game.changePlayer();
                    }
                } else {
                    System.out.println("Invalid move! Position is either taken or out of range (1-9). Try again.");
                }
            } else {
                System.out.println("Invalid input! Please enter a valid integer from 1 to 9.");
                scanner.next(); // Clear non-integer input
            }
        }
        scanner.close();
    }
}