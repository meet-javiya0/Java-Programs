public class Rate_in_a_maze_17_Q1 {
    public static boolean possibleWay(int maze[][], int row, int col, int sol[][]) {
        // base case
        if (row == maze.length - 1 && col == maze.length - 1 && maze[row][col] == 1) {
            sol[row][col] = 1;
            return true;
        }

        // recursion
        if (isSafe(maze, row, col)) { // check if it is safe or not
            if (sol[row][col] == 1) {
                return false;
            }

            sol[row][col] = 1; // make it 1
            if (possibleWay(maze, row + 1, col, sol)) { // for down
                return true;
            }
            if (possibleWay(maze, row, col + 1, sol)) { // for right
                return true;
            }
            sol[row][col] = 0; // if rat can't do down or right then make it 0
            return false; // and return false
        }

        return false;
    }

    // check if the current maze box is blocked or not
    public static boolean isSafe(int maze[][], int row, int col) {
        if (row >= 0 && col >= 0 && row < maze.length && col < maze[0].length && maze[row][col] == 1) {
            return true;
        }
        return false;
    }

    // print the way for rat
    public static void printWay(int sol[][]) {
        for (int i = 0; i < sol.length; i++) {
            for (int j = 0; j < sol[0].length; j++) {
                System.out.print(sol[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        // maze
        int maze[][] = { { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 1 } };

        // solution matrix
        int sol[][] = new int[4][4];

        // imitialize it with 0
        for (int i = 0; i < sol.length; i++) {
            for (int j = 0; j < sol[0].length; j++) {
                sol[i][j] = 0;
            }
        }

        // find soluiton for the rat
        if (possibleWay(maze, 0, 0, sol) == true) {
            System.out.println("Solution exist:");
            printWay(sol);
        } else {
            System.out.println("Solution doesn't exist");
        }
    }
}

// T.C. = O(2^n)
// S.C. = O(n^2)