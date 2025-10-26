package wpioo.lecture09.activity;

/**
 * This class implements {@link ISalaried} for a secretary in a law firm. This class is a modified version from
 * <i>Building Java Programs</i> by Stuart Reges and Marty Stepp.
 *
 * @author Prof. Matthew Ahrens
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class Secretary {

    /**
     * Prints a message that states the secretary can take dictation.
     *
     * @param text
     *            Text to be dictated.
     */
    public void takeDictation(String text) {
        System.out.println("Taking dictation of text: " + text);
    }
}
