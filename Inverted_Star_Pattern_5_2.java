import java.util.*;

public class Inverted_Star_Pattern_5_2 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number:");
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}