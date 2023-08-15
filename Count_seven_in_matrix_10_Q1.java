public class Count_seven_in_matrix_10_Q1 {
    public static int countSeven(int a[][]) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] == 7) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String args[]) {
        int arr[][] = { { 4, 7, 8 }, { 8, 8, 7 } };
        System.out.println(countSeven(arr));
    }
}