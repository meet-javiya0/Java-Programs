public class Clear_ith_bit_12_5 {
    public static int clearIthBit(int num, int i) {
        return num & ~(1 << i);
    }

    public static void main(String args[]) {
        System.out.println(clearIthBit(10, 1));
    }
}