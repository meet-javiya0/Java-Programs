import java.util.*;

public class Checks_Leap_year_3_Q5 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a year:");
            int year = sc.nextInt();
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println("Leap year");
                    } else {
                        System.out.println("Not a leap year");
                    }
                } else {
                    System.out.println("Leap year");
                }
            } else {
                System.out.println("Not a leap year");
            }

            // alternative way to solve this problem

            // boolean x = (year % 4) == 0;
            // boolean y = (year % 100) != 0;
            // boolean z = ((year % 100 == 0) && (year % 400 == 0));
            // if (x && (y || z)) {
            // System.out.println(year + " is a leap year");
            // } else {
            // System.out.println(year + " is not a leap year");
            // }
        }
    }
}