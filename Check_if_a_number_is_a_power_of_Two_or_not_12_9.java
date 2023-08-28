public class Check_if_a_number_is_a_power_of_Two_or_not_12_9 {
    public static boolean isPowerOfTwo(int num) {
        return (num & (num - 1)) == 0;
    }

    public static void main(String args[]) {
        System.out.println(isPowerOfTwo(16));
    }
}