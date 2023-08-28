public class Get_ith_bit_12_3 {
    public static void getIthBit(int num, int i) {
        if ((num & (1 << i)) == 0) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }

    public static void main(String args[]) {
        getIthBit(10, 3);
    }
}