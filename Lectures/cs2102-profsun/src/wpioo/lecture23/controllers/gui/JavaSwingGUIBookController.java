package wpioo.lecture23.controllers.gui;

import wpioo.lecture23.models.Book;
import wpioo.lecture23.views.gui.IBookGUIView;

/**
 * This creates a controller that uses Java Swing application as the view.
 *
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class JavaSwingGUIBookController extends AbstractBookGUIController implements IBookGUIController {

    /**
     * This creates a controller that handles all the logic involving Java Swing GUI.
     *
     * @param view
     *            View associated with this controller.
     */
    public JavaSwingGUIBookController(IBookGUIView view) {
        super(view);
    }

    /**
     * This will handle the adding a book.
     */
    @Override
    public void addBook() {
        String bookName = view.getBookName();

        // Check if it is valid book name
        if (!bookName.isEmpty()) {
            // Check to see if we have a book with the same name
            if (books.containsKey(bookName)) {
                view.printErrorToUser("Book already exist!");
            } else {
                // Add book content
                String bookContent = view.getBookContents();
                books.put(bookName, new Book(bookName, bookContent));
                view.displayBookName("");
                view.displayBookContents("");
                view.displayBookWordsFreqTable(null);
                view.printToUser("Added book: " + bookName);
            }
        } else {
            view.printErrorToUser("The book name cannot be blank!");
        }
    }

    /**
     * This will handle the removing a book.
     */
    @Override
    public void removeBook() {
        String bookName = view.getBookName();

        // Check if it is valid book name
        if (!bookName.isEmpty()) {
            // Check to see if we have a book with the same name
            if (books.containsKey(bookName)) {
                books.remove(bookName);
                view.displayBookName("");
                view.displayBookContents("");
                view.displayBookWordsFreqTable(null);
                view.printToUser("Removed book: " + bookName);
            } else {
                view.printErrorToUser("Book does not exist!");
            }
        } else {
            view.printErrorToUser("The book name cannot be blank!");
        }
    }

    /**
     * This will handle the printing a book.
     */
    @Override
    public void printBook() {
        String bookName = view.getBookName();

        // Check if it is valid book name
        if (!bookName.isEmpty()) {
            // Check to see if we have a book with the same name
            if (books.containsKey(bookName)) {
                Book book = books.get(bookName);
                view.displayBookName(book.getBookName());
                view.displayBookContents(book.getBookData());
                view.displayBookWordsFreqTable(book.getFrequencyWordsBook());
                view.printToUser("Displaying word frequency for book: " + bookName);
            } else {
                view.printErrorToUser("Book does not exist!");
            }
        } else {
            view.printErrorToUser("The book name cannot be blank!");
        }
    }
}
