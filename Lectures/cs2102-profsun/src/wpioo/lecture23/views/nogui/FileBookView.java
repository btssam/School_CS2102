package wpioo.lecture23.views.nogui;

import java.io.*;
import java.util.Scanner;
import wpioo.lecture23.controllers.nogui.IBookController;

/**
 * This creates a view that reads/writes from/to the file and sends it to its controller.
 *
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class FileBookView implements IBookView {

    /** Object to read from command-line */
    private Scanner cmLine;

    /** Controller associated with this view */
    private IBookController controller;

    /**
     * This creates a view that uses file I/O.
     */
    public FileBookView() {
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
        StringBuilder bookData = new StringBuilder();
        try {
            // File I/O
            String filename;
            FileInputStream inFS = null;
            Scanner fileReader = null;

            // Read in data from file
            System.out.println("Enter a filename: ");
            filename = cmLine.nextLine();
            try {
                inFS = new FileInputStream(filename); // Throws an exception
                fileReader = new Scanner(inFS);

                // Read until there are no more lines left
                while (fileReader.hasNextLine()) {
                    bookData.append(fileReader.nextLine());
                }
            } catch (FileNotFoundException e) {
                System.err.println("Could not find file: " + filename + " for reading in data.");
            } finally {
                // Closing the Scanner should close FileInputStream
                if (fileReader != null) {
                    fileReader.close();
                } else {
                    // If we have an issue creating the Scanner object,
                    // but was able to create the FileInputStream, then we
                    // need to close it.
                    if (inFS != null) {
                        inFS.close(); // Ensure file is closed!
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Something went wrong when opening/closing a file.");
        }

        return bookData.toString();
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
     *            contents of the book
     */
    @Override
    public void displayBookContents(String bookData) {
        try {
            // File I/O
            String filename = "";
            FileOutputStream outFS = null;
            PrintWriter fileWriter = null;

            // Save data to a file
            try {
                outFS = new FileOutputStream("output.txt"); // Throws an exception
                fileWriter = new PrintWriter(outFS);
                fileWriter.println(bookData);
                fileWriter.flush(); // Very important: Need to "flush" all the data from the buffer!
            } catch (FileNotFoundException e) {
                System.err.println("Could not find file: " + filename + " to output data.");
            } finally {
                // Closing the PrintWriter should close FileOutputStream
                if (fileWriter != null) {
                    fileWriter.close();
                } else {
                    // If we have an issue creating the PrintWriter object,
                    // but was able to create the FileOutputStream, then we
                    // need to close it.
                    if (outFS != null) {
                        outFS.close(); // Ensure file is closed!
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Something went wrong when opening/closing a file.");
        }
    }

    /**
     * This method displays the book's word frequency table.
     *
     * @param bookWordsFrequencyTable
     *            string representation of words frequency table of the book
     */
    @Override
    public void displayBookWordsFreqTable(String bookWordsFrequencyTable) {
        try {
            // File I/O
            String filename = "";
            FileOutputStream outFS = null;
            PrintWriter fileWriter = null;

            // Save data to a file
            try {
                outFS = new FileOutputStream("output.txt"); // Throws an exception
                fileWriter = new PrintWriter(outFS);

                // Save all data from the map to the file
                fileWriter.println(bookWordsFrequencyTable);

                fileWriter.flush(); // Very important: Need to "flush" all the data from the buffer!
            } catch (FileNotFoundException e) {
                System.err.println("Could not find file: " + filename + " to output data.");
            } finally {
                // Closing the PrintWriter should close FileOutputStream
                if (fileWriter != null) {
                    fileWriter.close();
                } else {
                    // If we have an issue creating the PrintWriter object,
                    // but was able to create the FileOutputStream, then we
                    // need to close it.
                    if (outFS != null) {
                        outFS.close(); // Ensure file is closed!
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Something went wrong when opening/closing a file.");
        }
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
