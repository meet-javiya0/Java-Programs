public class Counting_sort_9_Q4 {
    public static void countingSort(int a[]) {
        // finding max element from the array
        int maxElement = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > maxElement) {
                maxElement = a[i];
            }
        }

        // counting that how many times each element is present in array
        int count[] = new int[maxElement + 1];
        for (int i = 0; i < a.length; i++) {
            count[a[i]]++;
        }

        // sorting
        int j = 0;
        for (int i = count.length - 1; i >= 0; i--) {
            while (count[i] > 0) {
                a[j] = i;
                j++;
                count[i]--;
            }
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
        countingSort(a);
        printArray(a);
    }
}

// T.C. = O(n + K)