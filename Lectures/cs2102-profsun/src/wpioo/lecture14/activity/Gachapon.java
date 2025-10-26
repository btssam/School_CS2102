package wpioo.lecture14.activity;

import java.util.LinkedList;
import java.util.List;

/**
 * This class stores information about a Gachapon machine (@see
 * <a href="https://en.wikipedia.org/wiki/Gashapon">Gashapon</a>).
 *
 * @author Prof. Matthew Ahrens
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class Gachapon {

    /** A list of toys received */
    private List<Toy> toys;

    /** Number of quarters currently loaded */
    private int quartersLoaded = 0;

    /** Constant: Number of quarters per toy */
    public static final int QUARTERS_PER_TOY = 2;

    /**
     * This stores information related to a Gachapon machine.
     *
     * @param toys
     *            List of toys in this machine
     */
    public Gachapon(List<Toy> toys) {
        this.toys = toys; // Encapsulation error!!!!
    }

    /**
     * This method fills the Gachapon with additional toys that can be distributed.
     *
     * @param toys
     *            A list of additional {@link Toy}s that can be distributed
     *
     * @return {@code this} for the purposes of chaining.
     */
    public Gachapon refillToyBin(List<Toy> toys) {
        this.toys.addAll(toys);

        return this;
    }

    /**
     * This loads the machine with another quarter.
     *
     * @return {@code this} for the purposes of chaining.
     */
    public Gachapon loadQuarter() {
        this.quartersLoaded++;

        return this;
    }

    /**
     * This loads the machine with lots of quarters. Note {@code howMany} cannot be negative.
     *
     * @return {@code this} for the purposes of chaining.
     */
    public Gachapon loadQuarter(int howMany) {
        // Avoid adding negative amounts
        if (howMany >= 0) {
            this.quartersLoaded += howMany;
        }

        return this;
    }

    /**
     * This refunds the quarters in the machine.
     *
     * @return The number of quarters
     */
    public int refundQuarters() {
        int quartersToRefund = this.quartersLoaded;
        this.quartersLoaded = 0;

        return quartersToRefund;
    }

    /**
     * This returns a list of toys extracted from the machine.
     *
     * @return A list of {@link Toy}s.
     */
    public List<Toy> receiveToys() {
        LinkedList<Toy> toysToReceive = new LinkedList<>();

        // Prints a helpful error message when we don't have enough quarters to buy a toy
        if (quartersLoaded < QUARTERS_PER_TOY) {
            System.err.println("Not enough quarters");
        }

        // Remove toys from the Gachapon until we run out of quarters
        for (int i = quartersLoaded; i >= QUARTERS_PER_TOY && !toys.isEmpty(); i = i - QUARTERS_PER_TOY) {
            toysToReceive.add(toys.remove(0));
        }

        return toysToReceive;
    }
}
