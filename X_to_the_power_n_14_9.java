public class X_to_the_power_n_14_9 {
    public static int xToThePowerN(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * xToThePowerN(x, n - 1);
    }

    public static void main(String args[]) {
        int x = 5;
        int n = 2;
        System.out.println(xToThePowerN(x, n));
    }
}