public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Book unknownBook = new Book();
        unknownBook.displayDetails();

        Book hp1Book = new Book("Harry Potter and the Philosopher\'s Stone", "J.K. Rowling", 350.00);
        hp1Book.displayDetails();

        hp1Book.updatePrice(32000.00);
        hp1Book.displayDetails();

        hp1Book.applyDiscount(50);
        hp1Book.displayDetails();
    }
}