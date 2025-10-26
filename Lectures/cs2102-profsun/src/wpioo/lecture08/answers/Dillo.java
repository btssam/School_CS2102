package wpioo.lecture08.answers;

/**
 * A class that implements {@link Cageable} that is used to store information about a dillo.
 *
 * @author Prof. Matthew Ahrens
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class Dillo implements Cageable {

    /* Dillo's id */
    public int id;

    /* Dillo's length */
    public int length;

    /* Whether the Dillo is rolled up */
    public boolean isRolledUp;

    /**
     * Constructs a dillo
     *
     * @param id
     *            Dillo's id
     * @param length
     *            Dillo's length
     * @param isRolledUp
     *            Whether this dillo is rolled up
     */
    public Dillo(int id, int length, boolean isRolledUp) {
        this.id = id;
        this.length = length;
        this.isRolledUp = isRolledUp;
    }

    /**
     * Computes whether this dillo can fit in a cage
     *
     * @param exhibitSideLength
     *            with a square side length
     *
     * @return true if the dillo fits
     */
    @Override
    public boolean fitInExhibit(int exhibitSideLength) {
        if (this.isRolledUp) {
            // Dillo is half its size when rolled up
            return (this.length / 2) < exhibitSideLength;
        } else {
            return this.length < exhibitSideLength;
        }
    }

    /**
     * Retrieves the dillo's name
     *
     * @return A string representation that includes the dillo's id.
     */
    @Override
    public String name() {
        return String.format("Dillo#%d", this.id);
    }
}
