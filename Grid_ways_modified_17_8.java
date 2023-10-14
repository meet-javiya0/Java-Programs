public class Grid_ways_modified_17_8 {
    // It is using the method of factorial and permutation
    public static int gridWays(int n, int m) {
        int N = n + m - 2;
        int r = n - 1;
        double res = 1;
        for (int i = 1; i <= r; i++) {
            res = res * (N - r + i) / i;
        }
        return (int) res;
    }

    public static void main(String args[]) {
        int n = 3, m = 3;
        System.out.println("Number of ways to reach the bottom right corner: " + gridWays(n, m));
    }
}

// T.C = O(n)
// S.C = O(1)