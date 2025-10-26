package wpioo.lecture08.answers;

/**
 * A class that implements {@link Cageable} that is used to store information about a tiger.
 *
 * @author Prof. Matthew Ahrens
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class Tiger implements Cageable {

    /** Tiger's name */
    public String name;

    /**
     * Constructs a tiger
     *
     * @param name
     *            Tiger's name
     */
    public Tiger(String name) {
        this.name = name;
    }

    /**
     * Computes whether this tiger can fit in a cage
     *
     * @param exhibitSideLength
     *            with a square side length
     *
     * @return true if the tiger fits
     */
    @Override
    public boolean fitInExhibit(int exhibitSideLength) {
        return true;
    }

    /**
     * Retrieves the tiger's name
     *
     * @return A string representation of the name
     */
    @Override
    public String name() {
        return this.name;
    }
}
