public class OOPs_Practice_13_Q8 {
    public static void main(String args[]) {
        System.out.print(Book.count + " ");
        Book b1 = new Book(150);
        Book b2 = new Book(250);
        System.out.println(Book.count); // it prints the value of count because static keyword is used
    }
}

class Book {
    int price;
    static int count;

    public Book(int price) {
        this.price = price;
        count++;
    }
}