public class Last_occurence_of_element_in_array_14_8 {
    public static int lastOccurence(int n[], int i, int target) {
        if (i == -1) {
            return -1;
        }
        if (n[i] == target) {
            return i;
        }
        return lastOccurence(n, i - 1, target);
    }

    public static void main(String args[]) {
        int n[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
        System.out.println(lastOccurence(n, n.length - 1, 5));
    }
}