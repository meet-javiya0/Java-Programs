public class Half_Pyramid_Character_Pattern_5_4 {
    public static void main(String args[]) {
        char ch = 'A';
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }
    }
}