public class continue_statement_4_12 {
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // to skip the current iteration of loop
            }
            System.out.print(i + " ");
        }
    }
}