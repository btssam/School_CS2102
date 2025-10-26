package wpioo.lecture23.controllers.nogui;

import java.util.HashMap;
import java.util.Map;
import wpioo.lecture23.models.Book;
import wpioo.lecture23.views.nogui.IBookView;

/**
 * This abstract class stores the mapping between book name and {@link Book}s.
 *
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public abstract class AbstractBookController implements IBookController {

    /** View associated with this controller */
    protected IBookView view;

    /** A map that maps book names to {@link Book} objects */
    protected Map<String, Book> books;

    /**
     * A helper constructor for creating a mapping between book name and {@link Book}s.
     */
    public AbstractBookController(IBookView view) {
        this.books = new HashMap<>();
        this.view = view;
    }
}
