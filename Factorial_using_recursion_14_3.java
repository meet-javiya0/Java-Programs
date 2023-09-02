import java.util.*;

public class Factorial_using_recursion_14_3 {
    public static int fact(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a nummber:");
            int n = sc.nextInt();
            System.out.println(fact(n));
        }
    }
}