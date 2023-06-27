import java.util.*;

public class Average_of_Three_numbers_1_Q1 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter three numbers:");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            double avg = (double) ((a + b + c) / 3);
            System.out.println("Average of this numbers is:" + avg);
        }
    }
}