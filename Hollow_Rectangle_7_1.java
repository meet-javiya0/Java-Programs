import java.util.*;

public class Hollow_Rectangle_7_1 {
    public static void hollowRectangle(int row, int column) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                if (i == 1 || i == row || j == 1 || j == column) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
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
            hollowRectangle(row, column);
        }
    }
}