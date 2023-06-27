import java.util.*;

public class Sum_of_a_and_b_input_from_user_1_7 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the value of a & b:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = a + b;
            System.out.println("Sum is:" + sum);
        }
    }
}