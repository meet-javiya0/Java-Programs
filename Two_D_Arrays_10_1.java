import java.util.*;

public class Two_D_Arrays_10_1 {
    public static boolean search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Found at index (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int matrix[][] = new int[3][3];

            // scanning the matrix
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    System.out.print("Enter the element for position i=" + i + " j=" + j + ":");
                    matrix[i][j] = sc.nextInt();
                }
            }

            // printing the matrix
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

            // checking if element is present in matrix or not
            System.out.println("Element present in array: " + search(matrix, 5));
        }
    }
}