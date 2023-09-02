public class Is_array_sorted_14_6 {
    public static boolean isSorted(int n[], int i) {
        if (i == n.length - 1) {
            return true;
        }
        if (n[i] > n[i + 1]) {
            return false;
        }
        return isSorted(n, i + 1);
    }

    public static void main(String args[]) {
        int n[] = { 1, 2, 3, 5, 4 };
        System.out.println(isSorted(n, 0));
    }
}