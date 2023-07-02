public class Max_Subarray_sum_Method_3_Kadanes_Algorithm_8_12 {
    public static void kadanesAlgorithm(int numbers[]) { // if all numbers of array is negative then this code isn't work
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
            if (sum < 0) {
                sum = 0;
            }
            maxSum = Math.max(sum, maxSum);
        }
        System.out.println("Our maximum subarray sum is : " + maxSum);
    }

    public static void kadanesAlgorithmOptimized(int[] nums) { // this algorithm works for negative numbers also
        int maxSum = nums[0];
        int sum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            sum = Math.max(nums[i], sum + nums[i]);
            maxSum = Math.max(sum, maxSum);
        }

        System.out.println("Our maximum subarray sum is : " + maxSum);
    }

    public static void main(String args[]) {
        int numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        kadanesAlgorithm(numbers);
        kadanesAlgorithmOptimized(numbers);
        int num[] = { -2, -5, -3, -1 };
        kadanesAlgorithm(num); // this gives wrong answer
        kadanesAlgorithmOptimized(num);
    }
}