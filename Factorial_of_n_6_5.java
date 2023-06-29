public class Factorial_of_n_6_5 {
    public static int factorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void main(String args[]) {
        int n = 5;
        System.out.println("Factorial of " + n + " is:" + factorial(n));
    }
}