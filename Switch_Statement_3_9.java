public class Switch_Statement_3_9 {
    public static void main(String args[]) {
        // Switch is also same as if_else and ternary operator but it depends only the value of argument and if we don't use break then all the statements after that case excutes
        int number = 2;
        switch (number) {
            case 1:
                System.out.println("Samosa");
                break;
            case 2:
                System.out.println("Burger");
                break;
            case 3:
                System.out.println("Mango shake");
                break;
            default:
                System.out.println("We wake up!");
                break;
        }
    }
}