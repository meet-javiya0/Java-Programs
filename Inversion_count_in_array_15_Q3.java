public class Inversion_count_in_array_15_Q3 {

    // optimised approach
    // TC = O(nlogn), SC = O(n)
    public static int inversionCountOptimized(int arr[]) {
        return mergeSort(arr, 0, arr.length - 1);
    }

    public static int mergeSort(int arr[], int si, int ei) {
        int count = 0;
        if (si < ei) {
            int mid = si + (ei - si) / 2;
            count += mergeSort(arr, si, mid);
            count += mergeSort(arr, mid + 1, ei);
            count += merge(arr, si, ei, mid);
        }
        return count;
    }

    public static int merge(int arr[], int si, int ei, int mid) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        int count = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                count = count + mid - i + 1;
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
        return count;
    }

    // Bruteforce approach
    // TC = O(n^2), SC = O(1)
    public static int inversionCount(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String args[]) {
        int arr[] = { 2, 4, 1, 3, 5 };
        System.out.println(inversionCount(arr));
        System.out.println(inversionCountOptimized(arr));
        int arr2[] = { 2, 3, 4, 5, 6 };
        System.out.println(inversionCount(arr2));
        System.out.println(inversionCountOptimized(arr2));
        int arr3[] = { 5, 5, 5 };
        System.out.println(inversionCount(arr3));
        System.out.println(inversionCountOptimized(arr3));
    }
}