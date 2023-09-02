import java.util.*;

public class Print_n_to_1_using_recursion_14_1 {
    public static void printReverseNumbers(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        printReverseNumbers(n - 1);
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number:");
            int n = sc.nextInt();
            printReverseNumbers(n);
        }
    }
}