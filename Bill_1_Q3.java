import java.util.*;

public class Bill_1_Q3 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the price of Pen, Pencil and Eraser:");
            double penPrice = sc.nextDouble();
            double pencilPrice = sc.nextDouble();
            double eraserPrice = sc.nextDouble();
            double priceTotalAll = (penPrice + pencilPrice + eraserPrice);
            double totalPrice = priceTotalAll + 0.18 * priceTotalAll; // 0.18 is multiplied for GST calculations
            System.out.println(totalPrice);
        }
    }
}