public class Is_Palindrome_6_Q3 {
    public static boolean isPalindrome(int num) {
        int temp = num;
        int rev = 0;
        while (temp > 0) {
            int lastDigit = temp % 10;
            rev = rev * 10 + lastDigit;
            temp = temp / 10;
        }
        if (rev == num) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String args[]) {
        int num = 121;
        System.out.println(isPalindrome(num));
        int num2 = 123;
        System.out.println(isPalindrome(num2));
    }
}