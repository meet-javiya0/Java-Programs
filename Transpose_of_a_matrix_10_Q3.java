public class Transpose_of_a_matrix_10_Q3 {
    public static void transpose(int a[][]) {
        int transpose[][] = new int[a[0].length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                transpose[j][i] = a[i][j];
            }
        }
        printMatrix(transpose);
    }

    public static void printMatrix(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int a[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
        transpose(a);
    }
}