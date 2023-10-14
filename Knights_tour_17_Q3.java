public class Knights_tour_17_Q3 {
    static int n = 8;

    public static boolean knightsMove(int sol[][], int xMove[], int yMove[], int x, int y, int moveI) {
        // base case
        if (moveI == n * n) {
            return true;
        }

        // recursive case
        // try all next moves from the current coordinate x, y
        int k, nextX, nextY;
        // try all 8 possible moves from the current coordinate x, y
        for (k = 0; k < 8; k++) {
            nextX = x + xMove[k];
            nextY = y + yMove[k];
            // check if the next move is safe or not
            if (isSafe(sol, nextX, nextY)) { // if safe, then make the move
                sol[nextX][nextY] = moveI;
                // recur for next move
                if (knightsMove(sol, xMove, yMove, nextX, nextY, moveI + 1)) {
                    return true;
                } else { // if not safe, then backtrack
                    sol[nextX][nextY] = -1;
                }
            }
        }
        return false;
    }

    public static boolean isSafe(int sol[][], int x, int y) {
        // check if x and y are valid indexes and sol[x][y] is -1
        return (x >= 0 && x < n && y >= 0 && y < n && sol[x][y] == -1);
    }

    public static void printSolution(int sol[][]) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(sol[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int sol[][] = new int[8][8];
        // initialize the solution matrix with -1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sol[i][j] = -1;
            }
        }

        // all possible moves for a knight
        int xMove[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
        int yMove[] = { 1, 2, 2, 1, -1, -2, -2, -1 };

        sol[0][0] = 0;

        // start from 0, 0 and explore all tours using knightsMove()
        if (!knightsMove(sol, xMove, yMove, 0, 0, 1)) {
            System.out.println("No soltuion exist");
        } else {
            printSolution(sol);
        }
    }
}

// T.C. = O(8^(n^2))
// S.C. = O(n^2)