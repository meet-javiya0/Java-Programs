public class X_to_the_power_n_optimized_14_10 {
    public static int xToThePowerNOptimized(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int xnby2 = xToThePowerNOptimized(x, n / 2);
        if (n % 2 == 0) {
            return xnby2 * xnby2;
        } else {
            return x * xnby2 * xnby2;
        }
    }

    public static void main(String args[]) {
        int x = 2;
        int n = 10;
        System.out.println(xToThePowerNOptimized(x, n));
    }
}