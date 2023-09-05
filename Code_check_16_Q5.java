public class Code_check_16_Q5 {
    public static void main(String args[]) {
        int a = 0, n = 5;
        for (int i = 0; i < n; ++i) {
            for (int j = n; j > i; --j) {
                a = a + i + j;
            }
        }
        System.out.println(a);
    }
}

// time complexity = O(n^2)
// space complexity = O(1)