public class Count_set_bits_in_a_number_12_10 {
    public static int countSetBits(int num) {
        // Time complexity = O(logn)
        int count = 0;
        while (num != 0) {
            if ((num & 1) != 0) {
                count++;
            }
            num = (num >> 1);
        }
        return count;
    }

    public static void main(String args[]) {
        System.out.println(countSetBits(10));
    }
}