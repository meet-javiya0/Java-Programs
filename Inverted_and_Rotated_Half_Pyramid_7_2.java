import java.util.*;

public class Inverted_and_Rotated_Half_Pyramid_7_2 {
    private static void invertedAndRotatedHalfPyramid(int row, int column) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter total row:");
            int row = sc.nextInt();
            System.out.print("Enter total column:");
            int column = sc.nextInt();
            invertedAndRotatedHalfPyramid(row, column);
        }
    }
}