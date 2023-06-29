public class Average_of_Three_numbers_6_Q1 {
    public static double avg(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public static void main(String args[]) {
        double a = 2, b = 8, c = 6;
        System.out.println("Average is:" + avg(a, b, c));
    }
}