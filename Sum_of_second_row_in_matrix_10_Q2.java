public class Sum_of_second_row_in_matrix_10_Q2 {
    public static int sumOfSecondRow(int a[][]) {
        int sum = 0;
        for (int i = 0; i < a[1].length; i++) {
            sum = sum + a[1][i];
        }
        return sum;
    }

    public static void main(String args[]) {
        int[][] nums = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        System.out.println(sumOfSecondRow(nums));
    }
}