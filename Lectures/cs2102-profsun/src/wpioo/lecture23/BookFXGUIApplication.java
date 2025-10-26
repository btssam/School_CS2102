package wpioo.lecture23;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

/**
 * This application allows the book data to be entered using Java FX application.
 *
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class BookFXGUIApplication extends Application {

    /**
     * The start method for Java FX applications.
     *
     * @param stage
     *            A stage
     */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(BookFXGUIApplication.class.getResource("bookAppFX.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("JavaFX Book GUI Application");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * The main entry point to the program.
     *
     * @param args
     *            Command line arguments
     */
    public static void main(String[] args) {
        launch();
    }
}
