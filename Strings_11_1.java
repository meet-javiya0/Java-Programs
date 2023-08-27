public class Strings_11_1 {
    public static void main(String args[]) {
        // Strings are IMMUTABLE in java
        char arr[] = { 'a', 'b', 'c', 'd' };
        String str = "abcd";
        String str1 = new String("xyz");
        System.out.println(arr);
        System.out.println(str);
        System.out.println(str1);
    }
}