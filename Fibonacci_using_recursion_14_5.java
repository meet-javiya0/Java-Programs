import java.util.*;

public class Fibonacci_using_recursion_14_5 {
    public static int fibo(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number:");
            int n = sc.nextInt();
            System.out.println(fibo(n));
        }
    }
}