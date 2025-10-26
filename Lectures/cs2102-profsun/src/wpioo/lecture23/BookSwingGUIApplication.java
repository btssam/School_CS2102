package wpioo.lecture23;

import wpioo.lecture23.controllers.gui.IBookGUIController;
import wpioo.lecture23.controllers.gui.JavaSwingGUIBookController;
import wpioo.lecture23.views.gui.IBookGUIView;
import wpioo.lecture23.views.gui.JavaSwingGUIBookView;

/**
 * This application allows the book data to be entered using Java Swing application.
 *
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class BookSwingGUIApplication {

    /**
     * The main entry point to the program.
     *
     * @param args
     *            Command line arguments
     */
    public static void main(String[] args) {
        IBookGUIView view = new JavaSwingGUIBookView();
        IBookGUIController controller = new JavaSwingGUIBookController(view);
        view.setController(controller);
    }
}
