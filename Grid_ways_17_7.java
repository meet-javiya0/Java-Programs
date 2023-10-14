public class Grid_ways_17_7 {
    public static int gridWays(int i, int j, int n, int m) {
        if (i == n - 1 && j == m - 1) {
            return 1;
        }

        if (i >= n || j >= m) {
            return 0;
        }

        return gridWays(i + 1, j, n, m) + gridWays(i, j + 1, n, m);
    }

    public static void main(String args[]) {
        int n = 3, m = 3;
        System.out.println("Number of ways to reach the bottom right corner: " + gridWays(0, 0, n, m));
    }
}

// T.C = O(2^(n+m))
// S.C = O(n*m)