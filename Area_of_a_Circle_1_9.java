import java.util.*;

public class Area_of_a_Circle_1_9 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            float rad = sc.nextFloat();
            float area = (float) (3.14 * rad * rad);
            System.out.println(area);
        }
    }
}