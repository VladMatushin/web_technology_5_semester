package by.bsuir.lab1.task14;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int price;
    private static int edition;
    private int isbn;

    public Book(String title, int isbn) {
        this.title = title;
        this.isbn = isbn;
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
        if (!(obj instanceof Book)) {
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
        return "Book title: " + title + "  ISBN: " + isbn;
    }

    @Override
    public int compareTo(Book o) {
        return this.isbn-o.isbn;
    }
}
