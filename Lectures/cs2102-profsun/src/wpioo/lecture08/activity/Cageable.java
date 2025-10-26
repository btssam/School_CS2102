package wpioo.lecture08.activity;

/**
 * An interface for all cageable animals.
 *
 * @author Prof. Matthew Ahrens
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public interface Cageable {

    /**
     * Computes whether this animal can fit in a cage
     *
     * @param exhibitSideLength
     *            with a square side length
     *
     * @return true if the animal fits
     */
    public boolean fitInExhibit(int exhibitSideLength);

    /**
     * Retrieves the animal's name
     *
     * @return A string representation of the name
     */
    public String name();
}
