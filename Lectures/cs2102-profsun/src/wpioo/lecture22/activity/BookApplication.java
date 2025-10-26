package wpioo.lecture22.activity;

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
        String userInput = "";

        // TODO: Use the following print statements in our prompt
        // System.out.print("Enter a book name: ");
        // System.err.println("Cannot find a book with that name!");
        // System.out.print("Enter text from the book: ");
        // System.out.println("Added new book: " + book.getBookName() + " with contents: " + book.getBookData());
        // System.out.println("Removed book: " + book.getBookName());
        // System.err.println("Invalid option");

        // Print data to console
        // System.out.println(books.getFrequencyWordsBook());
    }
}
