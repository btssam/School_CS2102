package wpioo.lecture23.views.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import wpioo.lecture23.controllers.gui.IBookGUIController;

/**
 * This creates a view using Java Swing and sends any data it receives to its controller.
 *
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class JavaSwingGUIBookView extends JFrame implements ActionListener, IBookGUIView {

    /** Controller associated with this view */
    private IBookGUIController controller;

    /** Constants used by this application */
    private static final int LINES_IN_TEXT_AREAS = 5;
    private static final int LINE_LENGTHS_IN_TEXT_AREAS = 3;
    private static final int ROWS_IN_BUTTON_PANEL_GRID = 1;
    private static final int COLUMNS_IN_BUTTON_PANEL_GRID = 3;
    private static final int FONT_SIZE = 36;
    private static final int ROWS_IN_MESSAGE_PANEL_GRID = 1;
    private static final int COLUMNS_IN_MESSAGE_PANEL_GRID = 1;
    private static final int ROWS_IN_BOOK_NAME_PANEL_GRID = 1;
    private static final int COLUMNS_IN_BOOK_NAME_PANEL_GRID = 2;

    /**
     * Labels
     */
    private JLabel message;

    /**
     * Panels
     */
    private final JPanel messagePanel;
    private final JPanel inputPanel;
    private final JPanel namePanel;
    private final JPanel outputPanel;

    /**
     * Text areas
     */
    private final JTextArea bookContentText, wordFrequencyText;

    /**
     * Text field
     */
    private final JTextField nameField;

    /**
     * Buttons
     */
    private final JButton addBookButton, removeBookButton, printBookButton;

    /**
     * This creates a view object that handles I/O using Java Swing.
     */
    public JavaSwingGUIBookView() {
        // Call super constructor to create the window
        // Pass the title to be used in the top of the window
        super("Java Swing Book GUI Application");

        // A grid layout helps organize our screen
        // this.setLayout(new GridLayout(ROWS_IN_THIS_GRID, COLUMNS_IN_THIS_GRID, 10, 2));
        this.setLayout(new BorderLayout());

        // Set up the GUI widgets --------------------------------------------

        // 1. Panel for any messages for the user
        messagePanel = new JPanel(new GridLayout(ROWS_IN_MESSAGE_PANEL_GRID, COLUMNS_IN_MESSAGE_PANEL_GRID));
        messagePanel.setBorder(BorderFactory.createTitledBorder("Messages: "));
        message = new JLabel("Enter Book Information Below");
        message.setFont(new Font("Verdana", Font.PLAIN, FONT_SIZE));
        messagePanel.add(message);
        this.add(messagePanel, BorderLayout.NORTH);

        // 2. Panel for entering book information
        inputPanel = new JPanel();
        inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.PAGE_AXIS));
        inputPanel.setBorder(BorderFactory.createTitledBorder("Input: "));

        // 2a. Panel for entering book name
        namePanel = new JPanel(new GridLayout(ROWS_IN_BOOK_NAME_PANEL_GRID, COLUMNS_IN_BOOK_NAME_PANEL_GRID));
        namePanel.setBorder(BorderFactory.createTitledBorder("Book Name:"));
        nameField = new JTextField(15);
        namePanel.add(nameField);
        inputPanel.add(namePanel);

        // 2b. Scroll pane for entering book content
        bookContentText = new JTextArea("", LINES_IN_TEXT_AREAS, LINE_LENGTHS_IN_TEXT_AREAS);
        bookContentText.setBorder(BorderFactory.createTitledBorder("Book Content: "));
        bookContentText.setEditable(true);
        bookContentText.setLineWrap(true);
        bookContentText.setWrapStyleWord(true);
        bookContentText.setFont(new Font("Verdana", Font.PLAIN, 16));

        // Create scroll panes for the text areas in case text is long enough to
        // require scrolling in one or both dimensions
        JScrollPane bookContentTextScrollPane = new JScrollPane(bookContentText);
        bookContentTextScrollPane.setBorder(null);
        inputPanel.add(bookContentTextScrollPane);

        // 2c. Create the buttons
        addBookButton = new JButton("Add Book");
        addBookButton.setFont(new Font("Verdana", Font.PLAIN, 16));

        removeBookButton = new JButton("Remove Book");
        removeBookButton.setFont(new Font("Verdana", Font.PLAIN, 16));

        printBookButton = new JButton("Print Book");
        printBookButton.setFont(new Font("Verdana", Font.PLAIN, 16));

        // Create a button panel organized using grid layout add the buttons to the button panel,
        // from left to right and top to bottom.
        JPanel buttonPanel = new JPanel(new GridLayout(ROWS_IN_BUTTON_PANEL_GRID, COLUMNS_IN_BUTTON_PANEL_GRID));
        buttonPanel.add(addBookButton);
        buttonPanel.add(removeBookButton);
        buttonPanel.add(printBookButton);
        inputPanel.add(buttonPanel);

        this.add(inputPanel, BorderLayout.CENTER);

        // 3. Panel for entering book information
        outputPanel = new JPanel();
        outputPanel.setLayout(new BoxLayout(outputPanel, BoxLayout.PAGE_AXIS));
        outputPanel.setBorder(BorderFactory.createTitledBorder("Output: "));

        // 3. Scroll pane for displaying word frequency
        wordFrequencyText = new JTextArea("", LINES_IN_TEXT_AREAS, LINE_LENGTHS_IN_TEXT_AREAS);
        wordFrequencyText.setBorder(BorderFactory.createTitledBorder("Word Frequency: "));
        wordFrequencyText.setEditable(false);
        wordFrequencyText.setLineWrap(true);
        wordFrequencyText.setWrapStyleWord(true);
        wordFrequencyText.setFont(new Font("Verdana", Font.PLAIN, FONT_SIZE));

        // Create scroll panes for the text areas in case text is long enough to
        // require scrolling in one or both dimensions
        JScrollPane wordFrequencyTextScrollPane = new JScrollPane(wordFrequencyText);
        wordFrequencyTextScrollPane.setBorder(null);
        outputPanel.add(wordFrequencyTextScrollPane);

        this.add(outputPanel, BorderLayout.SOUTH);

        // Set up the observers ----------------------------------------------

        // 4. Register this object as the observer for all GUI events
        addBookButton.addActionListener(this);
        removeBookButton.addActionListener(this);
        printBookButton.addActionListener(this);

        // Start the main application window --------------------------------

        // 5. Make sure the main window is appropriately sized for the widgets in it, that it exits this program when
        // closed, and that it becomes visible to the user now
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    /**
     * Invoked when an action occurs.
     *
     * @param e
     *            the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        /*
         * Set cursor to indicate computation on-going; this matters only if processing the event might take a
         * noticeable amount of time as seen by the user
         */
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));

        /*
         * Determine which event has occurred that we are being notified of by this callback; in this case, the source
         * of the event (i.e, the widget calling actionPerformed) is all we need because only buttons are involved here,
         * so the event must be a button press; in each case, tell the controller to do whatever is needed to update the
         * model and to refresh the view
         */
        Object source = e.getSource();
        if (source.equals(addBookButton)) {
            controller.addBook(); // Callback method for adding a book
        } else if (source.equals(removeBookButton)) {
            controller.removeBook(); // Callback method for removing a book
        } else if (source.equals(printBookButton)) {
            controller.printBook(); // Callback method for printing a book
        }

        /*
         * Set the cursor back to normal (because we changed it at the beginning of the method body)
         */
        this.setCursor(Cursor.getDefaultCursor());
    }

    /**
     * This method adds a controller, so the view can inform it has received information.
     *
     * @param c
     *            the Controller object
     */
    @Override
    public void setController(IBookGUIController c) {
        this.controller = c;
    }

    /**
     * This method retrieves the name of the book
     *
     * @return the book name provided by the user
     */
    @Override
    public String getBookName() {
        return nameField.getText();
    }

    /**
     * This method retrieves the contents of the book
     *
     * @return the book data provided by the user
     */
    @Override
    public String getBookContents() {
        return bookContentText.getText();
    }

    /**
     * This method retrieves the next choice option.
     *
     * @return Next option as a string
     */
    @Override
    public String getNextOption() {
        throw new UnsupportedOperationException("Not Used!");
    }

    /**
     * This method prints a message to the user.
     *
     * @param s
     *            the message to provide to the user
     */
    @Override
    public void printToUser(String s) {
        message.setText(s);
        message.setFont(new Font("Verdana", Font.PLAIN, FONT_SIZE));
    }

    /**
     * This method prints an error message to the user.
     *
     * @param s
     *            the message to provide to the user
     */
    @Override
    public void printErrorToUser(String s) {
        message.setText("Error: " + s);
        message.setFont(new Font("Verdana", Font.ITALIC, FONT_SIZE));
    }

    /**
     * This method displays the book's name.
     *
     * @param bookName
     *            name of the book
     */
    @Override
    public void displayBookName(String bookName) {
        nameField.setText(bookName);
    }

    /**
     * This method displays the book's contents.
     *
     * @param bookData
     *            contents of the book
     */
    @Override
    public void displayBookContents(String bookData) {
        bookContentText.setText(bookData);
    }

    /**
     * This method displays the book's word frequency table.
     *
     * @param bookWordsFrequencyTable
     *            string representation of words frequency table of the book
     */
    @Override
    public void displayBookWordsFreqTable(String bookWordsFrequencyTable) {
        if (bookWordsFrequencyTable != null) {
            wordFrequencyText.setText(bookWordsFrequencyTable);
        } else {
            wordFrequencyText.setText("");
        }
    }

    /**
     * This method ask to see if the user would like to enter another book information.
     *
     * @return whether or not the user would like to enter more contents about a book
     */
    @Override
    public boolean getAnotherBook() {
        throw new UnsupportedOperationException("Not Used!");
    }
}
