public class Selection_sort_9_Q2 {
    public static void selectionSort(int a[]) {
        for (int i = 0; i < a.length; i++) {
            int maxElementPosition = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[maxElementPosition] < a[j]) {
                    maxElementPosition = j;
                }
            }
            int temp = a[i];
            a[i] = a[maxElementPosition];
            a[maxElementPosition] = temp;
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
        selectionSort(a);
        printArray(a);
    }
}

// T.C. = O(n^2)