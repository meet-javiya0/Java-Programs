import java.util.*;

public class Print_1_to_n_using_recursion_14_2 {
    public static void printReverseNumbers(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printReverseNumbers(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number:");
            int n = sc.nextInt();
            printReverseNumbers(n);
        }
    }
}