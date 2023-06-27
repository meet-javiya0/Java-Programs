public class Type_Promotion_in_Expression_1_12 {
    public static void main(String args[]) {
        char a = 'a';
        char b = 'b';
        System.out.println((int) a);
        System.out.println((int) b);
        System.out.println(b - a);

        short s = 2;
        byte byt = 1;
        char ch = 'a';
        System.out.println(s + byt + ch);

        int i = 5;
        float f = 15.12f;
        long l = 124633;
        double d = 14.36;
        System.out.println(i + f + l + d);

        byte by = 5;
        byte num = (byte) (by * 2);
        System.out.println(num);
    }
}