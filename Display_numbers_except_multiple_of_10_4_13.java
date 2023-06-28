import java.util.*;

public class Display_numbers_except_multiple_of_10_4_13 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            do {
                System.out.print("Enter a number(-1 for exit):");
                int n = sc.nextInt();
                if (n % 10 == 0) {
                    continue;
                }
                if (n == -1) {
                    break;
                }
                System.out.println("The number is:" + n);
            } while (true);
        }
    }
}