import java.util.*;

public class Factorial_4_Q3 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number:");
            int num = sc.nextInt();
            int factorial = 1;
            while (num > 0) {
                factorial *= num;
                num--;
            }
            System.out.println("Factorial of the numebr is:" + factorial);
        }
    }
}