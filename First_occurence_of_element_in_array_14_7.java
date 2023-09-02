public class First_occurence_of_element_in_array_14_7 {
    public static int firstOccurence(int n[], int i, int target) {
        if (i == n.length) {
            return -1;
        }
        if (n[i] == target) {
            return i;
        }
        return firstOccurence(n, i + 1, target);
    }

    public static void main(String args[]) {
        int n[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
        System.out.println(firstOccurence(n, 0, 5));
    }
}