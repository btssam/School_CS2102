package wpioo.lecture23.controllers.nogui;

import wpioo.lecture23.models.Book;
import wpioo.lecture23.views.nogui.IBookView;

/**
 * This creates a controller that uses file I/O as the view.
 *
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class FileBookController extends AbstractBookController implements IBookController {

    /**
     * This creates a controller that handles all the logic involving file I/O.
     *
     * @param view
     *            View associated with this controller.
     */
    public FileBookController(IBookView view) {
        super(view);
    }

    /**
     * This will handle the processing of a book.
     */
    @Override
    public void processBook() {
        view.printToUser("Do you want to [a]dd book, [r]emove book, [p]rint frequency table for a book, or [q]uit?");
        String userInput = view.getNextOption();
        while (userInput.charAt(0) != 'q') {
            if (userInput.charAt(0) == 'a') {
                // Add book here
                String name = view.getBookName();
                String contents = view.getBookContents();
                Book book = new Book(name, contents);

                // Add book into book map
                books.put(name, book);
            } else if (userInput.charAt(0) == 'r') {
                // Remove a book from map
                String name = view.getBookName();
                if (books.containsKey(name)) {
                    books.remove(name);
                } else {
                    view.printErrorToUser("Cannot find a book with that name!");
                }
            } else if (userInput.charAt(0) == 'p') {
                // Print book's frequency
                String name = view.getBookName();
                if (books.containsKey(name)) {
                    view.displayBookName(name);
                    view.displayBookWordsFreqTable(books.get(name).getFrequencyWordsBook());
                } else {
                    view.printErrorToUser("Cannot find a book with that name!");
                }
            } else {
                // Invalid option
                view.printErrorToUser("Invalid option");
            }

            view.printToUser(
                    "Do you want to [a]dd book, [r]emove book, [p]rint frequency table for a book, or [q]uit?");
            userInput = view.getNextOption();
        }
    }
}
