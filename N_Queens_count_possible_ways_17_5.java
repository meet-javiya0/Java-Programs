public class N_Queens_count_possible_ways_17_5 {
    public static void nQueen(char board[][], int row) {
        // Base case for printing all possible ways
        if (row == board.length) {
            count++;
            return;
        }

        // Colummn loop for each row
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                nQueen(board, row + 1); // Function call for next row
                board[row][col] = 'x'; // Backtracking step for next column
            }
        }
    }

    public static boolean isSafe(char board[][], int row, int col) {
        // Vertical up for checking if queen is already placed in the same column
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Diagonal left up for checking if queen is already placed in that diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Diagonal right up for checking if queen is already placed in that diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // return true if queen is not placed in the same column or diagonal
        return true;
    }

    static int count = 0;

    public static void main(String args[]) {
        int n = 4;
        char board[][] = new char[n][n];

        // Initialize the board with 'x'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }

        // Function call
        nQueen(board, 0);
        System.out.println("Total possible ways = " + count);
    }
}

// T.C = O(n^n)
// S.C = O(n^2)