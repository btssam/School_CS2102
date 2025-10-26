package wpioo.lecture22.answers;

import java.util.*;

/**
 * A class that has I/O logic to read and store word frequencies from a given book. This application allows the data to
 * be entered using command-line and uses {@link Map}s to store the data.
 *
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class BookApplication {

    /**
     * The main entry point to the program.
     *
     * @param args
     *            Command line arguments
     */
    public static void main(String[] args) {
        // Book-related
        Map<String, Book> books = new HashMap<>();
        String bookName = "";
        String bookData = "";

        // Command-line I/O
        Scanner cmLine = new Scanner(System.in);

        // TODO: Write a while loop for creating a menu of options
        // Main Loop Options:
        // 1. [q]uit
        // 2. [a]dd book:
        // ----- prompt for the book name
        // ----- prompt for contents of the book
        // 3. [r]emove book
        // ----- prompt for the book name
        // 4. [p]rint frequency table for a book
        // ----- prompt for the book name
        System.out.println("Do you want to [a]dd book, [r]emove book, [p]rint frequency table for a book, or [q]uit?");
        String userInput = cmLine.nextLine();
        while (userInput.charAt(0) != 'q') {
            if (userInput.charAt(0) == 'a') {
                System.out.print("Enter a book name: ");
                bookName = cmLine.nextLine();
                if (books.containsKey(bookName)) {
                    System.err.println("Book already exits!");
                } else {
                    System.out.print("Enter text from the book: ");
                    bookData = cmLine.nextLine();

                    Book book = new Book(bookName, bookData);
                    books.put(bookName, book);
                    System.out
                            .println("Added new book: " + book.getBookName() + " with contents: " + book.getBookData());
                }
            } else if (userInput.charAt(0) == 'r') {
                System.out.print("Enter a book name: ");
                bookName = cmLine.nextLine();
                if (!books.containsKey(bookName)) {
                    System.err.println("Cannot find a book with that name!");
                } else {
                    Book book = books.remove(bookName);
                    System.out.println("Removed book: " + book.getBookName());
                }
            } else if (userInput.charAt(0) == 'p') {
                System.out.print("Enter a book name: ");
                bookName = cmLine.nextLine();
                if (!books.containsKey(bookName)) {
                    System.err.println("Cannot find a book with that name!");
                } else {
                    // Print data to console
                    System.out.println(books.get(bookName).getFrequencyWordsBook());
                }
            } else {
                System.err.println("Invalid option");
            }

            System.out.println(
                    "Do you want to [a]dd book, [r]emove book, [p]rint frequency table for a book, or [q]uit?");
            userInput = cmLine.nextLine();
        }
    }
}
