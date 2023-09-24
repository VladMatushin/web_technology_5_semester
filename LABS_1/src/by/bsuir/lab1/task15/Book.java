package by.bsuir.lab1.task15;

public class Book {
    private String title;
    private String author;
    private int price;
    private static int edition;

    public Book(String title) {
        this.title = title;
    }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int hashCode() {

        return 23 * title.hashCode() + 59 * author.hashCode() + Integer.valueOf(price).hashCode() * 97 + 6598;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null) {
            return false;
        }
        if (!(obj instanceof by.bsuir.lab1.task12.Book)) {
            return false;
        }
        if (obj.hashCode() != hashCode()) {
            return false;
        }

        Book book = (Book) obj;
        boolean result = this.title.equals(book.title) && this.author.equals(book.author) && this.price == book.price;
        return result;
    }

    @Override
    public String toString() {
        return "Book title: " + title + " Author: " + author + " Price: " + price + " Edition: " + edition;
    }
}
