package wpioo.lecture08.answers;

/**
 * A class that implements {@link Cageable} that is used to store information about a boa.
 *
 * @author Prof. Matthew Ahrens
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class Boa implements Cageable {

    /** The name of the boa */
    public String name;

    /** The length of the boa in inches */
    public int length;

    /** the favorite food of the boa */
    public String favFood;

    /** whether the boa is huggable */
    public boolean isHuggable;

    /**
     * Constructs a boa
     *
     * @param name
     *            Boa's name
     * @param length
     *            Boa's length
     * @param favFood
     *            Boa's favorite food
     * @param isHuggable
     *            Whether this boa is huggable
     */
    public Boa(String name, int length, String favFood, boolean isHuggable) {
        this.name = name;
        this.length = length;
        this.favFood = favFood;
        this.isHuggable = isHuggable;
    }

    /**
     * Computes whether this boa can fit in a cage
     *
     * @param exhibitSideLength
     *            with a square side length
     *
     * @return true if the boa fits
     */
    @Override
    public boolean fitInExhibit(int exhibitSideLength) {
        return this.length < 4 * exhibitSideLength;
    }

    /**
     * Retrieves the boa's name
     *
     * @return A string representation of the name
     */
    @Override
    public String name() {
        return this.name;
    }
}
