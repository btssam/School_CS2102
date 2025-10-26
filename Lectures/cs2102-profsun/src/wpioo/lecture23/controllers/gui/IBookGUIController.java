package wpioo.lecture23.controllers.gui;

import wpioo.lecture23.views.gui.IBookGUIView;

/**
 * This interface is the controller that partners with {@link IBookGUIView}.
 *
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public interface IBookGUIController {

    /**
     * This will handle the adding a book.
     */
    void addBook();

    /**
     * This will handle the removing a book.
     */
    void removeBook();

    /**
     * This will handle the printing a book.
     */
    void printBook();

}
