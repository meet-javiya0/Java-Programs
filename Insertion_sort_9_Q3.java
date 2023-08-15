public class Insertion_sort_9_Q3 {
    public static void insertionSort(int a[]) {
        for (int i = 1; i < a.length; i++) {
            int currentElement = a[i];
            int previousIndex = i - 1;
            while (previousIndex >= 0 && a[previousIndex] < currentElement) {
                a[previousIndex + 1] = a[previousIndex];
                previousIndex--;
            }
            a[previousIndex + 1] = currentElement;
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int a[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        insertionSort(a);
        printArray(a);
    }
}

// T.C. = O(n^2)