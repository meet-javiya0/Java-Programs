import java.util.*;

public class Calculator_using_switch_3_10 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the value of A:");
            int a = sc.nextInt();
            System.out.print("Enter the value of B:");
            int b = sc.nextInt();
            System.out.print("Enter the operator:");
            char operator = sc.next().charAt(0);

            switch (operator) {
                case '+':
                    System.out.println((a + b));
                    break;
                case '-':
                    System.out.println((a - b));
                    break;
                case '*':
                    System.out.println((a * b));
                    break;
                case '/':
                    System.out.println((a / b));
                    break;
                case '%':
                    System.out.println((a % b));
                    break;
                default:
                    System.out.println("Wrong operator");
                    break;
            }
        }
    }
}