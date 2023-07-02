public class Max_Subarray_sum_Method_1_Brute_Force_8_10 {
    public static void bruteForce(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + numbers[k];
                    System.out.print(numbers[k] + " ");
                }
                System.out.println("\tSum of this Subarray is : " + sum);
                if (maxSum < sum) {
                    maxSum = sum;
                }
            }
            System.out.println();
        }
        System.out.println("Maximum sum is : " + maxSum);
    }

    public static void main(String args[]) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        bruteForce(numbers);
    }
}