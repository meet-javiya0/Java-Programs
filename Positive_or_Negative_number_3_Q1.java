import java.util.*;

public class Positive_or_Negative_number_3_Q1 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number:");
            int num = sc.nextInt();
            if (num >= 0) {
                System.out.println("Number is Positive");
            }
            else {
                System.out.println("Number is Negative");
            }
        }
    }
}