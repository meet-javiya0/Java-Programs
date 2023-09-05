public class Code_check_16_Q1 {
    public static void main(String args[]) {
        int n = 5, k = 0;
        for (int i = n / 2; i <= n; i++) {
            for (int j = 2; j <= n; j = j * 2) {
                k = k + n / 2;
            }
        }
        System.out.println(k);
    }
}

// time complexity = O(nlogn)
// space complexity = O(1)