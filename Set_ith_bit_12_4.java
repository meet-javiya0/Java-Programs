public class Set_ith_bit_12_4 {
    public static int setIthBit(int num, int i) {
        return num | (1 << i);
    }

    public static void main(String args[]) {
        System.out.println(setIthBit(10, 2));
    }
}