import java.util.*;

public class Number_Pyramid_Pattern_7_10 {
    public static void numberPyramid(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter total rows:");
            int row = sc.nextInt();
            numberPyramid(row);
        }
    }
}