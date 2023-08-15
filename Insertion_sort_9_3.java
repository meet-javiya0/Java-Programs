public class Insertion_sort_9_3 {
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int currentElement = arr[i];
            int previousIndex = i - 1;
            // finding the correct position to insert an element
            while (previousIndex >= 0 && arr[previousIndex] > currentElement) {
                arr[previousIndex + 1] = arr[previousIndex];
                previousIndex--;
            }
            // inserting an element
            arr[previousIndex + 1] = currentElement;
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 5, 4, 1, 3, 2 };
        insertionSort(arr);
        printArray(arr);
    }
}

// Time Complexity: O(n^2)