import java.util.*;

public class Area_of_Square_1_Q2 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the side of the Square:");
            int l = sc.nextInt();
            int area = l * l;
            System.out.println("Area of the Square is:" + area);
        }
    }
}