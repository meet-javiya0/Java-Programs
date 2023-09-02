public class Integer_number_to_English_String_14_Q2 {
    static String digitString[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    public static void numToString(int num) {
        if (num == 0) {
            return;
        }
        int lastDigit = num % 10;
        numToString(num / 10);
        System.out.print(digitString[lastDigit] + " ");
    }

    public static void main(String args[]) {
        numToString(1947);
    }
}

// Question: You are given a number (eg - 2019), convert it into a String of
// english like “two zero one nine”. Use a recursive function to solve this
// problem.