import java.util.*;

public class Floyds_Triangle_Pattern_7_4 {
    private static void FloydsTriangle(int row) {
        int num = 1;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter total row:");
            int row = sc.nextInt();
            FloydsTriangle(row);
        }
    }
}