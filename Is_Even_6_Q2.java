public class Is_Even_6_Q2 {
    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String args[]) {
        int num = 5;
        System.out.println("Is " + num + " even:" + isEven(num));
    }
}