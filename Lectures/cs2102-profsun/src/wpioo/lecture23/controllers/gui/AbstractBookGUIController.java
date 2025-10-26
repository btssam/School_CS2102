package wpioo.lecture23.controllers.gui;

import java.util.HashMap;
import java.util.Map;
import wpioo.lecture23.models.Book;
import wpioo.lecture23.views.gui.IBookGUIView;

/**
 * This abstract class stores the mapping between book name and {@link Book}s.
 *
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public abstract class AbstractBookGUIController implements IBookGUIController {

    /** View associated with this controller */
    protected IBookGUIView view;

    /** A map that maps book names to {@link Book} objects */
    protected Map<String, Book> books;

    /**
     * A helper constructor for creating a mapping between book name and {@link Book}s.
     */
    public AbstractBookGUIController(IBookGUIView view) {
        this.books = new HashMap<>();
        this.view = view;
    }
}
