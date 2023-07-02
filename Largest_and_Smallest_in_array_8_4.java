public class Largest_and_Smallest_in_array_8_4 {
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; // (-infinity)

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static int getSmallest(int numbers[]) {
        int smallest = Integer.MAX_VALUE; // (+infinity)

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    public static void main(String args[]) {
        int numbers[] = { 1, 2, 6, 3, 5 };
        System.out.println("Smallest value is: " + getSmallest(numbers));
        System.out.println("Largest value is: " + getLargest(numbers));
    }
}