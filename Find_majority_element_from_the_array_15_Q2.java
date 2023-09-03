public class Find_majority_element_from_the_array_15_Q2 {

    // brute force approach
    // TC = O(n^2)

    public static int majorityElement(int num[]) {
        int countMajorityElement = num.length / 2;
        for (int i = 0; i < num.length; i++) {
            int count = 0;
            for (int j = 0; j < num.length; j++) {
                if (num[i] == num[j]) {
                    count++;
                }
            }
            if (count > countMajorityElement) {
                return num[i];
            }
        }
        return -1;
    }

    // optimized approach
    // TC = O(nlogn)

    public static int majorityElementOptimized(int num[]) {
        return majorityElementRecord(num, 0, num.length - 1);
    }

    public static int majorityElementRecord(int num[], int si, int ei) {
        if (si == ei) {
            return num[si];
        }

        int mid = si + (ei - si) / 2;
        int leftMajority = majorityElementRecord(num, si, mid);
        int rightMajority = majorityElementRecord(num, mid + 1, ei);

        if (leftMajority == rightMajority) {
            return leftMajority;
        }

        int leftCount = countInRange(num, leftMajority, si, ei);
        int rightCount = countInRange(num, leftMajority, si, ei);

        return leftCount > rightCount ? leftMajority : rightMajority;
    }

    public static int countInRange(int num[], int numKey, int si, int ei) {
        int count = 0;
        for (int i = si; i <= ei; i++) {
            if (num[i] == numKey) {
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]) {
        int num[] = { 3, 2, 3 };
        System.out.println(majorityElement(num));
        System.out.println(majorityElementOptimized(num));
        int num2[] = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(majorityElement(num2));
        System.out.println(majorityElementOptimized(num2));
    }
}