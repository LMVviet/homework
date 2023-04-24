import java.util.Scanner;

public class TicTacToe {
    private static final int SIZE = 3;
    private static char[][] board = new char[SIZE][SIZE];
    private static char currentPlayer = 'X';

    public static void main(String[] args) {
        initializeBoard();
        boolean gameOver = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Tic-Tac-Toe!");

        while (!gameOver) {
            printBoard();
            System.out.println("Nguoi " + currentPlayer + ", nhap dong cot de di chuyen: ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (isValidMove(row, col)) {
                makeMove(row, col);
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            } else {
                System.out.println("Nhap sai! Hay nhap lai: ");
            }

            gameOver = checkGameOver();
        }

        scanner.close();
        printBoard();
        System.out.println("Game over!");
    }

    private static void initializeBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = '-';
            }
        }
    }

    private static void printBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean isValidMove(int row, int col) {
        return row >= 0 && row < SIZE && col >= 0 && col < SIZE && board[row][col] == '-';
    }

    private static void makeMove(int row, int col) {
        board[row][col] = currentPlayer;
    }

    /**
     * @return
     */
    private static boolean checkGameOver() {
        // Check rows
        for (int i = 0; i < SIZE; i++) {
            if (board[i][0] != '-' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                System.out.println("nguoi choi " + currentPlayer + " thang!");
                return true;
            }
        }

        // Check columns
        for (int i = 0; i < SIZE; i++) {
            if (board[0][i] != '-' && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                System.out.println("Nguoi choi " + currentPlayer + " thang!");
                return true;
            }
        }

        // Check diagonals
        if (board[0][0] != '-' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            System.out.println("Nguoi choi " + currentPlayer + " thang!");
            return true;
        }

        if (board[0][2] != '-' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            System.out.println("Nguoi choi " + currentPlayer + " thang!");
            return true;
        }

        // Check for a draw
        boolean draw = true;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == '-') {
                    draw = false;
                }
            }
        }
        return draw;
    }
}
