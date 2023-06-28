import java.util.*;

public class Print_reverse_of_a_number_4_7 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int number = sc.nextInt();
            while (number > 0) {
                int lastDigit = number % 10;
                System.out.print(lastDigit + " ");
                number = number / 10;
            }
        }
    }
}