import java.util.*;

public class Sum_of_n_numbers_14_4 {
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a nummber:");
            int n = sc.nextInt();
            System.out.println(sum(n));
        }
    }
}