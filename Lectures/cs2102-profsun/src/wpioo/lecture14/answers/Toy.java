package wpioo.lecture14.answers;

/**
 * This class stores information about a toy.
 *
 * @author Prof. Matthew Ahrens
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class Toy implements Comparable<Toy> {

    /** Toy's name */
    private String name;

    /**
     * Toy's rarity 0 - common ~ 10 - ultra-rare SSS+
     */
    private int rarity;

    /**
     * This stores information related to a toy.
     *
     * @param name
     *            Toy's name
     * @param rarity
     *            Toy's rarity
     */
    public Toy(String name, int rarity) {
        this.name = name;

        // Make sure our rarity is between 0 and 10 (both inclusive)
        if (rarity < 0) {
            rarity = 0;
        } else if (rarity > 10) {
            rarity = 10;
        }
        this.rarity = rarity;
    }

    /**
     * This method implements {@link Comparable#compareTo(Object)} to compare two toys.
     * <p>
     * <b>Note</b>: If you implement {@code compareTo}, then you can use {@code List.sort(...)}
     *
     * @param o
     *            the object to be compared.
     *
     * @return < 0 if this toy has a less rarity than the other toy, > 0 if it has more, 0 if it is the same rarity.
     */
    @Override
    public int compareTo(Toy o) {
        // Uses the Integer class' compare method, where it returns:
        // * < 0 if this.rarity < o.rarity
        // * > 0 if this.rarity > o.rarity
        // * = 0 if this.rarity == o.rarity
        return Integer.compare(this.rarity, o.rarity);
    }

    /**
     * This method overrides the {@link Object#equals(Object)} method for this class.
     *
     * @param o
     *            Another object
     *
     * @return {@code true} if {@code o} is-a {@link Toy} and has the same information, {@code false} otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (o instanceof Toy t) {
            return t.name.equals(this.name) && t.rarity == this.rarity;
        }

        return false;
    }

    /**
     * This method overrides the {@link Object#toString()} method for this class.
     *
     * @return A string of the format: "name: grade"
     */
    @Override
    public String toString() {
        return String.format("%s[%d]", this.name, this.rarity);
    }
}
