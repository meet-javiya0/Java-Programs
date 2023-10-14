import java.util.*;

public class Keypad_Combination_17_Q2 {
    final static char[][] L = { {}, {}, { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'i' },
            { 'j', 'k', 'l' }, { 'm', 'n', 'o' }, { 'p', 'q', 'r', 's' },
            { 't', 'u', 'v' }, { 'w', 'x', 'y', 'z' } };

    public static void letterCombination(String n, int position, int length, StringBuilder ans) {
        // base case
        if (position == length) {
            // if we reach the end of the number then print the ans and return
            System.out.println(ans.toString());
            return;
        }

        // recursion
        // for each digit in the number, we have to check all the letters
        char letters[] = L[Character.getNumericValue(n.charAt(position))];

        // for each letter in the digit
        for (int i = 0; i < letters.length; i++) {
            // we have to check all the letters of the next digit and so on
            letterCombination(n, position + 1, length, new StringBuilder(ans).append(letters[i]));
        }
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number:");
            String n = sc.nextLine();
            // if the number is empty then print null
            if (n.equals("")) {
                System.out.println("null");
            } else { // else call the function
                letterCombination(n, 0, n.length(), new StringBuilder());
            }
        }
    }
}

// T.C: O(4^n)
// S.C: O(n)