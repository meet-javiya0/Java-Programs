public class Check_if_a_string_is_Palindrome_11_6 {
    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        String str = "racecar"; // other palindrome words: noon, madam, radar, level, refer, rotator, etc.
        System.out.println(isPalindrome(str));
    }
}