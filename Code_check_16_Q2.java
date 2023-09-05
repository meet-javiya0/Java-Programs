public class Code_check_16_Q2 {
    public static void main(String args[]) {
        int n = 5, k = 2;
        for (int i = 0; i < n; i++) {
            i = i * k;
        }
    }
}

// time complexity = O(logkn) (logn base k)
// space complexity = O(1)