public class Decimal_to_Binary_6_12 {
    public static void Decimal_to_Binary(int decimal) {
        int num = decimal;
        int pow = 0;
        int binary = 0;
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary = (int) (binary + (remainder * Math.pow(10, pow)));
            decimal = decimal / 2;
            pow++;
        }
        System.out.println("Binary of " + num + " is:" + binary);
    }

    public static void main(String args[]) {
        Decimal_to_Binary(7);
    }
}