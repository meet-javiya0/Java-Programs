public class Length_of_a_string_using_recursion_14_Q3 {
    public static int stringLength(String str) {
        if (str.isEmpty()) {
            return 0;
        }
        return stringLength(str.substring(1)) + 1;
    }

    public static void main(String args[]) {
        System.out.println(stringLength("Hello World"));
    }
}

// Question: Write a program to find Length of a String using Recursion.