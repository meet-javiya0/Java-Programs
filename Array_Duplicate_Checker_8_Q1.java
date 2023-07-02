import java.util.HashSet;

public class Array_Duplicate_Checker_8_Q1 {
    // brute force approach TC = (n^2)

    // private static boolean duplicateChecker(int[] num1) {
    // for (int i = 0; i < num1.length; i++) {
    // for (int j = i + 1; j < num1.length; j++) {
    // if (num1[i] == num1[j]) {
    // return true;
    // }
    // }
    // }
    // return false;
    // }

    // using hashsets TC = O(n)

    public static boolean containsDuplicate(int nums[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;
    }

    public static void main(String args[]) {
        int num1[] = { 1, 2, 3, 1 };
        int num2[] = { 1, 2, 3, 4 };
        int num3[] = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        System.out.println("Is duplicate value present in array:" + containsDuplicate(num1));
        System.out.println("Is duplicate value present in array:" + containsDuplicate(num2));
        System.out.println("Is duplicate value present in array:" + containsDuplicate(num3));
    }
}