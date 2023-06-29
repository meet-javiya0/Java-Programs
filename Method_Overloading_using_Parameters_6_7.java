public class Method_Overloading_using_Parameters_6_7 {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String args[]) {
        System.out.println(sum(3, 5, 7));
        System.out.println(sum(3, 5));
    }
}