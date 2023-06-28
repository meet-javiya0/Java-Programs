public class Ternary_operator_3_7 {
    public static void main(String args[]) {
        // ternary oprator is also used to check the condistions like if_else statements
        // syntax => variable = condition ? statement1 : statement2;
        int number = 4;
        String type = number % 2 == 0 ? "Even" : "Odd";
        System.out.println(type);
    }
}