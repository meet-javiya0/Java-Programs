import java.util.*;

public class Reverse_the_given_number_4_8 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            int rev = 0;
            while (num > 0) {
                int lastDigit = num % 10;
                rev = rev * 10 + lastDigit;
                num = num / 10;
            }
            System.out.println(rev);
        }
    }
}