import java.util.*;

public class break_keyword_use_4_11 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            do {
                System.out.print("Enter a number:");
                int num = sc.nextInt();
                if (num % 10 == 0) {
                    break;
                }
                System.out.println(num);
            } while (true);
        }
    }
}