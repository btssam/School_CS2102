package wpioo.lecture23.controllers.gui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.util.HashMap;
import java.util.Map;
import wpioo.lecture23.models.Book;

/**
 * This creates a controller that uses Java FX application as the view.
 *
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class JavaFXGUIBookController implements IBookGUIController {

    /** A map that maps book names to {@link Book} objects */
    private Map<String, Book> books = new HashMap<>();

    /** Java FX Widgets */
    @FXML
    private Label message;

    @FXML
    private TextField bookName;

    @FXML
    private TextArea bookContent;

    @FXML
    private TextArea frequencyDisplay;

    /**
     * This will handle the adding a book.
     */
    @FXML
    @Override
    public void addBook() {
        this.bookContent.setText("");
        this.frequencyDisplay.setText("");
        if (this.bookName == null || this.bookName.getText().isEmpty()) {
            this.message.setText("Book name is blank!");
        } else {
            String name = this.bookName.getText();

            // Check if book exists
            if (books.containsKey(name)) {
                this.message.setText("Book already exists!");
            } else {
                Book book = new Book(name, this.bookContent.getText());
                books.put(name, book);
            }

            this.bookName.setText("");
        }
    }

    /**
     * This will handle the removing a book.
     */
    @FXML
    @Override
    public void removeBook() {
        this.bookContent.setText("");
        this.frequencyDisplay.setText("");
        if (this.bookName == null || this.bookName.getText().isEmpty()) {
            this.message.setText("Book name is blank!");
        } else {
            String name = this.bookName.getText();

            // Check if book exists
            if (!books.containsKey(name)) {
                this.message.setText("Book doesn't exist!");
            } else {
                books.remove(name);
            }

            this.bookName.setText("");
            this.bookContent.setText("");
        }
    }

    /**
     * This will handle the printing a book.
     */
    @FXML
    @Override
    public void printBook() {
        this.bookContent.setText("");
        this.frequencyDisplay.setText("");
        if (this.bookName == null || this.bookName.getText().isEmpty()) {
            this.message.setText("Book name is blank!");
        } else {
            String name = this.bookName.getText();

            // Check if book exists
            if (!books.containsKey(name)) {
                this.message.setText("Book doesn't exist!");
            } else {
                this.frequencyDisplay.setText(this.books.get(name).getFrequencyWordsBook());
            }

            this.bookName.setText("");
        }
    }
}
