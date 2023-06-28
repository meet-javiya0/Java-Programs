import java.util.*;

public class Check_if_prime_or_not_4_14 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number:");
            int num = sc.nextInt();
            boolean flag = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println("Number is prime");
            }
            else {
                System.out.println("Number is not prime");
            }
        }
    }
}