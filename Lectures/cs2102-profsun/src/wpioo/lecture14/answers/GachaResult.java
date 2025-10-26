package wpioo.lecture14.answers;

import java.util.ArrayList;
import java.util.List;

/**
 * This class stores information about the results from using the Gachapon machine (@see
 * <a href="https://en.wikipedia.org/wiki/Gashapon">Gashapon</a>).
 *
 * @author Prof. Matthew Ahrens
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class GachaResult {

    /** A list of toys received */
    private List<Toy> toysReceived;

    /** The number of quarters spent */
    private int quartersSpent;

    /**
     * This stores the result from using a Gachapon machine.
     *
     * @param toysReceived
     *            The list of {@link Toy}s received
     * @param quartersSpent
     *            The number of quarters spent from using the machine
     */
    public GachaResult(List<Toy> toysReceived, int quartersSpent) {
        this.toysReceived = new ArrayList<>(toysReceived);
        this.quartersSpent = quartersSpent;
    }

    /**
     * Return the list of toys won by playing the Gachapon machine.
     *
     * @return A list of {@link Toy}s.
     */
    public List<Toy> getToysReceived() {
        return this.toysReceived;
    }

    /**
     * Return the number of quarters spent on the Gachapon machine.
     *
     * @return Number of quarters
     */
    public int getQuartersSpent() {
        return this.quartersSpent;
    }
}
