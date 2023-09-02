public class Find_element_in_array_14_Q1 {
    public static void findElement(int a[], int index, int key) {
        if (index == a.length - 1) {
            if (a[index] == key) {
                System.out.print(index + " ");
                return;
            } else {
                return;
            }
        }
        if (a[index] == key) {
            System.out.print(index + " ");
        }
        findElement(a, index + 1, key);
    }

    public static void main(String args[]) {
        int a[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        findElement(a, 0, 2);
    }
}

// Question: For a given integer array of size N. You have to find all the
// occurrences (indices) of a given element (key) and print them. Use a
// recursive function to solve this problem.