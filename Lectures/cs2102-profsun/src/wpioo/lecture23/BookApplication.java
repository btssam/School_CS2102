package wpioo.lecture23;

import java.util.Map;
import wpioo.lecture23.controllers.nogui.CommandLineController;
import wpioo.lecture23.controllers.nogui.FileBookController;
import wpioo.lecture23.controllers.nogui.IBookController;
import wpioo.lecture23.views.nogui.CommandLineBookView;
import wpioo.lecture23.views.nogui.FileBookView;
import wpioo.lecture23.views.nogui.IBookView;

/**
 * A class that has I/O logic to read and store word frequencies from a given book. This application allows the data to
 * be entered using command-line or from a file and uses {@link Map}s to store the data.
 *
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class BookApplication {

    /**
     * The main entry point to the program.
     *
     * @param args
     *            Command line arguments
     */
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("USAGE: java BookApplication <ViewType>");
            System.err.println("View Types: 0 for Command-Line, 1 for File");
        } else {
            int viewType = Integer.parseInt(args[0]);
            if (viewType < 0 || viewType > 1) {
                System.err.println("Invalid View Type: " + viewType + "\n");
                System.err.println("USAGE: java BookApplication <ViewType>");
                System.err.println("View Types: 0 for Command-Line, 1 for File");
            } else {
                IBookView view;
                IBookController controller;
                if (viewType == 0) {
                    // This uses the command-line view
                    view = new CommandLineBookView();
                    controller = new CommandLineController(view);
                } else {
                    // This uses the file I/O
                    view = new FileBookView();
                    controller = new FileBookController(view);
                }

                // Run the application
                view.setController(controller);
                controller.processBook();
            }
        }
    }
}
