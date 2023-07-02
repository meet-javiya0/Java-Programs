import java.util.*;

public class Array_8_1 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            // creation
            int marks[] = new int[3];
            // int numbers[] = {1,2,3}; We can also declare an array like this

            // input
            System.out.print("Enter marks for Physics, Chemistry and Maths:");
            marks[0] = sc.nextInt();
            marks[1] = sc.nextInt();
            marks[2] = sc.nextInt();

            // output
            System.out.println("Physics:" + marks[0]);
            System.out.println("Chemistry:" + marks[1]);
            System.out.println("Maths:" + marks[2]);

            // updation
            marks[2]++;
            System.out.println("Maths:" + marks[2]);

            int percentage = (marks[0] + marks[1] + marks[2]) / 3;
            System.out.println("Percentage of this subjects is:" + percentage + "%");

            System.out.println("Length of the array is:" + marks.length);
        }
    }
}