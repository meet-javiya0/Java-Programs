public class Sort_array_of_String_with_merge_sort_15_Q1 {
    public static void printArray(String a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(String a[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergeSort(a, si, mid);
        mergeSort(a, mid + 1, ei);
        merge(a, si, ei, mid);
    }

    public static void merge(String a[], int si, int ei, int mid) {
        String temp[] = new String[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {
            if (a[i].compareToIgnoreCase(a[j]) < 0) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = a[i++];
        }

        while (j <= ei) {
            temp[k++] = a[j++];
        }

        for (k = 0, i = si; k < temp.length; k++, i++) {
            a[i] = temp[k];
        }
    }

    public static void main(String args[]) {
        String arr[] = { "sun", "earth", "mars", "mercury" };
        mergeSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}

// Time complexity : O(nlogn)
// Space complexity : O(n)