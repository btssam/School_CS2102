package wpioo.lecture23.views.nogui;

import java.util.Scanner;
import wpioo.lecture23.controllers.nogui.IBookController;

/**
 * This creates a view that reads/writes from/to the command-line and sends it to its controller.
 *
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class CommandLineBookView implements IBookView {

    /** Object to read from command-line */
    private Scanner cmLine;

    /** Controller associated with this view */
    private IBookController controller;

    /**
     * This creates a view that uses the command-line.
     */
    public CommandLineBookView() {
        cmLine = new Scanner(System.in);
    }

    /**
     * This method adds a controller, so the view can inform it has received information.
     *
     * @param c
     *            the Controller object
     */
    @Override
    public void setController(IBookController c) {
        this.controller = c;
    }

    /**
     * This method retrieves the name of the book
     *
     * @return the book name provided by the user
     */
    @Override
    public String getBookName() {
        System.out.println("Enter a book name: ");
        return cmLine.nextLine();
    }

    /**
     * This method retrieves the contents of the book
     *
     * @return the book data provided by the user
     */
    @Override
    public String getBookContents() {
        System.out.println("Enter text from the book: ");
        return cmLine.nextLine();
    }

    /**
     * This method retrieves the next choice option.
     *
     * @return Next option as a string
     */
    @Override
    public String getNextOption() {
        return cmLine.nextLine();
    }

    /**
     * This method prints a message to the user.
     *
     * @param s
     *            the message to provide to the user
     */
    @Override
    public void printToUser(String s) {
        System.out.println(s);
    }

    /**
     * This method prints an error message to the user.
     *
     * @param s
     *            the message to provide to the user
     */
    @Override
    public void printErrorToUser(String s) {
        System.err.println(s);
    }

    /**
     * This method displays the book's name.
     *
     * @param bookName
     *            name of the book
     */
    @Override
    public void displayBookName(String bookName) {
        System.out.println("Book: " + bookName);
    }

    /**
     * This method displays the book's contents.
     *
     * @param bookData
     *            string representation of words frequency table of the book
     */
    @Override
    public void displayBookContents(String bookData) {
        System.out.println(bookData);
    }

    /**
     * This method displays the book's word frequency table.
     *
     * @param bookWordsFrequencyTable
     *            words frequency table of the book
     */
    @Override
    public void displayBookWordsFreqTable(String bookWordsFrequencyTable) {
        System.out.println(bookWordsFrequencyTable);
    }

    /**
     * This method ask to see if the user would like to enter another book information.
     *
     * @return whether or not the user would like to enter more contents about a book
     */
    @Override
    public boolean getAnotherBook() {
        System.out.println("Do you want to enter another book? (Y/N)");
        String choice = cmLine.nextLine();
        return choice.charAt(0) == 'Y';
    }
}
