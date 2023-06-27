public class Unary_Operations_2_2 {
    public static void main(String args[]) {
        // main two types: 1)Increment, 2)Decrement
        int a = 10;
        int b = ++a; // Pre increment operator
        System.out.println(a);
        System.out.println(b);

        b = a++; // Post increment operator
        System.out.println(a);
        System.out.println(b);

        b = --a; // Post decrement operator
        System.out.println(a);
        System.out.println(b);

        b = a--; // Post decrement operator
        System.out.println(a);
        System.out.println(b);
    }
}