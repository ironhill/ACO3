package week1.homework;

import java.util.Scanner;

/**
 * Created by Ihor Samanchuk on 11.06.2015.
 */
public class LibraryWork {
    public static void main(String[] args) {
        int inputAttempts = 0;
        Book book = new Book();
        ReaderPerson reader = new ReaderPerson();
        SchoolLibrary libsLocal = new SchoolLibrary();
        while (inputAttempts <= 10) {
            Scanner scan = new Scanner(System.in);
            showMainMenu();
            System.out.println("Input your choice");
            int inputValue = scan.nextInt();
            if (inputValue == 1) {
                libsLocal.readersListPrint();
            } else if (inputValue == 2) {
                System.out.println("List of available books: ");
                libsLocal.printBooksAvailList();
            } else if (inputValue == 3) {
                Book newBook = new Book();
                System.out.println("Input book name: ");
                newBook.setBookName(scan.next());
                System.out.println("Input author");
                newBook.setBookAuthor(scan.next());
                System.out.println("Input release year");
                newBook.setBookReliese(scan.nextInt());
                libsLocal.addBooktoBookList(newBook);
            } else if (inputValue == 4) {
                System.out.println("Input reader name: ");
                reader.setName(scan.next());
                System.out.println("Input reader Surename: ");
                reader.setSureName(scan.next());
                System.out.println("Input reader ID Number: ");
                reader.setIdDoc(scan.nextInt());
                libsLocal.addreadersList(reader);
            } else if (inputValue == 5) {
                System.out.println("Input readers ID Card number: ");
                int cardNumber = scan.nextInt();
                if (cardNumber == reader.getIdDoc()) {
                    System.out.println("You can take 3 books");
                    System.out.println("Input book name");
                    String takeBook = scan.next();
                    libsLocal.readerTakesBook(takeBook);
                }
            } else if (inputValue == 6) {
                System.out.println("Input reader ID document");
                int readerID = scan.nextInt();
                libsLocal.printReadersBooks(readerID);

            } else if (inputValue == 7) {

            } else if (inputValue == 8) {
                System.out.println("Input readers ID ");
                int readrsID = scan.nextInt();
                libsLocal.addReaderToBlackList(readrsID);

            } else if (inputValue == 9) {
                System.out.println("Pease input author name: ");
                String authName = scan.next();
                libsLocal.bookByAuthor(authName);

            } else if (inputValue == 10) {
                libsLocal.printNewBooks();
            }
            inputAttempts++;
        }
    }

    private static void showMainMenu() {
        System.out.println("===================================================="
                + '\n' + "Press 1 to show readers list" + '\n' + "Press 2 to show all available books" + '\n' + "Press 3 to add book to library"
                + '\n' + "Press 4 to add reader to list" + '\n' + "Press 5 to give the book to reader" + '\n' + "Press 6 to show which books are in readers"
                + '\n' + "Press 7 to show books in current reader" + '\n' + "Press 8 to add reader to blacklist" + '\n' + "Press 9 to show authors book"
                + '\n' + "Press 10 to show new books younger 2013 year" + '\n' + "====================================================" + '\n');
    }
}
