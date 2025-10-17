class Book {
    String title, author;
    double price;

    double discountedPrice(double discountPercent) {
        return price - (price * discountPercent / 100);
    }

    public static void main(String[] args) {
        Book b = new Book();
        b.title = "Java Programming";
        b.author = "James Gosling";
        b.price = 500.0;

        System.out.println("Price after 10% discount: ₹" + b.discountedPrice(10));
    }
}
