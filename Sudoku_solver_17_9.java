public class Sudoku_solver_17_9 {
    public static boolean solveSudoku(int[][] board, int row, int col) {
        // base case
        if (row == board.length) {
            return true;
        }

        // recursive case
        int nextRow = row, nextCol = col + 1;
        if (nextCol == board[row].length) {
            nextRow = row + 1;
            nextCol = 0;
        }

        // if the current cell is not empty, skip it
        if (board[row][col] != 0) {
            return solveSudoku(board, nextRow, nextCol);
        }

        // if the current cell is empty, try to fill it with a digit
        for (int digit = 1; digit <= 9; digit++) {
            if (validToAdd(board, row, col, digit)) {
                board[row][col] = digit;
                if (solveSudoku(board, nextRow, nextCol)) {
                    return true;
                }
                board[row][col] = 0;
            }
        }
        return false;
    }

    public static boolean validToAdd(int board[][], int row, int col, int digit) {
        // for the current column
        for (int i = 0; i < board.length; ++i) {
            if (digit == board[i][col]) {
                return false;
            }
        }

        // for the current row
        for (int j = 0; j < board[row].length; ++j) {
            if (digit == board[row][j]) {
                return false;
            }
        }

        // for the current grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; ++i) {
            for (int j = sc; j < sc + 3; ++j) {
                if (digit == board[i][j]) {
                    return false;
                }
            }
        }

        // if the digit is not present in the current row, column or grid, then it is
        // valid to add
        return true;
    }

    public static void printSudoku(int[][] board) {
        for (int[] row : board) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int sudoku[][] = { { 5, 3, 0, 0, 7, 0, 0, 0, 0 },
                { 6, 0, 0, 1, 9, 5, 0, 0, 0 },
                { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
                { 8, 0, 0, 0, 6, 0, 0, 0, 3 },
                { 4, 0, 0, 8, 0, 3, 0, 0, 1 },
                { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
                { 0, 6, 0, 0, 0, 0, 2, 8, 0 },
                { 0, 0, 0, 4, 1, 9, 0, 0, 5 },
                { 0, 0, 0, 0, 8, 0, 0, 7, 9 } };

        if (solveSudoku(sudoku, 0, 0)) {
            System.out.println("Solution exists:");
            printSudoku(sudoku);
        } else {
            System.out.println("No solution");
        }
    }
}

// T.C. = O(9^(n*n))
// S.C. = O(n*n)