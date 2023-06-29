public class Sum_of_the_digits_in_number_6_Q5 {
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            sum = sum + lastDigit;
            num = num / 10;
        }
        return sum;
    }

    public static void main(String args[]) {
        int num = 1245;
        System.out.println("Sum of the digit in " + num + " is:" + sumOfDigits(num));
    }
}