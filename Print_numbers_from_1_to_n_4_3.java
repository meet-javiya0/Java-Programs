import java.util.*;

public class Print_numbers_from_1_to_n_4_3 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int counter = 1;
            while (counter <= n) {
                System.out.print(counter + " ");
                counter++;
            }
        }
    }
}