public class Largest_String_according_to_lexicographic_order_11_10 {
    public static void main(String args[]) {
        String fruits[] = { "apple", "mango", "banana" };
        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareToIgnoreCase(fruits[i]) < 0) { // also used compareTo() method (here) because it is case sensitive
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}