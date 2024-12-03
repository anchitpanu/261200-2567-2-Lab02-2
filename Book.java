class Book {
    String title;
    String author;
    double price;

    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        // TODO: Complete the rest of this constructor.
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price + "\n");
        // TODO: Complete the rest of this method.
    }

    public void updatePrice(double newPrice) {
        price = newPrice;
    }

    public void applyDiscount(double discount) {
        if (discount > 0 && discount < 100) {
            price = price - (price * (discount/100));
            System.out.println("*** Get " + discount + " % off ***");
        } else {
            System.out.println("!!! Discount is incorrect !!!");
        }
    }
}
