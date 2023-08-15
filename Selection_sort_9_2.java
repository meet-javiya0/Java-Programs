public class Selection_sort_9_2 {
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minimumPosition = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minimumPosition] > arr[j]) {
                    minimumPosition = j;
                }
            }
            int temp = arr[minimumPosition];
            arr[minimumPosition] = arr[i];
            arr[i] = temp;
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
        selectionSort(arr);
        printArray(arr);
    }
}

// Time Complexity: O(n^2)