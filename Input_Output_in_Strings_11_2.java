import java.util.*;

public class Input_Output_in_Strings_11_2 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            String name = sc.next(); // only take one word as input
            System.out.println(name);

            String name2 = sc.nextLine(); // takes whole line as input
            System.out.println(name2);
        }
    }
}