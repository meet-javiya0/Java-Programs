import java.util.*;

public class Even_and_Odd_integer_sum_4_Q2 {
    public static void main(String args[]) {
        // try (Scanner sc = new Scanner(System.in)) {
        //     int evenSum = 0;
        //     int oddSum = 0;
        //     for (int i = 0; i < 5; i++) {
        //         System.out.print("Enter a number:");
        //         int num = sc.nextInt();
        //         if (num % 2 == 0) {
        //             evenSum += num;
        //         } else {
        //             oddSum += num;
        //         }
        //     }
        //     System.out.println("Even number sum is:" + evenSum);
        //     System.out.println("Odd number sum is:" + oddSum);
        // }

        // original Solution

        try (Scanner sc = new Scanner(System.in)) {
            int number;
            int choice;
            int evenSum = 0;
            int oddSum = 0;
            do {
                System.out.print("Enter the number ");
                number = sc.nextInt();
                if (number % 2 == 0) {
                    evenSum += number;
                } else {
                    oddSum += number;
                }
                System.out.print("Do you want to continue? Press 1 for yes or 0 for no ");
                choice = sc.nextInt();
            } while (choice == 1);
            System.out.println("Sum of even numbers: " + evenSum);
            System.out.println("Sum of odd numbers: " + oddSum);
        }
    }
}