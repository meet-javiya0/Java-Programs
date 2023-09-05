public class Code_check_16_Q4 {
    public static int floorSqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        int i = 1, result = 1;
        while (result <= x) {
            i++;
            result = i * i;
        }
        return i - 1;
    }

    public static void main(String args[]) {
        int n = 11;
        System.out.println(floorSqrt(n));
    }
}

// time complexity = O(sqrt(n))
// space complexity = O(1)