public class Call_by_Value_6_3 {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String args[]) {
        int a = 5;
        int b = 10;
        swap(a, b);
        System.out.println(a); // here original value is not changed because we passed a and b as a call by value
        System.out.println(b);
    }
}