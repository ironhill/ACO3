package week1.homework;

/**
 * Created by Ihor Samanchuk on 13.06.2015.
 */
public class SchoolLibrary {

    private Book[] booksList = new Book[15];
    private ReaderPerson[] readersList = new ReaderPerson[4];
    private int[] blackList = new int[readersList.length - 1];
    private Book[] readersTakeBooks = new Book[3];
    private int blackListCounter;
    private int bookListCounter;

    private String bookAsSring(Book bookName) {
        return "Book name: " + bookName.getBookName() + " Author: " + bookName.getBookAuthor() + " Year Reliase: " + bookName.getBookReliese();
    }

    private String readerAsSring(ReaderPerson readerName) {
        return "Reader name: " + readerName.getName() + " Reader Surename: " + readerName.getSureName() + " Readers ID Card: " + readerName.getIdDoc();
    }

    //Prints full readers list
    public void readersListPrint() {
        for (int i = 0; i < readersList.length; i++) {
            if (readersList[i] != null) {
                System.out.print(readerAsSring(readersList[i]) + '\n');
            }
        }
    }

    //Prints list of available books
    public void printBooksAvailList() {
        for (int i = 0; i < bookListCounter; i++) {
                System.out.println(bookAsSring(booksList[i]));
        }
    }

    //Prints all books which readers taken
    public void printReadersTotalListBooks(Book[] readersTotalListBooks) {
        for (int i = 0; i < readersTotalListBooks.length; i++) {
            if (readersTotalListBooks[i] != null) {
                System.out.println(readersTotalListBooks[i]);
            }
        }
    }

    public void addBooktoBookList(Book bookToAdd) {
        booksList[bookListCounter] = bookToAdd;
        bookListCounter++;
    }

    //Adds reader to readers list
    private int readersListCounter;

    public void addreadersList(ReaderPerson reader) {
        readersList[readersListCounter] = reader;
        readersListCounter++;
    }

    //Adds reader to black list
    public void addReaderToBlackList(int reader) {
        blackList[blackListCounter] = reader;
        blackListCounter++;
    }

    //Reader take the book
    public void readerTakesBook(String bookName) {
        for (int i = 0; i < booksList.length; i++) {
            if (booksList[i].getBookName().equals(bookName)) {
                readersTakeBooks[i] = booksList[i];
                booksList[i] = null;
            }
        }
    }

    //Books in reader

    public void printReadersBooks(int reader) {
        for (int i = 0; i < readersTakeBooks.length; i++)
            if (readersTakeBooks[i] != null) {
                System.out.println(bookAsSring(readersTakeBooks[i]));
            }
    }

    //boolean Check reader in black list returns true if success
    public boolean blackListReader(int IDReader) {
        for (int i = 0; i < blackList.length; i++) {
            if (blackList[i] == IDReader) {
                System.out.println("You in black list");
            }
        }
        return true;
    }

    //Shows all books by the author
    public void bookByAuthor(String author) {
        for (int i = 0; i < booksList.length; i++) {
            if (booksList[i] != null && booksList[i].getBookAuthor().equals(author)) {
                System.out.println("Book name by autir: " + booksList[i].getBookName());
            }
        }
    }

    //Show new books younger then 2013
    public void printNewBooks() {
        for (int i = 0; i < booksList.length; i++) {
            if (booksList[i] != null && booksList[i].getBookReliese() > 2013) {
                System.out.println(booksList[i].getBookName());
            }
        }
    }


}
