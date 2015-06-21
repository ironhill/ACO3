package week1.homework;


/**
 * Created by Ihor Samanchuk on 11.06.2015.
 */
public class Book {
    private String bookName;
    private String bookAuthor;
    private int bookReliese;
    /**
    private DateFormat dateformat(String incomeDate) {
        DateFormat SimpleDateFormat("yyyy-MMM-dd") = new ;
        return
    }
     */
    public String asString() {
        return "Book name: " + bookName + " Author: " + bookAuthor + " Year reliese: " + bookReliese;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public void setBookReliese(int bookReliese) {
        this.bookReliese = bookReliese;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public int getBookReliese() {
        return bookReliese;
    }

}
