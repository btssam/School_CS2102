package wpioo.lecture23.controllers.nogui;

import wpioo.lecture23.views.nogui.IBookView;

/**
 * This interface is the controller that partners with {@link IBookView}.
 *
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public interface IBookController {

    /**
     * This will handle the processing of a book.
     */
    void processBook();

}
