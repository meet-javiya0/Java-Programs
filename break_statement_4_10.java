public class break_statement_4_10 {
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break; // used for break the current loop
            }
            System.out.println(i);
        }
        System.out.println("I'm out from the loop");
    }
}