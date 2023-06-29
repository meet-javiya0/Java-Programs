import java.util.Scanner;

public class Function_with_parameters_6_2 {
    public static int sum(int a, int b) { // parameters or formal parameters
        int sum = a + b;
        return sum;
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter two numbers:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = sum(a, b); // arguments or actual parameters
            System.out.println("Sum is:" + sum);
        }
    }
}