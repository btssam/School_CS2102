package wpioo.lecture08.answers;

import java.util.LinkedList;
import java.util.List;

/**
 * A class that models a zoo.
 *
 * @author Prof. Matthew Ahrens
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class Zoo {

    /** A list of cageable animals */
    public List<Cageable> animals;

    /**
     * Constructs a new zoo with some animals.
     *
     * @param animals
     *            A list of cageable animals
     */
    public Zoo(List<Cageable> animals) {
        this.animals = animals;
    }

    /**
     * Produces the list of animals that fit in the Exhibit
     *
     * @param exhibitSideLength
     *            assuming a square exhibit enclosure
     *
     * @return the list of animals that fit in the exhibit.
     */
    public List<String> allThatFit(int exhibitSideLength) {
        List<String> fit = new LinkedList<>();
        for (Cageable animal : this.animals) {
            if (animal.fitInExhibit(exhibitSideLength)) {
                fit.add(animal.name());
            }
        }
        return fit;
    }
}
