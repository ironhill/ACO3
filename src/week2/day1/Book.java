package week2.day1;

/**
 * Created by Ihor Samanchuk on 15.06.2015.
 */
public class Book {
    private String title;
    private String author;
    private int id;
    private static int bookCounter;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        id = ++bookCounter;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", id=" + id +
                '}';
    }

    public static int getBookCounter() {
        return bookCounter;
    }
}
