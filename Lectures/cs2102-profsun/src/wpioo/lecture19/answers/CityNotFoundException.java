package wpioo.lecture19.answers;

/**
 * This class is a new kind of {@link Exception} for handling missing cities.
 *
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class CityNotFoundException extends Exception {

    /**
     * This creates a new exception with a message
     *
     * @param msg
     *            Error message
     */
    public CityNotFoundException(String msg) {
        super(msg);
    }
}
