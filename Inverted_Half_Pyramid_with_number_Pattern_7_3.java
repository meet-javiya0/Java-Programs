import java.util.*;

public class Inverted_Half_Pyramid_with_number_Pattern_7_3 {
    private static void invertedHalfPyramidWithNumber(int row) {
        for (int i = 1; i <= row; i++) {
            int num = 1;
            for (int j = 1; j <= row - i + 1; j++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter total row:");
            int row = sc.nextInt();
            invertedHalfPyramidWithNumber(row);
        }
    }
}