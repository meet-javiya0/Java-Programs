public class Array_as_function_argument_8_2 {
    private static void update(int[] marks) {
        for (int i = 0; i < marks.length; i++) {
            marks[i]++;
        }
    }

    private static void printArray(int[] marks) {
        for (int i : marks) {
            System.out.print(i + " ");
        }
    }

    public static void main(String args[]) {
        int marks[] = { 97, 98, 99 };
        update(marks);
        printArray(marks);
    }
}