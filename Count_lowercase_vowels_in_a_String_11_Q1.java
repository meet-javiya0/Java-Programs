import java.util.*;

public class Count_lowercase_vowels_in_a_String_11_Q1 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            String str;
            int count = 0;
            System.out.print("Enter a string: ");
            str = sc.nextLine();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i'
                        || ch == 'o' || ch == 'u') {
                    count++;
                }
            }
            System.out.println("Number of vowels in the given string: " + count);
        }
    }
}