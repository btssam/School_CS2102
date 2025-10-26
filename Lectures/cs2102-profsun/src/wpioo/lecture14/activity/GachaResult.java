package wpioo.lecture14.activity;

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
    public List<Toy> toysReceived;

    /** The number of quarters spent */
    public int quartersSpent;

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
}
