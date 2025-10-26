package wpioo.lecture23.views.nogui;

import wpioo.lecture23.controllers.nogui.IBookController;

/**
 * This interface specific the functionality required by the view for our book application program. The view does not do
 * any sort of input validation, it just interacts with the user.
 *
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public interface IBookView {

    /**
     * This method adds a controller, so the view can inform it has received information.
     *
     * @param c
     *            the Controller object
     */
    void setController(IBookController c);

    /**
     * This method retrieves the name of the book
     *
     * @return the book name provided by the user
     */
    String getBookName();

    /**
     * This method retrieves the contents of the book
     *
     * @return the book data provided by the user
     */
    String getBookContents();

    /**
     * This method retrieves the next choice option.
     *
     * @return Next option as a string
     */
    String getNextOption();

    /**
     * This method prints a message to the user.
     *
     * @param s
     *            the message to provide to the user
     */
    void printToUser(String s);

    /**
     * This method prints an error message to the user.
     *
     * @param s
     *            the message to provide to the user
     */
    void printErrorToUser(String s);

    /**
     * This method displays the book's name.
     *
     * @param bookName
     *            name of the book
     */
    void displayBookName(String bookName);

    /**
     * This method displays the book's contents.
     *
     * @param bookData
     *            contents of the book
     */
    void displayBookContents(String bookData);

    /**
     * This method displays the book's word frequency table.
     *
     * @param bookWordsFrequencyTable
     *            string representation of words frequency table of the book
     */
    void displayBookWordsFreqTable(String bookWordsFrequencyTable);

    /**
     * This method ask to see if the user would like to enter another book information.
     *
     * @return whether or not the user would like to enter more contents about a book
     */
    boolean getAnotherBook();
}
