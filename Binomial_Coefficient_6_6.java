public class Binomial_Coefficient_6_6 {
    public static int factorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static int binomialCoefficient(int n, int r) {
        return (factorial(n) / (factorial(r) * factorial(n - r)));
    }

    public static void main(String args[]) {
        int n = 5, r = 2;
        System.out.println("Binomial coefficient is:" + binomialCoefficient(n, r));
    }
}