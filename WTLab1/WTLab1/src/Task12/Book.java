package Task12;

public class Book implements Comparable<Book>{
    private String title;
    private String author;
    private int price;
    private static int edition;
    private int isbn = 0;

    static {
        edition = 0;
    }

    public Book(String title, String author, int price, int edition) {
        this.author = author;
        this.price = price;
        this.title = title;
    }

    public Book(String title, String author, int price, int edition, int isbn) {
        this.author = author;
        this.price = price;
        this.title = title;
        this.isbn = isbn;
    }

    public int getEdition() {
        return edition;
    }

    public int getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getIsbn() {
        return isbn;
    }

    public String toString() {
        return "Title: " + title + "; Author: " + author + "; Price: " + price + "; Isbn: " + isbn ;
    }

    public boolean equals(Object object){
        if (object == null) {
            return false;
        } else if (this == object) {
            return true;
        } else if (getClass() != object.getClass()) {
            return false;
        }

        Book book = (Book) object;
        return (!title.equals(book.title) || !author.equals(book.author) || price != book.getPrice() || edition != book.getEdition());
    }

    public int hashCode() {
        final int prime = 16;
        int result = 1;

        result = prime * result + price;
        result = prime * result + edition;
        result = prime * result + author.hashCode();
        result = prime * result + title.hashCode();

        return result;
    }

    public int compareTo(Book anotherBook) {
        return isbn - anotherBook.getIsbn();
    }

    protected Object clone() {
        return new Book(title, author, price, edition);
    }
}