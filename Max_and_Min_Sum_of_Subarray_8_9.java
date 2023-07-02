public class Max_and_Min_Sum_of_Subarray_8_9 {
    public static void maxAndMinSumOfSubarray(int numbers[]) {
        int minSum = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + numbers[k];
                    System.out.print(numbers[k] + " ");
                }
                System.out.println("\tSum of this Subarray is : " + sum);
                if (minSum >= sum) {
                    minSum = sum;
                }
                if (maxSum <= sum) {
                    maxSum = sum;
                }
            }
            System.out.println();
        }
        System.out.println("Minimum sum is : " + minSum);
        System.out.println("Maximum sum is : " + maxSum);
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        maxAndMinSumOfSubarray(numbers);
    }
}