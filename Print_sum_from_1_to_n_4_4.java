import java.util.*;

public class Print_sum_from_1_to_n_4_4 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the value of n:");
            int n = sc.nextInt();
            int i = 1;
            int sum = 0;
            while (i <= n) {
                sum += i;
                i++;
            }
            System.out.print(sum);
        }
    }
}