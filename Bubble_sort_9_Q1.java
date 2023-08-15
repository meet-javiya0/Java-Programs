public class Bubble_sort_9_Q1 {
    public static void bubbleSort(int a[]) {
        for (int i = 0; i < a.length; i++) {
            boolean flag = true;
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] < a[j + 1]) {
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                    flag = false;
                }
            }
            if (flag) {
                break;
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
        bubbleSort(a);
        printArray(a);
    }
}

// T.C. = O(n^2)