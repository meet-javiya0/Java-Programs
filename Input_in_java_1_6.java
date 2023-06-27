import java.util.*;

public class Input_in_java_1_6 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            // Only takes first word of the input
            String input = sc.next();
            System.out.println(input);

            // takes whole line as an input
            String name = sc.nextLine();
            System.out.println(name);

            // takes number as an input
            int number = sc.nextInt();
            System.out.println(number);

            // takes byte value as an input
            byte b = sc.nextByte();
            System.out.println(b);

            // takes floating value as an input
            float price = sc.nextFloat();
            System.out.println(price);

            // takes double value as an input
            double d = sc.nextDouble();
            System.out.println(d);

            // takes boolean value as an input
            boolean flag = sc.nextBoolean();
            System.out.println(flag);

            // takes short value as an input
            short s = sc.nextShort();
            System.out.println(s);

            // takes long value as an input
            long l = sc.nextLong();
            System.out.println(l);
        }
    }
}