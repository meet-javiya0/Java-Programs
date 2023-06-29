public class Binary_to_Decimal_6_11 {
    public static void binaryToDecimal(int binary) {
        int num = binary;
        int pow = 0;
        int decimal = 0;

        while (binary > 0) {
            int lastDigit = binary % 10;
            decimal = (int) (decimal + (lastDigit * Math.pow(2, pow)));
            pow++;
            binary = binary / 10;
        }
        System.out.println("Decimal of " + num + " = " + decimal);
    }

    public static void main(String args[]) {
        binaryToDecimal(101);
    }
}